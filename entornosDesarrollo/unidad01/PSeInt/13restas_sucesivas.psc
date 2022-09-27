Algoritmo restas_sucesivas
	
	// Dados dos números enteros, realizar el algoritmo que calcule el cociente y el resto mediante restas sucesivas.
	
	Definir dividendo Como Entero
	Definir divisor Como Entero
	Definir cociente Como Entero
	Definir resto Como Entero
	Definir i Como Entero
	
	dividendo = 0
	divisor = 0
	cociente = 0
	resto = 0
	i = 0
	
	Escribir "Introduce el dividendo."
	Leer dividendo
	
	Escribir "Introduce el divisor."
	Leer divisor
	
	Repetir
		cociente = dividendo - divisor * i
		
		i = i + 1
	Hasta Que cociente < 0
	
	Escribir cociente
	
	
FinAlgoritmo
