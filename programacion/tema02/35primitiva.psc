Funcion apuestaJugador <- numerosJugador(cantidadNumeros, numeroMaximo)
	Dimension apuestaJugador[cantidad_numeros]
	Definir numeroIntroducido Como Entero
	numeroIntroducido = 0
	numeroMaximo = 49
	

	Mientras i < cantidadNumeros Hacer
		
		Repetir
			Escribir "Elija un número entre 1 y ", numero_maximo, "."
			Leer numeroIntroducido
			
			estaRepetido = numeroRepetido(apuestaJugador, numeroIntroducido)
			
		Hasta Que !estaRepetido Y numeroIntroducido >= 1 Y numeroIntroducido <= numeroMaximo
		
		
	Fin Mientras
	
FinFuncion

Funcion estaRepetido <- numeroRepetido(apuestaJugador, numeroIntroducido)
	Definir estaRepetido Como Logico
	estaRepetido = Falso
	Para i<-0 Hasta Longitud(apuestaJugador) Con Paso 1 Hacer
		Si apuestaJugador[i] = numeroIntroducido
			estaRepetido = Verdadero
		FinSi
	Fin Para
FinFuncion

Algoritmo primitiva
	
	// TODO: Cambiar los if por switch.
	// TODO: Arreglar error números repetidos.
	// TODO: Separar en funciones.
	
	
	Definir cantidad_numeros Como Entero
	cantidad_numeros = 6 // Cantidad de números pedidos y generados. En la primitiva son 6.
	
	numero_maximo = 49 // Número máximo por el que se puede apostar. En la primitiva son 49.
	
	Dimension apuesta[cantidad_numeros] 
	Dimension premio[cantidad_numeros]
	Definir contador Como Entero
	
	// Bucle para los valores introducidos por el usuario.
	Para i <- 1 Hasta cantidad_numeros Hacer
		
		Escribir "Elija un número entre 1 y ", numero_maximo, "."
		
		x = 0 // En la primera iteración no sería necesario, pero hace falta para poder introducir del segundo valor en adelante.
		Mientras x < 1 O x > numero_maximo Hacer
			Leer x
			Si x < 1 O X > numero_maximo Entonces
				Escribir "Elija un número que se encuentre entre 1 y ", numero_maximo, "."
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
					
					Mientras x < 1 O x > numero_maximo Hacer
						Leer x
						Si x < 1 O x > numero_maximo Entonces
							Escribir "Elija un número que se encuentre entre 1 y ", numero_maximo, "."
						FinSi
					FinMientras
					
					apuesta[i] = x
					j = 1 // Tenemos que devolver j al principio o no compararía todos los valores del array.
					
				FinSi
				
			FinPara
			
		FinSi
		
	FinPara
	
	
	// Bucle para generar los números premiados.
	Para i <- 1 Hasta cantidad_numeros Hacer
		
		Si i = 1 Entonces
			
			premio[i] = azar(numero_maximo) + 1 // Lo hacemos así porque la máquina podría generar el número 0.
			
		FinSi
		
		Si i > 1 Entonces
			
			premio[i] = azar(numero_maximo) + 1
			
			Para j <- 1 Hasta i - 1 Hacer
				
				Si premio[j] = x Entonces
					
					Mientras x < 1 O x > numero_maximo Hacer
						
						premio[i] = azar(numero_maximo) + 1
						
					FinMientras
					
					apuesta[i] = x
					j = 1
					
				FinSi
				
			FinPara
			
		FinSi
		
	FinPara
	
	Escribir "Los números premiados son: "
	
	// Bucle para mostrar al usuario los números premiados.
	Para i <- 1 Hasta cantidad_numeros Hacer
		
		Escribir premio[i]
		
	FinPara
	
	// Para cada valor que hemos introducido (i) lo comparamos con cada valor generado (j).
	// De esta manera se comparan valores aunque no estén en la misma posición.
	
	Para i <- 1 Hasta cantidad_numeros Hacer 
		
		Para j <- 1 Hasta cantidad_numeros Hacer
			
			Si apuesta[i] = premio[j] Entonces 
				
				contador = contador + 1
			FinSi
			
		FinPara
		
	FinPara
	
	Escribir "Tu número de aciertos es: " contador
	
	Si contador = cantidad_numeros Entonces
		
		Escribir "Enhorabuena, has acertado todos los números."
		
	FinSi
	
FinAlgoritmo