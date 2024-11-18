grammar MiniPyCode;

program: stmt* EOF;
stmt: (assignment | comp_stmt | loop_stmt) NEWLINE?;

expr: expr ('+'|'-'|'*'|'/'|'%') expr
    | BOOL | INT | VARNAME | DOUBLE | STRING | list;

assignment: VARNAME ('=' | '+=' | '-=' | '*='| '/=' | '%=') expr;

comp_stmt: if_stmt;

if_stmt: 'if' condition ':' block 
         ('elif' condition ':' block)* 
         ('else' ':' block)?;

block:  (TAB stmt)+;

loop_stmt: while_stmt | for_stmt;

while_stmt: 'while' condition ':' block;

for_stmt: 'for' VARNAME 'in' (expr | RANGE) ':' block;

condition: condition 'and' condition
    | condition 'or' condition
    | 'not' condition
    | '(' condition ')'
    | comparison;

comparison: expr (comp_op expr)*;

comp_op: '<' | '>' | '==' | '>=' | '<=' | '<>' | '!=' | 'in' | 'not' 'in' | 'is' | 'is' 'not';

list: '[' (expr (',' expr)*)? ']';

BOOL: 'True' | 'False';
INT: '-'? [0-9]+;
DOUBLE: '-'? [0-9]+ '.' [0-9]+;
VARNAME: [a-zA-Z_][a-zA-Z_0-9]*;

STRING: ('"' (~["\\])* '"') | ('\'' (~['\\])* '\'');

TAB: [\t]+ ;
NEWLINE : [\r\n];
WS : [ \r\n]+ -> skip;
RANGE : 'range(' INT ',' INT ')' ;
