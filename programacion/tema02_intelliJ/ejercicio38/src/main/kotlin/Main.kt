import java.util.Scanner

/*
La calculadora. Diseña un algoritmo que pida dos números y un operador
(una operación aritmética básica: sumar, restar, multiplicar o dividir).
Se debe mostrar el resultado de dicha operación.
Controla el posible error como la división por cero, en este caso se indicará que no se puede realizar.
El ejercicio se debe repetir indefinidamente hasta que el usuario decida terminar.
 */

fun sumar(primerNumero: Double, segundoNumero: Double): Double {
    return primerNumero + segundoNumero
}

fun restar(primerNumero: Double, segundoNumero: Double): Double {
    return primerNumero - segundoNumero
}

fun multiplicar(primerNumero: Double, segundoNumero: Double): Double {
    return primerNumero * segundoNumero
}

fun dividir(primerNumero: Double, segundoNumero: Double): Double {
    return primerNumero / segundoNumero
}

fun main() { // Elena Rodríguez Calderón
    val scanner = Scanner(System.`in`)
    var primerNumero: Double = 0.0
    var segundoNumero: Double = 0.0
    var resultado: Double = 0.0
    var operador: Int = 0

    do {
        println("Indique la operación a realizar:")
        println("1: Sumar.")
        println("2: Restar.")
        println("3: Multiplicar.")
        println("4: Dividir.")
        println("Cualquier otro número para salir.")
        operador = scanner.nextInt()

        if (operador in 1..4) {
            println("Introduzca el primer valor.")
            primerNumero = scanner.nextDouble()

            println("Introduzca el segundo valor.")
            segundoNumero = scanner.nextDouble()
        }

        when (operador) {

            1 -> resultado = sumar(primerNumero, segundoNumero)
            2 -> resultado = restar(primerNumero, segundoNumero)
            3 -> resultado = multiplicar(primerNumero, segundoNumero)
            4 -> {
                if (segundoNumero == 0.0) {
                    println("No es posible dividir por 0.")
                } else {
                    resultado = dividir(primerNumero, segundoNumero)
                }
            }

            else -> {
                println("Fin del programa.")
            }
        }

        if (operador in 1..4) {
            if (operador != 4 && segundoNumero != 0.0)
                println("El resultado es $resultado")
        }
    } while (operador in 1..4)
}