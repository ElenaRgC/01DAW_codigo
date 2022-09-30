Algoritmo actividad7
	
	Definir meses, gastos, acumulado Como Entero
	Definir media Como Real
	
	acumulado = 0
	
	Escribir "Ingrese cuántos meses quiere calcular."
	Leer meses
	
	Para x<-1 Hasta meses Con Paso 1 Hacer
		Escribir "Ingrese los gastos para el mes ", x, "."
		Leer gastos
		acumulado = acumulado + gastos
	Fin Para
	
	Escribir "Los gastos acumulados en todos los meses son: ", acumulado, "."
	
	media = acumulado/meses
	
	Escribir "La media de gastos mensual es: ", media, "."
FinAlgoritmo
