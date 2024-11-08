grammar MiniPyCode;

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

WS:	[ \t\r\n]+ -> skip;
