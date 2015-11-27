grammar Pancakes;

pancakes
    : (fun_declare | statement)+
    ;

var_declare
    : type ID (EQUAL expr)? ';'
    ;
array_declare
    : type ('[' INT ']')+ ID ';'
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

array_assignment
    : ID ('[' expr close_bracket )+ '='  expr
    ;

assignment
    : ID  '=' (ID '=')*  expr
    ;

block
	: '{' statement* '}'
	;



statement
    : block
    | var_declare
    | array_declare
    | if_statement
    | while_statement
    | do_while_statement
    | return_statement';' // seperate?
    | assignment ';'
    | array_assignment ';'
    | funCall ';'
    | built_in_function ';'
    ;

built_in_function
    : PRINT '(' expr ')' #PrintFunc
    | 'dummy' '(' expr ')' #DummyFunc
    ;

return_statement
    : 'return' expr? 
    ;





if_statement
    : 'if' '(' if_expr ')' block (else_statement)?
    ;
else_statement
    : 'else'  block 
    ;

while_statement
    : 'while' '(' if_expr ')' block
    ;

do_while_statement
    : 'do' block 'while' '(' do_if_expr ')'
    ;

if_expr
    : expr
    ;

do_if_expr
    : expr
    ;

expr
	: funCall                       #DontUseFunCall //get parent instead to use this expr node
    | ID ('[' expr close_bracket)+  #ArrayIndex
    | '-' expr                      #UnaryNegate
    | '!' expr                      #UnaryNot
    | expr (MULT | DIV ) expr 		#MultDiv
    | expr ('//') expr				#Intdiv
    | expr ( ADD | MINUS) expr      #AddSub
    | expr ( LT | GT) expr          #LTGT
    | expr '==' expr                #Equality
    | ID                            #VarRef
    | INT                           #IntConst
    | FLOAT                         #FloatConst
    | BOOLEAN                       #BoolConst
    | STRING                        #StringConst
    | '(' expr ')'                  #Paren
    ;

close_bracket
    : ']'
    ;

funCall
    : ID '(' arguments? ')'
    ;

arguments 
	: expr (',' expr)*
	;


PRINT : 'print';



LT : '<';
GT : '>';

BOOLEAN : ('true' | 'false');

T_FLOAT : 'float'; 
T_INT : 'int'; 
T_BOOL : 'boolean'; 
T_STRING : 'string'; 
T_VOID : 'void';

EQUAL : '=';
ADD : '+' | 'OR';
MINUS : '-' ;
MULT : '*' | 'AND' ;
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
