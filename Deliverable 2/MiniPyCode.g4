grammar MiniPyCode;

prog:	stmt* EOF;
stmt: assignment | comp_stmt;

expr:	expr ('+'|'-'|'*'|'/'|'%') expr
	| BOOL | INT | VARNAME | DOUBLE | STRING | list;
assignment: VARNAME ('=' | '+=' | '-=' | '*='| '/=' | '%=') expr endExpr;
endExpr: ';' | ;

comp_stmt: if_stmt;
if_stmt: 'if' condition ':' assignment+ ('elif' condition ':' assignment+)* ('else' ':' assignment+)?;

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
// Allows STRING to contain any character except quotes or backslashes.
STRING: ('"' (~["\\])* '"') | ('\'' (~['\\])* '\'');

WS:	[ \t\r\n]+ -> skip;
