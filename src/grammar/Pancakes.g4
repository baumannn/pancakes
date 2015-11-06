grammar Pancakes;

pancakes
    : (fun_declare | var_declare)+
    ;

var_declare
    : type ID ('=' expr)? ';'
    ;

type
    : 'float' | 'int' | 'boolean' | 'string' | 'void' 
    ; 

fun_declare
    : type ID '(' fun_params? ')' block 
    ;

fun_params
    : fun_param (',' fun_param)*
    ;
fun_param
    : type ID
    ;

block
	: '{' statement* '}'
	;

statement
    : block
    | var_declare
    | if_statement
    | 'return' expr? ';' 
    | expr '=' expr ';' 
    | expr ';'
    ;

if_statement
    : 'if' '(' expr ')' '{' statement '}' ('else' '{' statement '')?
    ;

expr
	: ID '(' arguments? ')'
    | expr '[' expr ']'
    | '-' expr
    | '!' expr
    | expr ('*' | '/' | '//') expr
    | expr ('+'|'-') expr
    | expr '==' expr
    | ID
    | INT
    | FLOAT
    | BOOLEAN
    | STRING
    | '(' expr ')'
    ;

arguments 
	: expr (',' expr)*
	;


BOOLEAN : ('true' | 'false');

ID  : LETTER (LETTER | DIGIT)* ;

INT : DIGIT+ ;

FLOAT
	: DIGIT+ '.' DIGIT* 
	| '.' DIGIT+
	;

STRING : '"' (ESC|.)*? '"' ;

fragment
LETTER : [a-zA-Z_] ;

fragment
DIGIT : [0-9] ;

fragment
ESC : '\\"' | '\\\\' ;

//fragment
//ALPHA : [a-zA-Z] ;


WS  : [ \t\n\r]+ -> skip ;

SL_COMMENT
    : '#' .*? '\n' -> skip ;
