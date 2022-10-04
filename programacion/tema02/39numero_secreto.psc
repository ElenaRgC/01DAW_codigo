Algoritmo numero_secreto
	// Juego del número secreto. El ordenador pensará un número del 1 al 100.
	// El usuario tendrá 5 intentos para averiguarlo. El programa le irá dando pistas del tipo mayor o menor.
	// Al final, pase lo que pase (gane o pierda), se le preguntará al usuario si quiere empezar un nuevo juego.
	
	Definir numeroAleatorio Como Entero
	Definir numeroUsuario	Como Entero
	Definir intentos Como Entero
	Definir continuar Como Cadena
	
	numeroAleatorio = 0
	numeroUsuario = 0
	continuar = ""
	
	Repetir
		
		Escribir "Tiene 5 intentos para averiguar un número del 1 al 100."
		numeroAleatorio = Aleatorio(1,100)
		intentos = 0
		
		Mientras intentos < 5 Y numeroUsuario <> numeroAleatorio Hacer
			
			Escribir "Introduce un número"
			Leer numeroUsuario
			
			Si numeroUsuario = numeroAleatorio
				Escribir "Has ganado."
				
			SiNo
				Si numeroUsuario < numeroAleatorio
					Escribir "El número oculto es mayor."
					
				SiNo
					Escribir "El número oculto es menor."
					
				FinSi
				
			FinSi
			
			intentos = intentos + 1
			
		Fin Mientras
		
		Si intentos = 5 Y numeroUsuario <> numeroAleatorio Entonces
			Escribir "Has perdido. El número oculto era: ", numeroAleatorio, "."
		FinSi
		
		Escribir "Introduzca S para jugar otra vez. Cualquier otro valor para parar."
		Leer continuar
		
	Hasta Que continuar <> "S"
	

	
	
	
FinAlgoritmo
