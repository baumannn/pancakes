grammar Pancakes

root
	: program
	;

program
	: element*
	;

element
	: var_declaration
	| 'fun' fun_declaration
	| fun_call
	| class_declaration
	| loops
	| conditionals
	| assignments
	| comment
	| return_statement
	;

var_declaration
	: ('var' ID ('=' expression)? (',' ID ('=' expression)?)* ';')
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
	: ID '(' params ')' ';'
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
	: for
	| do_while
	| while
	;

for
	: 'for' '(' ID ';' INT ';' INT ')' '{' (loop_element)* '}'
	;

loop_element
	: fun_call
	| loops
	| conditionals
	| assignments
	| comment
	;

do_while
	: 'do' '{' (loop_element)* '}' 'while' '(' cond_expression ')'
	;

while
	: 'while' '(' cond_expression ')' '{' (loop_element)* '}'
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
	: ID '=' expression ';'
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

LINE_COMMENT : '#' .*? '\n' -> skip ;

COMMENT : '/*' .*? '*/' -> skip ;

ID: [a-z] (ALPHA | DIGIT | '_') * ;

CID: [A-Z](ALPHA | DIGIT | '_')* ;

STRING: '"' (ESC|.)*? '"' ;

	
TRUE: "true";
	
FALSE: "false";

fragment
ESC : '\\"' | '\\\\' ;

fragment
ALPHA : [a-zA-Z] ;

fragment
DIGIT : [0-9] ;

