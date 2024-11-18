from MiniPyCodeLexer import MiniPyCodeLexer
from MiniPyCodeParser import MiniPyCodeParser
from antlr4.Token import CommonToken
from antlr4 import *
import re
import sys
from typing import TextIO

#Code based on https://github.com/antlr/grammars-v4/blob/master/python/python3/Python3/Python3LexerBase.py
class CustomMiniPyCodeLexer(MiniPyCodeLexer):
    '''
    def __init__(self, input_stream):
        super().__init__(input_stream)
        self.indents = [0]  # Stack to keep track of indentation levels
        self.opened = 0  # Tracks unmatched brackets
        self.dedent_tokens = []  # Queue to store pending DEDENT tokens

    def nextToken(self):
    # Emit pending DEDENT tokens
        if self.dedent_tokens:
            return self.dedent_tokens.pop(0)

    # Get the next token
        token = super().nextToken()
        
        if token.type == MiniPyCodeParser.NEWLINE:
        # Strip out empty lines and trailing spaces
            next_char = self._input.LA(1)
            if next_char in ['\r', '\n', '#', -1]:  # Ignore blank lines
                return self.nextToken()

            # Calculate indentation
            spaces = self.getIndentationCount(token.text)
            current_indent = self.indents[-1]

            if spaces > current_indent:
                self.indents.append(spaces)
                return self.createToken(MiniPyCodeParser.INDENT, token.text)
            elif spaces < current_indent:
                while self.indents and self.indents[-1] > spaces:
                    self.indents.pop()
                    self.dedent_tokens.append(self.createToken(MiniPyCodeParser.DEDENT, ""))
                if self.dedent_tokens:
                    return self.dedent_tokens.pop(0)

        return token


    def getIndentationCount(self, text):
        """Converts a string of spaces and tabs to an indentation count."""
        count = 0
        for char in text:
            if char == '\t':
                count += 4  # Assume tabs are 4 spaces
            else:
                count += 1
        return count

    def createToken(self, token_type, text):
        """Helper to create a new token."""
        return CommonToken(self._tokenFactorySourcePair, token_type, self.DEFAULT_TOKEN_CHANNEL, -1, -1)

'''
    NEW_LINE_PATTERN = re.compile('[^\r\n\f]+')
    SPACES_PATTERN = re.compile('[\r\n\f]+')

    def __init__(self, input: InputStream, output: TextIO = sys.stdout):
        super().__init__(input, output)
        self.tokens = []
        self.indents = []
        self.opened = 0
    
    def reset(self):
        self.tokens = []
        self.indents = []
        self.opened = 0
        super().reset()
    
    def emitToken(self, token):
        self._token = token
        self.tokens.append(token)
    
    def nextToken(self):
        # Check if the end-of-file is ahead and there are still some DEDENTS expected.
        if self._input.LA(1) == MiniPyCodeParser.EOF and len(self.indents) != 0:
            # Remove any trailing EOF tokens from our buffer.
            self.tokens = [token for token in self.tokens if token.type != MiniPyCodeParser.EOF]

            # First emit an extra line break that serves as the end of the statement.
            self.emitToken(self.commonToken(MiniPyCodeParser.NEWLINE, '\n'))

            # Now emit as much DEDENT tokens as needed.
            while len(self.indents) != 0:
                self.emitToken(self.createDedent())
                self.indents.pop()

            # Put the EOF back on the token stream.
            self.emitToken(self.commonToken(MiniPyCodeParser.EOF, '<EOF>'))

        next_ = super().nextToken()
        return next_ if len(self.tokens) == 0 else self.tokens.pop(0)

    def createDedent(self):
        return self.commonToken(MiniPyCodeParser.DEDENT, '')

    def commonToken(self, type_: int, text: str):
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
