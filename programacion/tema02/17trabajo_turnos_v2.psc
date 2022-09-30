Algoritmo trabajo_turnos
	// Los empleados de una f�brica trabajan por turnos: diurno y nocturno.
	// Se debe calcular el jornal diario de acuerdo con los siguientes puntos:
	// - La tarifa por horas diurnas es de 20E.
	// - La tarifa por horas nocturnas es de 35E.
	// - Caso de ser domingo, la tarifa se incrementar� en 10? m�s para el turno diurno y 15? m�s para el nocturno.
	// Definici�n de variables
	Definir tipo_jornada Como Entero
	tipo_jornada <- 0
	Definir horas_trabajadas Como Entero
	horas_trabajadas <- 0
	Definir tarifa Como Entero
	tarifa <- 0
	Definir jornal Como Entero
	jornal <- 0
	// Obtenci�n de los datos por parte del usuario.
	Repetir
		Escribir '�Qu� jornada has realizado?'
		Escribir 'Introduce 1 para jornadas diurnas en d�as laborables.'
		Escribir 'Introduce 2 para jornadas nocturas en d�as laborables.'
		Escribir 'Introduce 3 para jornadas diurnas en domingos o festivos.'
		Escribir 'Introduce 4 para jornadas nocturas en domingos o festivos.'
		Leer tipo_jornada
	Hasta Que tipo_jornada=1 O tipo_jornada=2 O tipo_jornada=3 O tipo_jornada=4
	Escribir '�Cu�ntas horas has trabajado?'
	Leer horas_trabajadas
	// C�lculos
	Segun tipo_jornada  Hacer
		1:
			tarifa <- 20
		2:
			tarifa <- 35
		3:
			tarifa <- 20+10
		4:
			tarifa <- 35+15
		De Otro Modo:
			Escribir 'No ha introducido un valor v�lido.'
	FinSegun
	jornal <- tarifa*horas_trabajadas
	// Devoluci�n al usuario
	Escribir 'Tu jornal para ese d�a es de ',jornal,' euros.'
FinAlgoritmo
