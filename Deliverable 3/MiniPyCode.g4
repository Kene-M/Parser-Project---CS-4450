grammar MiniPyCode;

tokens {
	INDENT,
	DEDENT
}

prog: (NEWLINE | stmt)* EOF;
stmt: (comp_stmt | assignment | comment | loop_stmt) NEWLINE*;

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

comp_stmt: if_context;
if_context: if_stmt (elif_stmt)* (else_stmt)?;
if_stmt: 'if' condition ':' block;
elif_stmt: 'elif' condition ':' block;
else_stmt: 'else' ':' block;

loop_stmt: while_stmt | for_stmt ;
while_stmt: 'while' condition ':' block;
for_stmt: 'for' VARNAME 'in' (expr | RANGE) ':' block;

comment: LINE_COMMENT | BLOCK_COMMENT;

block: stmt NEWLINE | NEWLINE INDENT stmt+ DEDENT;


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

list: '[' (expr (',' expr)*)? ']';



BOOL: 'True' | 'False';
INT: '-'? [0-9]+;
DOUBLE: '-'? [0-9]+ '.' [0-9]+;
VARNAME: [a-zA-Z_][a-zA-Z_0-9]*;
STRING: ('"' (~["\r\n\\])* '"') | ('\'' (~['\r\n\\])* '\'');
RANGE : 'range(' INT (',' INT (',' INT)? )? ')';
BLOCK_COMMENT : '\'\'\'' .*? '\'\'\'' -> skip;
LINE_COMMENT : '#' ~[\r\n]* -> skip;

WS: [ \t]+ -> skip;
NEWLINE:
	({self.atStartOfInput()}? WS | ('\r'? '\n' | '\r' | '\f') WS?) {self.onNewLine()};