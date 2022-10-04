Algoritmo numero_secreto
	// Juego del n�mero secreto. El ordenador pensar� un n�mero del 1 al 100.
	// El usuario tendr� 5 intentos para averiguarlo. El programa le ir� dando pistas del tipo mayor o menor.
	// Al final, pase lo que pase (gane o pierda), se le preguntar� al usuario si quiere empezar un nuevo juego.
	
	Definir numeroAleatorio Como Entero
	Definir numeroUsuario	Como Entero
	Definir intentos Como Entero
	Definir continuar Como Cadena
	
	numeroAleatorio = 0
	numeroUsuario = 0
	continuar = ""
	
	Repetir
		
		Escribir "Tiene 5 intentos para averiguar un n�mero del 1 al 100."
		numeroAleatorio = Aleatorio(1,100)
		intentos = 0
		
		Mientras intentos < 5 Y numeroUsuario <> numeroAleatorio Hacer
			
			Escribir "Introduce un n�mero"
			Leer numeroUsuario
			
			Si numeroUsuario = numeroAleatorio
				Escribir "Has ganado."
				
			SiNo
				Si numeroUsuario < numeroAleatorio
					Escribir "El n�mero oculto es mayor."
					
				SiNo
					Escribir "El n�mero oculto es menor."
					
				FinSi
				
			FinSi
			
			intentos = intentos + 1
			
		Fin Mientras
		
		Si intentos = 5 Y numeroUsuario <> numeroAleatorio Entonces
			Escribir "Has perdido. El n�mero oculto era: ", numeroAleatorio, "."
		FinSi
		
		Escribir "Introduzca S para jugar otra vez. Cualquier otro valor para parar."
		Leer continuar
		
	Hasta Que continuar <> "S"
	

	
	
	
FinAlgoritmo
