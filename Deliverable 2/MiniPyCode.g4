grammar MiniPyCode;

@members {
    import sys
    from antlr4 import *

    class PythonLexer(Lexer):
        def __init__(self, input=None, output=sys.stdout):
            super().__init__(input, output)
            self.indents = []            # Stack to track indentation levels
            self.current_indent = 0       # Current indentation level

        def nextToken(self)
            token = super().nextToken()
            # Check for NEWLINE token to handle indentation
            if token.type == self.NEWLINE:
                self.handle_indentation()
            return token

        def handle_indentation(self):
            # Measure leading whitespace on the current line
            whitespace_count = 0
            while self._input.LA(1) == ' ' or self._input.LA(1) == '\t':
                whitespace_count += 1 if self._input.LA(1) == ' ' else 4  # e.g., tab = 4 spaces
                self._input.consume()

            # Determine if we need to emit INDENT or DEDENT tokens
            if whitespace_count > self.current_indent:
                self.emitToken(self.createToken(self.INDENT))
                self.indents.append(whitespace_count)
                self.current_indent = whitespace_count
            elif whitespace_count < self.current_indent:
                while self.indents and self.indents[-1] > whitespace_count:
                    self.indents.pop()
                    self.emitToken(self.createToken(self.DEDENT))
                self.current_indent = whitespace_count

        def createToken(self, tokenType):
            # Create a new token of a specific type
            token = CommonToken(self._tokenFactorySourcePair, tokenType, self.DEFAULT_TOKEN_CHANNEL, -1, -1)
            return token
}

prog:	assignment* EOF;

expr:	expr ('+'|'-'|'*'|'/'|'%') expr
	| BOOL | INT | VARNAME | DOUBLE | STRING | list;
assignment:	VARNAME ('=' | '+=' | '-=' | '*='| '/=' | '%=') expr endExpr;
endExpr: ';' | ;

list: '[' (expr (',' expr)*)? ']';
       
BOOL: 'True' | 'False';
INT:	[0-9]+;
DOUBLE: [0-9]+ '.' [0-9]+;
VARNAME: [a-zA-Z_][a-zA-Z_0-9]*;
// Allows STRING to contain any character except quotes or backslashes.
STRING: ('"' (~["\\])* '"') | ('\'' (~['\\])* '\'');
// STRING: ('"' [a-zA-Z_0-9]* '"') | ('\'' [a-zA-Z_0-9]* '\''); 

INDENT: '<INDENT>';
DEDENT  : '<DEDENT>';
//Composition operators
comp_op
    : '<'
    | '>'
    | '=='
    | '>='
    | '<='
    | '<>'
    | '!='
    | 'in'
    | 'not' 'in'
    | 'is'
    | 'is' 'not'
    ;

COND:  COND 'and' COND
	| COND 'or' COND
	| 'not' COND
	| expr comp_op expr
	;

ifExpr: 'if' COND ':' NEWLINE INDENT exprBlock DEDENT (elifExpr)* (elseExpr)?;

elifExpr: 'elif' COND ':' NEWLINE INDENT exprBlock DEDENT;

elseExpr: 'else' ':' NEWLINE INDENT exprBlock DEDENT;

exprBlock: expr+;

NEWLINE : [\r\n]+; // Match newlines
WS      : [ \t]+ -> channel(HIDDEN);
