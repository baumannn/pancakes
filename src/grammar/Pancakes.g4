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
    | assignment ';'
    | expr ';'
    ;

assignment
    : ID '=' (ID '=')*  expr
    ;

if_statement
    : 'if' '(' if_expr ')' '{' statement '}' (else_statement)?
    ;
else_statement
    : 'else' '{' statement '}'
    ;

if_expr
    : expr
    ;

expr
	: ID '(' arguments? ')'         #FunCall
    | ID '[' expr ']'               #ArrayIndex
    | '-' expr                      #UnaryNegate
    | '!' expr                      #UnaryNot
    | expr (MULT | DIV ) expr 		#MultDiv
    | expr ('//') expr				#Intdiv
    | expr ( ADD | MINUS) expr      #AddSub
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

T_FLOAT : 'float'; 
T_INT : 'int'; 
T_BOOL : 'boolean'; 
T_STRING : 'string'; 
T_VOID : 'void';

ADD : '+';
MINUS : '-' ;
MULT : '*' ;
DIV : '/';



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
