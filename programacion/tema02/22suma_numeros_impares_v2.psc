Algoritmo suma_numeros_impares
	// Suma todos los números impares que hay entre 1 y 20 mostrando el resultado al final.
	// Generaliza luego este ejercicio para dos números cualquiera pedidos por teclado, deberá ir del menor al mayor.
	
	Definir suma Como Entero
	Definir numero_inicial Como Entero
	Definir numero_final Como Entero
	
	suma = 0
	numero_inicial = 0
	numero_final = 0
	
	Escribir "Introduce el número inicial."
	Leer numero_inicial
	
	Escribir "Introduce el número final."
	Leer numero_final
	
	Para i<-numero_inicial Hasta numero_final Con Paso 2 Hacer
		
		suma = suma + i
	Fin Para
	
	Escribir suma
	
FinAlgoritmo
