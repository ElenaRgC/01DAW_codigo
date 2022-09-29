Algoritmo conversor_temperaturas
	// Realiza un conversor de grados Centígrados a grados Farenheit.
	// Nuestro algoritmo debe poder hacer la conversión en ambos sentidos.
	
	Definir unidad_temperatura Como Caracter
	Definir valor_temperatura Como Real
	Definir temperatura_convertida Como Real
	Definir i Como Entero
	
	Escribir "Introduzca el valor de la temperatura."
	leer valor_temperatura
	
	Escribir "Introduzca F o C como unidad de la temperatura a convertir."
	Leer unidad_temperatura
	
	Si unidad_temperatura = "F" // Me toca hacer esto porque PSeInt no permite Switch con caracteres.
		i = 1
	FinSi
	Si unidad_temperatura = "C"
		i = 2		
	FinSi
	
	Segun i Hacer
		1:
			temperatura_convertida = (valor_temperatura - 32) * 5/9
			Escribir valor_temperatura," º" ,unidad_temperatura, " son ", temperatura_convertida, " ºC."
			// Break
		2:
			temperatura_convertida = (valor_temperatura * 9/5) + 32
			Escribir valor_temperatura, " º", unidad_temperatura, " son ", temperatura_convertida, " ºF."
			// Break
			
		De Otro Modo:
			Escribir "Introduzca la unidad adecuadamente."
	Fin Segun
	
FinAlgoritmo
