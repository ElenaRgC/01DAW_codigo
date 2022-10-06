Algoritmo calculadora
	
	Definir num Como Entero	
	Definir numero1 Como Real
	Definir numero2 Como Real
	
	Escribir "Pulsa 1 para sumar."
	Escribir "Pulsa 2 para restar."
	Escribir "Pulsa 3 para multiplicar."
	Leer num
	
	Escribir "Introduce el primer número."
	Leer numero1
	
	Escribir "Introduce el segundo número."
	Leer numero2
	
	Segun num Hacer
		1:
			Escribir numero1 + numero2
		2:
			Si numero2 > numero1 
				Escribir "No es posible restar un número mayor."
			SiNo
				Escribir numero1 - numero2
			FinSi			
		3: 
			Escribir numero1 * numero2
			
		De Otro Modo:
			Escribir "Opción no disponible."
			
	Fin Segun
	
FinAlgoritmo
