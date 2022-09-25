Algoritmo tiene_decimales
	
	// Determinar si un número real introducido por teclado tiene decimales o no.
	
	Definir numero1 Como Real
	
	Escribir "Introduzca un número."
	Leer numero1
	
	Si trunc(numero1) = numero1
		Escribir "Este número no tiene decimales."
		
	SiNo
		Escribir "Este número tiene decimales."
	FinSi
	
	
	
FinAlgoritmo
