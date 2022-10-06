Algoritmo numeros_n_m
	// Diseña el programa que pida dos números n y m. Y que muestre todas las combinaciones entre los dos. 
	// 1 1
	// 1 2
	// 1 3
	// 2 1
	// 2 2
	// 2 3
	
	Definir n, m Como Entero
	n = 0
	m = 0
	
	Escribir "Introduzca un número entero."
	Leer n
	Escribir "Introduzca otro número entero."
	Leer m
	
	Escribir "n m"
	
	Para i<-1 Hasta n Con Paso 1 Hacer
		Para j<-1 Hasta m Con Paso 1 Hacer
			Escribir i, " ", j
		Fin Para
	Fin Para
	
	
FinAlgoritmo
