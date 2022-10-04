// Juego del n�mero secreto. El ordenador pensar� un n�mero del 1 al 100.
// El usuario tendr� 5 intentos para averiguarlo. El programa le ir� dando pistas del tipo mayor o menor.
// Al final, pase lo que pase (gane o pierda), se le preguntar� al usuario si quiere empezar un nuevo juego.

Funcion nuevaPartida
	Definir intentos Como Entero
	Escribir "Tiene 5 intentos para averiguar un n�mero del 1 al 100."
	intentos = 0
FinFuncion

Funcion numeroAleatorio <- pensar	
	numeroAleatorio = Aleatorio(1,100)	
FinFuncion

Funcion adivinar(numeroAleatorio)
	Definir numeroUsuario	Como Entero
	
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
