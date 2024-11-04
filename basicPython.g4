grammar basicPython;

prog: EXPR 

expr: assignment |
    expr ('+'|'-'|'*'|'/'|'%') expr |
    (INT | STRING | FLOAT | BOOL | ARRAY)|
    VARNAME;

endExpr: expr '\n';

assignment: VARNAME ('=' | '+=' | '-=' | '*=' | '/=') expr;

VARNAME: [a-zA-Z_]+[a-zA-Z_0-9]*;

var: (INT | STRING | FLOAT | BOOL | ARRAY);

INT: [0-9]+;
STRING: '"' .* '"';
FLOAT: [0-9]+ '.' [0-9]*;
BOOL: True | False;
ARRAY: '[' (var ',')* ']';