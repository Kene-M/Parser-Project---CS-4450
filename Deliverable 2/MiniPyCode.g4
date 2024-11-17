***********************************
*********PREVIOUS******************
***********************************
grammar MiniPyCode;

prog:	assignment* EOF;

expr:	expr ('+'|'-'|'*'|'/'|'%') expr
	| BOOL | INT | VARNAME | DOUBLE | STRING | list;
assignment: VARNAME ('=' | '+=' | '-=' | '*='| '/=' | '%=') expr;
endStmt: (NEWLINE INDENT? | EOF);

comp_stmt: if_context;
if_context: if_stmt (elif_stmt)* (else_stmt)?;
if_stmt: 'if' condition ':' (NEWLINE INDENT)? stmt+;
elif_stmt: 'elif' condition ':' (NEWLINE INDENT)? stmt+;
else_stmt: 'else' ':' (NEWLINE INDENT)? stmt+;

condition: condition 'and' condition
	| condition 'or' condition
	| 'not' condition
	| '(' condition ')'
	| comparision;

comparision: expr (comp_op expr)*;
comp_op: '<'|'>'|'=='|'>='|'<='|'<>'|'!='|'in'|'not' 'in'|'is'|'is' 'not';

list: '[' (expr (',' expr)*)? ']';
       
BOOL: 'True' | 'False';
INT:	'-'? [0-9]+;
DOUBLE: '-'? [0-9]+ '.' [0-9]+;
VARNAME: [a-zA-Z_][a-zA-Z_0-9]*;
STRING: ('"' (~["\r\n\\])* '"') | ('\'' (~['\r\n\\])* '\'');

WS:	[ ]+ -> skip;
NEWLINE: ('\r'? '\n')+;
INDENT: '\t';