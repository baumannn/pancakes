grammar Pancakes;

pancakes
	: program
	;

program
	: element*
	;

element
	: var_declaration
	| 'fun' fun_declaration
	| fun_call ';'
	| class_declaration
	| loops
	| conditionals
	| assignments
	| return_statement
	;

var_declaration
	: ('var' ID ('=' ( 'fun' fun_declaration| expression))? (',' ID ('=' ( 'fun' fun_declaration| expression))?)* ';')
	;
	
fun_declaration
	: ID '(' args ')' '{' (element)* '}' 
	;

args
	: /* empty */
	| (fun_arg) (',' fun_arg)*
	;

fun_arg
	: ('ref')? ID
	;
	
fun_call
	: ID '(' params ')'
	| ID '.' fun_call 
	;

params
	: /* empty */
	| (param) (',' param)*
	;

param
	: expression
	| '&' ID
	;

class_declaration
	: 'class' CID (':' CID)? '{' (class_elements)+ '}'
	;
 

class_elements
	: fun_declaration
	| var_declaration
	;

loops
	: for_loop
	| do_while
	| while_loop
	;

for_loop
	: FOR '(' ID ';' NUMBER ';' NUMBER ')' '{' (loop_element)* '}'
	;

loop_element
	: fun_call ';'
	| loops
	| conditionals
	| assignments
	;

do_while
	: 'do' '{' (loop_element)* '}' WHILE '(' expression ')'
	;

while_loop
	: WHILE '(' expression ')' '{' (loop_element)* '}'
	;

conditionals
	: 'if' '(' expression ')' '{' (loop_element | return_statement)* '}' ('else' '{' (loop_element | return_statement)* '}')?
	;


expression
 : '!' expression
 | expression '*' expression
 | expression '/' expression
 | expression '//' expression //floored division
 | expression '%' expression
 | expression '+' expression
 | expression '-' expression
 | expression '>=' expression
 | expression '<=' expression
 | expression '>' expression
 | expression '<' expression
 | expression '==' expression
 | expression '!=' expression
 | expression '&&' expression
 | expression '||' expression
 | value
 | ID
 | '(' expression ')'
 | fun_call
 | class_instantiation
 //| expression '?' expression ':' expression
 //| expression 'in' expression (array contains value)
 ;

class_instantiation
	: 'new' CID '(' params ')'
	;

assignments
	: ID '=' (expression | 'fun' fun_declaration) ';'
	| ID '++' ';'
	| ID '--' ';'
	;


return_statement
	: 'return' expression? ';'
	;

value
	: STRING
	| BOOLEAN
	| NUMBER
	;



WHILE: 'while';

FOR: 'for';

LINE_COMMENT : '#' .*? '\n' -> skip ;

COMMENT : '/*' .*? '*/' -> skip ;

ID: [a-z] (ALPHA | DIGIT | '_') * ;

CID: [A-Z](ALPHA | DIGIT | '_')* ;

STRING: '"' (ESC|.)*? '"' ;

NUMBER
	: DIGIT+ 
	| DIGIT+ '.' DIGIT* 
	| '.' DIGIT+
	;

	
BOOLEAN: ('true' | 'false');


fragment
ESC : '\\"' | '\\\\' ;

fragment
ALPHA : [a-zA-Z] ;

fragment
DIGIT : [0-9] ;

WS : [ \t\n\r]+ -> skip ;
