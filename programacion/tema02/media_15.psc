Algoritmo media_15
	// Un algoritmo que pida n�meros por teclado y los vaya sumado.
	// Cuando yo introduzca el n�mero 15 deja de pedir n�meros y sumar y calcula la media sin tener en cuenta el 15.
	
	Definir numeroIntroducido Como Real
	Definir contador Como Real
	Definir suma Como Real
	Definir media Como Real
	
	numeroIntroducido = 0
	contador = 0
	suma = 0
	media = 0
	salida = 15
	
	Repetir
		Escribir "Introduce un n�mero. Introduce ", salida, " para terminar."
		Leer numeroIntroducido
		
		Si numeroIntroducido <> salida
			Escribir "Has introducido ", numeroIntroducido, "."
			suma = suma + numeroIntroducido
			contador = contador + 1
		SiNo
			media = suma / contador
			
		FinSi
		
	Hasta Que numeroIntroducido = salida
	
	Escribir "La media de los n�meros introducidos es: ", media, "."
	
FinAlgoritmo
