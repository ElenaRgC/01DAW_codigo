Algoritmo raiz_cuadrada
	Definir numero1 Como Real
	Definir raiz1 Como Real
	
	Escribir "Escriba el n�mero del que desea calcular la ra�z cuadrada."
	Leer numero1
	
	Si numero1 < 0
		Entonces
		Escribir "No es posible calcular la ra�z cuadrada de un n�mero negativo."
	SiNo
		raiz1 = raiz(numero1)
		Escribir "La ra�z cuadrada de ", numero1, " es ", raiz1 , "."
	FinSi
	
FinAlgoritmo
