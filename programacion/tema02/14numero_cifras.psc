Algoritmo numero_cifras
	//Determinar el n�mero de cifras de un n�mero de, como m�ximo, cinco cifras.
	//Ejemplos: 9560 debe indicar que tiene 4 cifras; -369 tiene 3 cifras.
	
	Definir num1 Como Real // Si lo definimos como entero necesitaremos otra variable m�s.
	Definir cifras Como Entero
	
	Escribir "Introduzca un n�mero."
	Leer num1
	
	
	Repetir
		cifras = cifras + 1
		num1 = num1 / 10
	Hasta Que trunc(num1) / 10 = 0
	
	Escribir num1 * 10^(cifras), " tiene ", cifras, " cifras."
	
FinAlgoritmo