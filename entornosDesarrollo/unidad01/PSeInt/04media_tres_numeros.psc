Algoritmo media_tres_numeros
	// Dise�a un algoritmo que calcule la media de tres n�meros que pediremos al usuario. 
	//Se deben dar dos resultados: la media con decimales y redondeada.
	
	Escribir "Introduce el primer n�mero."
	Leer numero1
	Escribir "Introduce el segundo n�mero."
	Leer numero2
	Escribir "Introduce el tercer n�mero."
	Leer numero3
	
	media = (numero1 + numero2 + numero3)/3
	mediaRedondeada = redon(media)
	mediaTruncada = trunc(media)
	
	Escribir "La media es " , media, "."
	Escribir "La media redondeada es ", mediaRedondeada, "."
	Escribir "La media truncada es ", mediaTruncada, "."
	
FinAlgoritmo
