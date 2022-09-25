Algoritmo raiz_cuadrada
	Definir numero1 Como Real
	Definir raiz1 Como Real
	
	Escribir "Escriba el número del que desea calcular la raíz cuadrada."
	Leer numero1
	
	Si numero1 < 0
		Entonces
		Escribir "No es posible calcular la raíz cuadrada de un número negativo."
	SiNo
		raiz1 = raiz(numero1)
		Escribir "La raíz cuadrada de ", numero1, " es ", raiz1 , "."
	FinSi
	
FinAlgoritmo
