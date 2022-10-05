Algoritmo primitiva
	
	// TODO: cambiar el número de apuestas y el intervalo de números por constantes.
	
	Dimension apuesta[6] 
	Dimension premio[6]
	Definir contador Como Entero
	
	// Bucle para los valores introducidos por el usuario.
	Para i <- 1 Hasta 6 Hacer
		
		Escribir "Elija un número entre 1 y 49"
		
		x = 0 // En la primera iteraci?n no ser?a necesario, pero hace falta para poder introducir del segundo valor en adelante.
		Mientras x < 1 O x > 49 Hacer
			Leer x
			Si x < 1 O X > 49 Entonces
				Escribir "Elija un número que se encuentre entre 1 y 49."
			FinSi
		FinMientras
		
		Si i = 1 Entonces
			apuesta[i] = x
		FinSi
		
		Si i > 1 Entonces
			
			apuesta[i] = x
			
			Para j <- 1 Hasta i - 1 Hacer
				
				Si apuesta[j] = x Entonces
					Escribir "No puede elegir dos números iguales."
					
					Mientras x < 1 O x > 49 Hacer
						Leer x
						Si x < 1 O X > 49 Entonces
							Escribir "Elija un número que se encuentre entre 1 y 49."
						FinSi
					FinMientras
					
					apuesta[i] = x
					j = 1 // Tenemos que devolver j al principio o no comparar?a todos los valores del array.
					
				FinSi
				
			FinPara
			
		FinSi
		
	FinPara
	
	
	// Bucle para generar los n?meros premiados.
	Para i <- 1 Hasta 6 Hacer
		
		Si i = 1 Entonces
			
			premio[i] = azar(49) + 1 // Lo hacemos as? porque la m?quina podr?a generar el n?mero 0.
			
		FinSi
		
		Si i > 1 Entonces
			
			premio[i] = azar(49) + 1
			
			Para j <- 1 Hasta i - 1 Hacer
				
				Si premio[j] = x Entonces
					
					Mientras x < 1 O x > 49 Hacer
						
						premio[i] = azar(49) + 1
						
					FinMientras
					
					apuesta[i] = x
					j = 1
					
				FinSi
				
			FinPara
			
		FinSi
		
	FinPara
	
	Escribir "Los números premiados son: "
	
	// Bucle para mostrar al usuario los n?meros premiados.
	Para i <- 1 Hasta 6 Hacer
		
		Escribir premio[i]
		
	FinPara
	
	// Para cada valor que hemos introducido (i) lo comparamos con cada valor generado (j). De esta manera se comparan valores aunque no est?n en la misma posici?n.
	
	Para i <- 1 Hasta 6 Hacer 
		
		Para j <- 1 Hasta 6 Hacer
			
			Si apuesta[i] = premio[j] Entonces 
				
				contador = contador + 1
			FinSi
			
		FinPara
		
	FinPara
	
	Escribir "Tu número de aciertos es: " contador
	
	Si contador = 6 Entonces
		
		Escribir "Enhorabuena, has acertado todos los n?meros."
		
	FinSi
	
FinAlgoritmo