Algoritmo numeros_menor_mayor
	
	// Dise�a un algoritmo que determine si tres n�meros que pedimos por teclado est�n ordenados de menor a mayor
	// (NO consiste en ordenar, solo indicar si est�n ordenados o no).
	
	Definir numero1 Como Real
	Definir numero2 Como Real
	Definir numero3 Como Real
	
	Escribir "Introduzca el primer n�mero."
	Leer numero1
	Escribir "Introduzca el primer n�mero."
	Leer numero2
	Escribir "Introduzca el primer n�mero."
	Leer numero3
	
	Si numero1 < numero2 Y numero2 < numero3
		Escribir "Los n�meros ", numero1 ", ", numero2, " y " numero3, " est�n ordenados de menor a mayor."
		
	SiNo
		Escribir "Los n�meros ", numero1 ", ", numero2, " y " numero3, " no est�n ordenados de menor a mayor."
	FinSi
	
FinAlgoritmo
