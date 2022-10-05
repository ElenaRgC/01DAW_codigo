Funcion apuestaJugador <- numerosJugador(cantidadNumeros, numeroMaximo)
	Dimension apuestaJugador[cantidad_numeros]
	Definir numeroIntroducido Como Entero
	numeroIntroducido = 0
	numeroMaximo = 49
	

	Mientras i < cantidadNumeros Hacer
		
		Repetir
			Escribir "Elija un n�mero entre 1 y ", numero_maximo, "."
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
	// TODO: Arreglar error n�meros repetidos.
	// TODO: Separar en funciones.
	
	
	Definir cantidad_numeros Como Entero
	cantidad_numeros = 6 // Cantidad de n�meros pedidos y generados. En la primitiva son 6.
	
	numero_maximo = 49 // N�mero m�ximo por el que se puede apostar. En la primitiva son 49.
	
	Dimension apuesta[cantidad_numeros] 
	Dimension premio[cantidad_numeros]
	Definir contador Como Entero
	
	// Bucle para los valores introducidos por el usuario.
	Para i <- 1 Hasta cantidad_numeros Hacer
		
		Escribir "Elija un n�mero entre 1 y ", numero_maximo, "."
		
		x = 0 // En la primera iteraci�n no ser�a necesario, pero hace falta para poder introducir del segundo valor en adelante.
		Mientras x < 1 O x > numero_maximo Hacer
			Leer x
			Si x < 1 O X > numero_maximo Entonces
				Escribir "Elija un n�mero que se encuentre entre 1 y ", numero_maximo, "."
			FinSi
		FinMientras
		
		Si i = 1 Entonces
			apuesta[i] = x
		FinSi
		
		Si i > 1 Entonces
			
			apuesta[i] = x
			
			Para j <- 1 Hasta i - 1 Hacer
				
				Si apuesta[j] = x Entonces
					Escribir "No puede elegir dos n�meros iguales."
					
					Mientras x < 1 O x > numero_maximo Hacer
						Leer x
						Si x < 1 O x > numero_maximo Entonces
							Escribir "Elija un n�mero que se encuentre entre 1 y ", numero_maximo, "."
						FinSi
					FinMientras
					
					apuesta[i] = x
					j = 1 // Tenemos que devolver j al principio o no comparar�a todos los valores del array.
					
				FinSi
				
			FinPara
			
		FinSi
		
	FinPara
	
	
	// Bucle para generar los n�meros premiados.
	Para i <- 1 Hasta cantidad_numeros Hacer
		
		Si i = 1 Entonces
			
			premio[i] = azar(numero_maximo) + 1 // Lo hacemos as� porque la m�quina podr�a generar el n�mero 0.
			
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
	
	Escribir "Los n�meros premiados son: "
	
	// Bucle para mostrar al usuario los n�meros premiados.
	Para i <- 1 Hasta cantidad_numeros Hacer
		
		Escribir premio[i]
		
	FinPara
	
	// Para cada valor que hemos introducido (i) lo comparamos con cada valor generado (j).
	// De esta manera se comparan valores aunque no est�n en la misma posici�n.
	
	Para i <- 1 Hasta cantidad_numeros Hacer 
		
		Para j <- 1 Hasta cantidad_numeros Hacer
			
			Si apuesta[i] = premio[j] Entonces 
				
				contador = contador + 1
			FinSi
			
		FinPara
		
	FinPara
	
	Escribir "Tu n�mero de aciertos es: " contador
	
	Si contador = cantidad_numeros Entonces
		
		Escribir "Enhorabuena, has acertado todos los n�meros."
		
	FinSi
	
FinAlgoritmo