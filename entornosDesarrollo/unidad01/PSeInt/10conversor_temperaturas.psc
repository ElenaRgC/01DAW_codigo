Algoritmo conversor_temperaturas
	// Realiza un conversor de grados Centígrados a grados Farenheit.
	// Nuestro algoritmo debe poder hacer la conversión en ambos sentidos.
	
	Definir unidad Como Caracter
	Definir temperatura Como Real
	Definir resultado Como Real
	Definir i Como Entero
	
	Escribir "Introduzca el valor de la temperatura."
	leer temperatura
	
	Escribir "Introduzca F o C como unidad de la temperatura."
	Leer unidad
	
	Si unidad = "F"
		i = 0
	SiNo
		i = 1		
	FinSi
	
	Segun i Hacer
		0:
			resultado = (temperatura - 32) * 5/9
			Escribir temperatura," º" ,unidad, " son ", resultado, " ºC."
		1:
			resultado = (temperatura * 9/5) + 32
			Escribir temperatura, " º", unidad, " son ", resultado, " ºF."
		De Otro Modo:
			Escribir "Introduzca la unidad adecuadamente."
	Fin Segun
	
FinAlgoritmo
