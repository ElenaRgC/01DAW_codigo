import java.util.Scanner
/*
La calculadora. Diseña un algoritmo que pida dos números y un operador
(una operación aritmética básica: sumar, restar, multiplicar o dividir).
Se debe mostrar el resultado de dicha operación.
Controla el posible error como la división por cero, en este caso se indicará que no se puede realizar.
El ejercicio se debe repetir indefinidamente hasta que el usuario decida terminar.
 */

fun sumar(primerNumero: Float, segundoNumero: Float) : Float {
    return primerNumero + segundoNumero
}

fun restar(primerNumero: Float, segundoNumero: Float) : Float {
    return primerNumero - segundoNumero
}

fun multiplicar(primerNumero: Float, segundoNumero: Float) : Float {
    return primerNumero * segundoNumero
}

fun dividir(primerNumero: Float, segundoNumero: Float) : Float {
    return primerNumero / segundoNumero
}

fun main() { // Elena Rodríguez Calderón
    val scanner = Scanner(System.`in`)
    var primerNumero: Float
    var segundoNumero: Float
    var operador: Float
    var resultado: Float

    println("Indique la operación a realizar:")
    println("1: Sumar.")
    println("2: Restar.")
    println("3: Multiplicar.")
    println("4: Dividir.")
    println("Cualquier otro número para salir.")
    operador = scanner.nextInt()

    println("Introduzca el primer valor.")
    primerNumero = scanner.nextFloat()

    println("Introduzca el segundo valor.")
    segundoNumero = scanner.nextFloat()

    when (operador){

        1 -> sumar(primerNumero, segundoNumero)
    }

}