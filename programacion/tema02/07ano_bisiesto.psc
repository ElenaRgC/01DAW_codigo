Algoritmo ano_bisiesto
	
	Definir ano Como Entero
	
	Escribir "Introduzca un a�o."
	Leer ano
	
	
	Si ano mod 400 = 0
		
		Escribir "El a�o ", ano, " es bisiesto."
		
	SiNo
		Si ano mod 4 = 0
			
			Si ano mod 100 = 0
				Escribir "El a�o ", ano, " no es bisiesto."
				
			SiNo
				Escribir "El a�o ", ano, " es bisiesto."
				
			FinSi
			
		SiNo
			Escribir "El a�o ", ano, " no es bisiesto."
			
		FinSi
		
	FinSi
	
FinAlgoritmo
