Algoritmo restas_sucesivas
	
	// Dados dos números enteros, realizar el algoritmo que calcule el cociente y el resto mediante restas sucesivas.
	
	Definir dividendo Como Entero
	Definir divisor Como Entero
	Definir cociente Como Entero
	Definir resto Como Entero
	Definir i Como Entero
	Definir j Como Entero
	
	dividendo = 0
	divisor = 0
	cociente = 0
	resto = 0
	i = 0
	j = 0
	
	Escribir "Introduce el dividendo."
	Leer dividendo
	
	Escribir "Introduce el divisor."
	Leer divisor
	
	i = 1
	j = 1
	
	Repetir
		Si i > 0
		i = dividendo - divisor * j
		cociente = cociente + 1
		j = j + 1
		
		Si i = 0 // Un poco redundante
			resto = 0
		FinSi
		
		Si i < 0
			cociente = cociente -1
			resto = -i
		FinSi
		
	FinSi
	
	Hasta Que i <= 0
	
	Escribir "El cociente es ", cociente, "."
	Escribir "El resto es ", resto, "."
	
	
FinAlgoritmo
