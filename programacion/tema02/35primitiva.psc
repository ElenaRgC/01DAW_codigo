Funcion numerosJugador <- introducirNumeros(cantidadNumeros, valorMaximo)
	Dimension numerosJugador[cantidad_numeros]
	Definir numeroIntroducido Como Entero
	numeroIntroducido = 0
	valorMaximo = 49
	

	Mientras i < cantidadNumeros Hacer
		
		Repetir
			Escribir "Elija un n�mero entre 1 y ", valorMaximo, "."
			Leer numeroIntroducido
			
			estaRepetido = numeroRepetido(apuestaJugador, numeroIntroducido)
			
		Hasta Que !estaRepetido Y numeroIntroducido >= 1 Y numeroIntroducido <= valorMaximo
		
		numerosJugador[i] = numeroIntroducido
		
		i = i + 1
		
	Fin Mientras
	
FinFuncion

Funcion estaRepetido <- numeroRepetido(apuestaJugador, numeroIntroducido)
	Definir estaRepetido Como Logico
	estaRepetido = Falso
	
	Para i<-0 Hasta Longitud(apuestaJugador) Con Paso 1 Hacer
		
		Si apuestaJugador[i] = numeroIntroducido
			estaRepetido = Verdadero
			Escribir "Ha introducido un n�mero repetido."
			
		FinSi
		
	Fin Para
	
FinFuncion

Funcion numerosPremiados <- generarNumeros(cantidadNumeros, valorMaximo) 
	Dimension numerosPremiados[cantidadNumeros]
	
	Mientras i < cantidadNumeros Hacer
		
		numeroAleatorio = Aleatorio(1, valorMaximo)
		
		Mientras j < cantidadNumeros Hacer
			Si numeroAleatorio <> cantidadNumeros[i]
				
			FinSi
			
		FinMientras
		
		i = i + 1
		
	Fin Mientras
	
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