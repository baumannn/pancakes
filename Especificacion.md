#Pancakes

##Introduccion
Llamado asi por el duke bizantino del siglo XV, es un lenguaje de tipos dinamicos, que contiene clases con herencias y output gráfico.



##Especificacion
###Tipos
Los tipos en Pancakes son dinamicos, pueden tomar valores como numeros, strings, listas, boleanos, funciones, o el valor 'null'. 


```js

#Numero
#Puede ser cualquier tipo de numero real, todos se consideran equivalentes
1
1.0
0.0
1.123123
-10
-10.4


#Booleano
true
false

#Cadenas de carácters
"world 'hello' "

#Listas de tipos primitivos
a = [1, 2, 3, 4];
b = [1, 'dos', 3];
c = [j, ]
c.push(a);


#Funciones (por ahora se toman como un tipo)
fun mi_funcion(){
	
	var foo = 3;

	return foo;

}

```

###Estatutos de control

Pancakes tiene cuatro tipos de estatutos de control: if, for, while y do while.

```js

#if
if( mi_cadena.length() % 2 == 0){
	haz_algo();
}

#for
for(i;0;10){

	do_something(i); #pasa el parametro, 0, 1, 2, 3, ... , 8, 9

}

#do
do{
	cont++;
} while (cont < 10)

#while
while(cont > 0){
	cont--;
}


```

###Comentarios

Pancakes tiene dos tipos de comentarios, de linea y de bloque (o multi linea).

```js
#Soy un comentario de linea

/* Soy un comentario
	de bloque
*/

```

###Declaración de variables

Pancakes tiene dos tipos de comentarios, de linea y de bloque (o multi linea).

```js
#Soy un comentario de linea

/* Soy un comentario
	de bloque
*/

```

