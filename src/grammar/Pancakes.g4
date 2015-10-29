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
	: ('var' ID ('=' ( ('fun' anon_fun_declaration)| expression))? (',' ID ('=' ( 'fun' anon_fun_declaration| expression))?)* ';')
	;
	
fun_declaration
	: ID '(' args ')' '{' (element)* '}' 
	;

anon_fun_declaration
	: '(' args ')' '{' (element)* '}' 
	;

args
	: /* empty */
	| (fun_arg) (',' fun_arg)*
	;

fun_arg
	: ('ref')? ID indexes?
	;
	
fun_call
	: ID indexes? '(' params ')'
	| ID indexes? '.' fun_call 
	;

params
	: /* empty */
	| (param) (',' param)*
	;

param
	: expression
	| '&' ID indexes?
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
	: For '(' ID ';' Number ';' Number ')' '{' (loop_element)* '}'
	;

loop_element
	: fun_call ';'
	| loops
	| conditionals
	| assignments
	;

do_while
	: 'do' '{' (loop_element)* '}' While '(' expression ')'
	;

while_loop
	: While '(' expression ')' '{' (loop_element)* '}'
	;

conditionals
	: 'if' '(' expression ')' '{' (loop_element | return_statement)* '}' ('else' '{' (loop_element | return_statement)* '}')?
	;


expression
 : '!' expression 
 | expression ( '*' | '/' | '//') expression // '//' is floored division
 | expression ( '+' | '-' ) expression
 | expression ( '>=' | '<=' | '>' | '<' | '==' | '!=' ) expression
 | expression '%' expression
 | expression ( '&&' | '||' ) expression
 | value
 | ID
 | '(' expression ')'
 | fun_call
 | class_instantiation
 | expression indexes+
 //| expression '?' expression ':' expression
 //| expression 'in' expression (array contains value)
 ;

class_instantiation
	: 'new' CID '(' params ')'
	;



assignments
	: ID indexes? '=' (expression | 'fun' fun_declaration) ';'
	| ID indexes? '++' ';'
	| ID indexes? '--' ';'
	;


return_statement
	: 'return' expression? ';'
	;

value
	: String
	| Boolean
	| Number
	;

indexes
	: ('[' expression ']')+
	;

While: 'while';

For: 'for';

Line_comment : '#' .*? '\n' -> skip ;

Comment : '/*' .*? '*/' -> skip ;

ID: [a-z] (Alpha | Digit | '_') * ;

CID: [A-Z](Alpha | Digit | '_')* ;

String: '"' (Esc|.)*? '"' ;

Number
	: Digit+ 
	| Digit+ '.' Digit* 
	| '.' Digit+
	;

	
Boolean: ('true' | 'false');


fragment
Esc : '\\"' | '\\\\' ;

fragment
Alpha : [a-zA-Z] ;

fragment
Digit : [0-9] ;

WS : [ \t\n\r]+ -> skip ;
