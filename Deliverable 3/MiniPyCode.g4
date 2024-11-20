grammar MiniPyCode;

tokens {
	INDENT,
	DEDENT
}

// REMOVE IF USING CustomMiniPyCodeLexer in Driver.py. Dont add any indentation within the braces.
@lexer::members {
import re

NEW_LINE_PATTERN = re.compile('[^\r\n\f]+')
SPACES_PATTERN = re.compile('[\r\n\f]+')

def __init__(self, input: InputStream, output: TextIO = sys.stdout):
    super().__init__(input, output)
    self.tokens = []
    self.indents = []
    self.opened = 0
    self.checkVersion("4.13.2")
    self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
    self._actions = None
    self._predicates = None
        
def reset(self):
    self.tokens = []
    self.indents = []
    self.opened = 0
    super().reset()
        
def emitToken(self, token):
    self._token = token
    self.tokens.append(token)
        
def nextToken(self):
    from MiniPyCodeParser import MiniPyCodeParser

    # Check if the end-of-file is ahead and there are still some DEDENTS expected.
    if self._input.LA(1) == MiniPyCodeParser.EOF and len(self.indents) != 0:
        # Remove any trailing EOF tokens from our buffer.
        #self.tokens = [token for token in self.tokens if token.type != MiniPyCodeParser.EOF]

        # First emit an extra line break that serves as the end of the statement.
        #self.emitToken(self.commonToken(MiniPyCodeParser.NEWLINE, '\n'))

        # Now emit as much DEDENT tokens as needed.
        while len(self.indents) != 0:
            #self.emitToken(self.createDedent())
            self.indents.pop()

        # Put the EOF back on the token stream.
        #self.emitToken(self.commonToken(MiniPyCodeParser.EOF, '<EOF>'))

    next_ = super().nextToken()
    return next_ if len(self.tokens) == 0 else self.tokens.pop(0)

def createDedent(self):
    from MiniPyCodeParser import MiniPyCodeParser

    return self.commonToken(MiniPyCodeParser.DEDENT, '')

def commonToken(self, type_: int, text: str):
    from antlr4.Token import CommonToken

    stop = self.getCharIndex() - 1
    start = stop if text == '' else stop - len(text) + 1
    return CommonToken(self._tokenFactorySourcePair, type_, MiniPyCodeLexer.DEFAULT_TOKEN_CHANNEL, start, stop)

def getIndentationCount(self, whitespace: str):
    count = 0
    for c in whitespace:
        if c == '\t':
            count += 8 - count % 8
        else:
            count += 1
    return count

def atStartOfInput(self):
    return self.getCharIndex() == 0

def openBrace(self):
    self.opened += 1

def closeBrace(self):
    self.opened -= 1

def onNewLine(self):
    from MiniPyCodeParser import MiniPyCodeParser

    new_line = self.NEW_LINE_PATTERN.sub('', self.text)
    spaces = self.SPACES_PATTERN.sub('', self.text)

    # Strip newlines inside open clauses except if we are near EOF. We keep NEWLINEs near EOF to
    # satisfy the final newline needed by the single_put rule used by the REPL.
    next_ = self._input.LA(1)
    next_next = self._input.LA(2)

    if self.opened > 0 or (next_next != -1 and next_ in (10, 13, 35)):
        self.skip()
    else:
        self.emitToken(self.commonToken(MiniPyCodeParser.NEWLINE, new_line))
        indent = self.getIndentationCount(spaces)
        previous = 0 if len(self.indents) == 0 else self.indents[-1]

        if indent == previous:
            self.skip()
        elif indent > previous:
            self.indents.append(indent)
            self.emitToken(self.commonToken(MiniPyCodeParser.INDENT, spaces))
        else:
            while len(self.indents) > 0 and self.indents[-1] > indent:
                self.emitToken(self.createDedent())
                self.indents.pop()
}

prog: (NEWLINE | stmt)* EOF;
stmt: (comp_stmt | assignment | comment) NEWLINE*;

expr:
	expr ('+' | '-' | '*' | '/' | '%') expr
	| BOOL
	| INT
	| VARNAME
	| DOUBLE
	| STRING
	| list;
assignment:
	VARNAME ('=' | '+=' | '-=' | '*=' | '/=' | '%=') expr;

comp_stmt: if_context | while_stmt | for_stmt;
if_context: if_stmt (elif_stmt)* (else_stmt)?;
if_stmt: 'if' condition ':' block;
elif_stmt: 'elif' condition ':' block;
else_stmt: 'else' ':' block;

while_stmt: 'while' condition ':' block;
for_stmt: 'for' VARNAME 'in' (expr | RANGE) ':' block;

block: stmt NEWLINE | NEWLINE INDENT stmt+ DEDENT?;

condition:
	condition 'and' condition
	| condition 'or' condition
	| 'not' condition
	| '(' condition ')'
	| comparision;

comparision: expr (comp_op expr)*;
comp_op:
	'<'
	| '>'
	| '=='
	| '>='
	| '<='
	| '<>'
	| '!='
	| 'in'
	| 'not' 'in'
	| 'is'
	| 'is' 'not';
comment: LINE_COMMENT | BLOCK_COMMENT;

list: '[' (expr (',' expr)*)? ']';

BOOL: 'True' | 'False';
INT: '-'? [0-9]+;
DOUBLE: '-'? [0-9]+ '.' [0-9]+;
VARNAME: [a-zA-Z_][a-zA-Z_0-9]*;
STRING: ('"' (~["\r\n\\])* '"') | ('\'' (~['\r\n\\])* '\'');
RANGE : 'range(' INT (',' INT (',' INT)? )? ')';
BLOCK_COMMENT : (('\'\'\'' .*? '\'\'\'') | ('"""' .*? '"""')) -> skip;
LINE_COMMENT : '#' ~[\r\n]* -> skip;

WS: [ \t]+ -> skip;
NEWLINE:
	({self.atStartOfInput()}? WS | ('\r'? '\n' | '\r' | '\f') WS?) {self.onNewLine()};