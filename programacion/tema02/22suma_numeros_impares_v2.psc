Algoritmo suma_numeros_impares
	// Suma todos los n�meros impares que hay entre 1 y 20 mostrando el resultado al final.
	// Generaliza luego este ejercicio para dos n�meros cualquiera pedidos por teclado, deber� ir del menor al mayor.
	
	Definir suma Como Entero
	Definir numero_inicial Como Entero
	Definir numero_final Como Entero
	
	suma = 0
	numero_inicial = 0
	numero_final = 0
	
	Escribir "Introduce el n�mero inicial."
	Leer numero_inicial
	
	Escribir "Introduce el n�mero final."
	Leer numero_final
	
	Para i<-numero_inicial Hasta numero_final Con Paso 2 Hacer
		
		suma = suma + i
	Fin Para
	
	Escribir suma
	
FinAlgoritmo
