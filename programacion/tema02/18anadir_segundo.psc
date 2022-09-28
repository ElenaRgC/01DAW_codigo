Algoritmo anadir_segundo
	//Dada una hora por teclado (horas, minutos y segundos) realiza un algoritmo
	// que muestre la hora después de incrementarle un segundo.
	
	Definir horas Como Entero
	Definir minutos Como Entero
	Definir seconds Como Entero // segundo y segundos está reservada
	
	Escribir "Introduce la hora."
	Leer horas
	Escribir "Introduce los minutos."
	Leer minutos
	Escribir "Introduce los segundos."
	Leer seconds
	
	seconds = seconds + 1
	
	Si seconds < 60
		
		Escribir horas, ":", minutos, ":", seconds
		
	SiNo
		seconds = seconds - 60
		minutos = minutos + 1
		
		Si minutos + 1 < 60
			Escribir horas, ":", minutos, ":", seconds
			
		SiNo
			minutos = minutos - 60
			horas = horas + 1
			
			Si horas > 23
				horas = 00
				Escribir horas, ":", minutos, ":", seconds
				
			SiNo
				Escribir horas, ":", minutos, ":", seconds
			FinSi
			
		FinSi
		
	FinSi
	
	
	
FinAlgoritmo
