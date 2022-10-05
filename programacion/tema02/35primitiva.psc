Funcion numerosJugador <- introducirNumeros(cantidadNumeros, valorMaximo)
	Dimension numerosJugador[cantidad_numeros]
	Definir numeroIntroducido Como Entero
	numeroIntroducido = 0
	valorMaximo = 49
	

	Mientras i < cantidadNumeros Hacer
		
		Repetir
			Escribir "Elija un n�mero entre 1 y ", valorMaximo, "."
			Leer numeroIntroducido
			
			estaRepetido = numeroRepetido(apuestaJugador, numeroIntroducido, i)
			
			Si estaRepetido
				Escribir "Ha introducido un n�mero que ya hab�a elegido."
			FinSi
			
		Hasta Que !estaRepetido Y numeroIntroducido >= 1 Y numeroIntroducido <= valorMaximo
		
		numerosJugador[i] = numeroIntroducido
		
		i = i + 1
		
	Fin Mientras
	
FinFuncion

Funcion numerosPremiados <- generarNumeros(cantidadNumeros, valorMaximo) 
	Dimension numerosPremiados[cantidadNumeros]
	
	Mientras i < cantidadNumeros Hacer
		
		numeroAleatorio = Aleatorio(1, valorMaximo)
		
		estaRepetido = numeroRepetido(numerosPremiados, numeroAleatorio, i)
		
		Si !estaRepetido
			numerosPremiados[i] = numeroAleatorio
			i = i + 1
		FinSi
		
	Fin Mientras
	
	Mientras i < cantidadNumeros Hacer
		
		Escribir "Los n�meros premiados son: "
		
		Escribir numerosPremiados[i]
		
	Fin Mientras
	
FinFuncion

Funcion estaRepetido <- numeroRepetido(arrayNumeros, numeroQueComprobar, repeticiones)
	Definir estaRepetido Como Logico
	estaRepetido = Falso
	
	Mientras i < repeticiones
		
		Si arrayNumeros[i] = numeroQueComprobar
			estaRepetido = Verdadero
			
		FinSi
		
	Fin Mientras
	
FinFuncion

Funcion comprobarAciertos(cantidadNumeros, numerosJugador, numerosPremiados)
	
	Para i <- 1 Hasta cantidadNumeros Hacer 
		
		Para j <- 1 Hasta cantidadNumeros Hacer
			
			Si numerosJugador[i] = numerosPremiados[j] Entonces 
				
				numerosAcertados = numerosAcertados + 1
			FinSi
			
		FinPara
		
	FinPara
	
	Escribir "Tu n�mero de aciertos es: ", numerosAcertados, "."
	
	Si numerosAcertados = cantidadNumeros Entonces
		
		Escribir "Enhorabuena, has acertado todos los n�meros."
		
	FinSi
	
FinFuncion

Algoritmo primitiva	
	
	Definir cantidadNumeros Como Entero
	cantidadNumeros = 6 // Cantidad de n�meros pedidos y generados. En la primitiva son 6.
	
	Definir valorMaximo Como Entero
	valorMaximo = 49 // N�mero m�s alto que se puede seleccionar. En la primitiva es hasta el 49.
	
	Dimension numerosJugador[cantidadNumeros] 
	Dimension numerosPremiados[cantidadNumeros]
	Definir numerosAcertados Como Entero
	
	numerosJugador = introducirNumeros(cantidadNumeros, valorMaximo)
	numerosPremiados = generarNumeros(cantidadNumeros, valorMaximo)
	comprobarAciertos(cantidadNumeros, numerosJugador, numerosPremiados)
	
FinAlgoritmo