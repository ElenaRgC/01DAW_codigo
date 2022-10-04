// Juego del número secreto. El ordenador pensará un número del 1 al 100.
// El usuario tendrá 5 intentos para averiguarlo. El programa le irá dando pistas del tipo mayor o menor.
// Al final, pase lo que pase (gane o pierda), se le preguntará al usuario si quiere empezar un nuevo juego.

Funcion nuevaPartida
	Definir intentos Como Entero
	Escribir "Tiene 5 intentos para averiguar un número del 1 al 100."
	intentos = 0
FinFuncion

Funcion numeroAleatorio <- pensar	
	numeroAleatorio = Aleatorio(1,100)	
FinFuncion

Funcion adivinar(numeroAleatorio)
	Definir numeroUsuario	Como Entero
	
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
	
FinFuncion


Algoritmo numero_secreto_v2
	Definir numeroAleatorio Como Entero
	Definir seguir Como Cadena
	
	numeroAleatorio = 0
	numeroUsuario = 0
	continuar = ""
	
	Repetir
		
		nuevaPartida
		
		numeroAleatorio = pensar
		
		adivinar(numeroAleatorio)
		
		Escribir "Introduzca S para jugar otra vez. Cualquier otro valor para parar."
		Leer seguir
		
	Hasta Que seguir <> "S"
	
	
FinAlgoritmo
