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
	i = 1
	j = 1
	
	Escribir "Introduce el dividendo."
	Leer dividendo
	
	Escribir "Introduce el divisor."
	Leer divisor
	
	Mientras i > 0 Hacer // Cuando i sea menor que cero es que ya me he pasado de restas.
		Si i > 0
			i = dividendo - divisor * j
			cociente = cociente + 1
		FinSi
			
		Si i = 0
			resto = 0 // Si llego justo a cero, significa que no me paso restando y era una división exacta.
		FinSi
			
		Si i < 0
			cociente = cociente - 1 // Hay que restar uno porque ya me he pasado (i < 0)
			resto = dividendo - divisor * (j-1) // Idem ^
		FinSi
		
		j = j + 1
		
	Fin Mientras
	
	Escribir "El cociente es ", cociente, "."
	Escribir "El resto es ", resto, "."
	
	
FinAlgoritmo
