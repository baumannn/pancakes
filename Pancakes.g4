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
	: VAL
	| expression '&&' expression
	| expression '||' expression
	| expression '==' expression
	| expression '<=' expression
	| expression '>=' expression
	| expression '<' expression
	| expression '>' expression
	| expression '!=' expression
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
 | VAL
 | ID
 | '(' expression ')'
 | fun_call
 //| expression '?' expression ':' expression
 //| expression 'in' expression (array contains value)
 ;


assignments
	: ID '=' expression ';'
	| ID '++' ';'
	| ID '--' ';'
	;

comment
	: '/*' ANYTHING '*/'
	;

return_statement
	: 'return' expression? ';'
	;


ID

CID

VAL
	
TRUE
	
FALSE

ANYTHING
