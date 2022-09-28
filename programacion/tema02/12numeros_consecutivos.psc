Algoritmo numeros_consecutivos
	// Diseña un algoritmo parecido al anterior en el que se indique si tres números pedidos son consecutivos o no.
	
	Definir numero1 Como Real
	Definir numero2 Como Real
	Definir numero3 Como Real
	
	Escribir "Introduzca el primer número."
	Leer numero1
	Escribir "Introduzca el segundo número."
	Leer numero2
	Escribir "Introduzca el tercer número."
	Leer numero3
	
	// Los valores absolutos nos permiten valorar tanto si los números ascienden como descienden.
	// Si solo usamos la primera y segunda condición; -1, 0 y -1 sería aceptado.
	// Si solo usamos la primera y tercera condición; 0, -1 y 2 sería aceptado.
	// Si solo usamos la segunda y tercera condición; 0, 3 y 2 sería aceptado.
	Si abs(numero1 - numero2) == 1 Y abs(numero2 - numero3) == 1 Y abs(numero1 - numero3) == 2
		Escribir "Los números ", numero1 ", ", numero2, " y " numero3, " son consecutivos."
		
	SiNo
		Escribir "Los números ", numero1 ", ", numero2, " y " numero3, " no son consecutivos."
	FinSi
	
FinAlgoritmo
