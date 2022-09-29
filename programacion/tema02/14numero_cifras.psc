Algoritmo numero_cifras
	//Determinar el número de cifras de un número de, como máximo, cinco cifras.
	//Ejemplos: 9560 debe indicar que tiene 4 cifras; -369 tiene 3 cifras.
	
	Definir num1 Como Real // Si lo definimos como entero necesitaremos otra variable más.
	Definir cifras Como Entero
	
	Escribir "Introduzca un número."
	Leer num1
	
	Repetir
		cifras = cifras + 1
		num1 = num1 / 10
	Hasta Que trunc(num1 / 10) = 0
	
	Escribir redon(num1 * 10^(cifras)), " tiene ", cifras, " cifras."
	// Si hubiera definido otra variable no tendría que hacer tantas cuentas aquí.
	// ¿Qué sería más óptimo?
	// Probablemente solo devolver el número de cifras.
	// Si hubiera una función div en PSeInt sería posible.
	
FinAlgoritmo
