Algoritmo mayor_de_tres
	//Calcula cual es el mayor de tres números que se piden por teclado.
	
	Definir n1 Como Entero
	Definir n2 Como Entero
	Definir n3 Como Entero
	
	n1 = 0
	n2 = 0
	n3 = 0
	
	Escribir "Introduzca el primer número."
	Leer n1
	Escribir "Introduzca el segundo número."
	Leer n2
	Escribir "Introduzca el tercer número."
	Leer n3
	
	Si n1 > n2 Y n1 > n3
		Escribir n1 " es el número mayor."
	SiNo
		Si n2 > n1 Y n2 > n3
			Escribir n2 " es el número mayor."
			
		SiNo
			Escribir n3 " es el número mayor."
		FinSi
	FinSi
	
FinAlgoritmo
