grammar Pancakes;

pancakes
    : (fun_declare | var_declare)+
    ;

var_declare
    : type ID ('=' expr)? ';'
    ;

type
    : T_FLOAT | T_INT | T_BOOL | T_STRING | T_VOID 
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
	: ID '(' arguments? ')'         #FunCall
    | expr '[' expr ']'             #ArrayIndex
    | '-' expr                      #UnaryNegate
    | '!' expr                      #UnaryNot
    | expr ('*' | '/') expr 		#MultDiv
    | expr ('//') expr				#Intdiv
    | expr ('+'|'-') expr           #AddSub
    | expr '==' expr                #Equality
    | ID                            #VarRef
    | INT                           #IntConst
    | FLOAT                         #FloatConst
    | BOOLEAN                       #BoolConst
    | STRING                        #StringConst
    | '(' expr ')'                  #Paren
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

T_FLOAT : 'float'; 
T_INT : 'int'; 
T_BOOL : 'boolean'; 
T_STRING : 'string'; 
T_VOID : 'void';

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
