Algoritmo media_15
	// Un algoritmo que pida números por teclado y los vaya sumado.
	// Cuando yo introduzca el número 15 deja de pedir números y sumar y calcula la media sin tener en cuenta el 15.
	
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
		Escribir "Introduce un número. Introduce ", salida, " para terminar."
		Leer numeroIntroducido
		
		Si numeroIntroducido <> salida
			Escribir "Has introducido ", numeroIntroducido, "."
			suma = suma + numeroIntroducido
			contador = contador + 1
		SiNo
			media = suma / contador
			
		FinSi
		
	Hasta Que numeroIntroducido = salida
	
	Escribir "La media de los números introducidos es: ", media, "."
	
FinAlgoritmo
