Algoritmo resta_mayor_menor
	// Leídos dos números por teclado, restar al mayor el menor.
	//Por ejemplo, si A=9 y B=3 entonces se debe mostrar: "El primero es mayor y la resta es 6".
	
	Definir numero1 Como Real
	Definir numero2 Como Real
	
	Escribir "Introduce un número."
	Leer numero1
	
	Escribir "Introduce otro número."
	Leer numero2
	
	Si numero1 > numero2
		Escribir numero1, " es mayor que ", numero2, " y su resta es ", numero1 - numero2, "."
	SiNo
		Si numero1 < numero2
			Escribir numero2, " es mayor que ", numero1, " y su resta es ", numero2 - numero1, "."
		SiNo
			Escribir "Los dos números son iguales y la resta es cero."
		FinSi
	FinSi
	
FinAlgoritmo
