Algoritmo conversor_temperaturas
	// Realiza un conversor de grados Cent�grados a grados Farenheit.
	// Nuestro algoritmo debe poder hacer la conversi�n en ambos sentidos.
	
	Definir unidad_temperatura Como Caracter
	Definir valor_temperatura Como Real
	Definir temperatura_convertida Como Real
	Definir i Como Entero
	
	Escribir "Introduzca el valor de la temperatura."
	leer valor_temperatura
	
	Escribir "Introduzca F o C como unidad de la temperatura."
	Leer unidad_temperatura
	
	Si unidad = "F" // Me toca hacer esto porque PSeInt no permite Switch con caracteres.
		i = 1
	FinSi
	Si unidad = "C"
		i = 2		
	FinSi
	
	Segun i Hacer
		1:
			resultado = (valor_temperatura - 32) * 5/9
			Escribir temperatura," �" ,unidad_temperatura, " son ", temperatura_convertida, " �C."
		2:
			resultado = (valor_temperatura * 9/5) + 32
			Escribir calor_temperatura, " �", unidad_temperatura, " son ", temperatura_convertida, " �F."
		De Otro Modo:
			Escribir "Introduzca la unidad adecuadamente."
	Fin Segun
	
FinAlgoritmo
