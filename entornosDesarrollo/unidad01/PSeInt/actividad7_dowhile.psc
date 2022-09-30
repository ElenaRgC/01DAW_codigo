Algoritmo actividad7_dowhile
	
	Definir meses, gastos, acumulado Como Entero
	Definir media Como Real
	
	acumulado = 0
	
	Escribir "Ingrese cuántos meses quiere calcular."
	Leer meses
	
	x = 1
	Repetir
		Escribir "Ingrese los gastos para el mes ", x, "."
		Leer gastos
		acumulado = acumulado + gastos
		x = x + 1
	Hasta Que x = meses
	
	Escribir "Los gastos acumulados en todos los meses son: ", acumulado, "."
	
	media = acumulado/meses
	
	Escribir "La media de gastos mensual es: ", media, "."
FinAlgoritmo
