Algoritmo numeros_menor_mayor
	
	// Diseña un algoritmo que determine si tres números que pedimos por teclado están ordenados de menor a mayor
	// (NO consiste en ordenar, solo indicar si están ordenados o no).
	
	Definir numero1 Como Real
	Definir numero2 Como Real
	Definir numero3 Como Real
	
	Escribir "Introduzca el primer número."
	Leer numero1
	Escribir "Introduzca el primer número."
	Leer numero2
	Escribir "Introduzca el primer número."
	Leer numero3
	
	Si numero1 < numero2 Y numero2 < numero3
		Escribir "Los números ", numero1 ", ", numero2, " y " numero3, " están ordenados de menor a mayor."
		
	SiNo
		Escribir "Los números ", numero1 ", ", numero2, " y " numero3, " no están ordenados de menor a mayor."
	FinSi
	
FinAlgoritmo
