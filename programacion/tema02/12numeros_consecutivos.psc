Algoritmo numeros_consecutivos
	// Dise�a un algoritmo parecido al anterior en el que se indique si tres n�meros pedidos son consecutivos o no.
	
	Definir numero1 Como Real
	Definir numero2 Como Real
	Definir numero3 Como Real
	
	Escribir "Introduzca el primer n�mero."
	Leer numero1
	Escribir "Introduzca el segundo n�mero."
	Leer numero2
	Escribir "Introduzca el tercer n�mero."
	Leer numero3
	
	// Los valores absolutos nos permiten valorar tanto si los n�meros ascienden como descienden.
	// Si solo usamos la primera y segunda condici�n; -1, 0 y -1 ser�a aceptado.
	// Si solo usamos la primera y tercera condici�n; 0, -1 y 2 ser�a aceptado.
	// Si solo usamos la segunda y tercera condici�n; 0, 3 y 2 ser�a aceptado.
	Si abs(numero1 - numero2) == 1 Y abs(numero2 - numero3) == 1 Y abs(numero1 - numero3) == 2
		Escribir "Los n�meros ", numero1 ", ", numero2, " y " numero3, " son consecutivos."
		
	SiNo
		Escribir "Los n�meros ", numero1 ", ", numero2, " y " numero3, " no son consecutivos."
	FinSi
	
FinAlgoritmo
