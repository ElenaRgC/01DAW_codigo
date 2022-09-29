Algoritmo trabajo_turnos
	
	// Los empleados de una f�brica trabajan por turnos: diurno y nocturno.
	// Se debe calcular el jornal diario de acuerdo con los siguientes puntos:
	// - La tarifa por horas diurnas es de 20E.
	// - La tarifa por horas nocturnas es de 35E.
	// - Caso de ser domingo, la tarifa se incrementar� en 10? m�s para el turno diurno y 15? m�s para el nocturno.
	
	Definir turno Como Caracter
	Definir pregunta_domingo Como Caracter
	Definir bool_domingo Como Logico
	Definir horas Como Entero
	Definir tarifa Como Entero
	Definir jornal Como Entero
	
	turno = ""
	pregunta_domingo = ""
	bool_domingo = Falso
	horas = 0
	tarifa = 0
	jornal = 0
	
	// Obtenci�n de los datos por parte del usuario.
	
	Repetir
		Escribir "�En qu� turno has trabajado? Diurno (D) o Nocturno (N)."
		Leer turno
	Hasta Que turno = "D" O turno = "N"
	
	Repetir
		Escribir "�Has trabajado en domingo? S/N"
		Leer pregunta_domingo
	Hasta Que pregunta_domingo = "S" O turno = "N"
	
	// Repetir
		Escribir "�Cu�ntas horas ha durado tu jornada?"
		Leer horas // No he encontrado una funci�n de PSeInt para saber de qu� tipo es una variable.
	//Hasta Que Numero(horas) = Verdadero
	
	Si pregunta_domingo = "S"
		bool_domingo = Verdadero
	FinSi
	
	// C�lculos
	
	Si turno ="D"
		
		tarifa = 20
		
		Si bool_domingo
			tarifa = tarifa + 10
		FinSi
		
	SiNo
		tarifa = 30
		
		Si bool_domingo
			tarifa = tarifa + 15
		FinSi
		
	FinSi
	
	jornal = tarifa * horas
	
	Escribir "Tu sueldo para ese d�a ser�a de ", jornal, " euros."
	
	
	
FinAlgoritmo
