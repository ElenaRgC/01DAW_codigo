import kotlin.random.Random
import java.util.Scanner

fun introducirNumeros(cantidadNumeros: Int, valorMaximo: Int): IntArray {

    var numeroIntroducido: Int = 0
    var numerosJugador = IntArray(cantidadNumeros)
    var estaRepetido: Boolean
    var i = 0
    val scanner = Scanner(System.`in`)

    while (i < cantidadNumeros) {
        do {

            println("Introduzca un número entre 1 y $valorMaximo.")
            numeroIntroducido = scanner.nextInt()

            estaRepetido = estarRepetido(numerosJugador, numeroIntroducido, i)

            if (estaRepetido) {
                println("Ha introducido un número que ya había elegido.")
            }

            if (numeroIntroducido < 1) {
                println("Ha introducido un número menor que 1.")
            }

            if (numeroIntroducido > valorMaximo) {
                println("Ha introducido un número mayor que $valorMaximo.")
            }

        } while (estaRepetido && numeroIntroducido < 1 && numeroIntroducido > valorMaximo)

        numerosJugador[i] = numeroIntroducido
        i++
    }

    return numerosJugador

}

fun generarNumeros(cantidadNumeros: Int, valorMaximo: Int): IntArray {
    var numerosPremiados = IntArray(cantidadNumeros)
    var numeroAleatorio: Int = 0
    var i: Int = 0
    var estaRepetido: Boolean

    while (i < cantidadNumeros) {

        numeroAleatorio = Random.nextInt(1, valorMaximo)
        estaRepetido = estarRepetido(numerosPremiados, numeroAleatorio, i)

        if (!estaRepetido) {
            numerosPremiados[i] = numeroAleatorio
        }
        
        i++
    }

    return numerosPremiados

}

fun estarRepetido(arrayNumeros: IntArray, numeroQueComprobar: Int, iteraciones: Int): Boolean {
    var estaRepetido: Boolean = false
    val i: Int = 0

    while (i < iteraciones) {
        if (arrayNumeros[i] == numeroQueComprobar) {
            estaRepetido = true
            break
        }
    }

    return estaRepetido
}

fun main() { // Elena Rodríguez Calderón

    /* Genera una combinación al azar para la lotería primitiva.
    Los números de la lotería son 6, comprendidos del 1 al 49.
    En esta versión no importa si se repite algún número.  */

    val cantidadNumeros: Int = 6 // Cantidad de números pedidos y generados. En la primitiva son 6.
    val valorMaximo: Int = 49 // Número más alto que se puede seleccionar. En la primitiva es hasta el 49.
    var numerosJugador = IntArray(cantidadNumeros)

    numerosJugador = introducirNumeros(cantidadNumeros, valorMaximo)

    comprobarAciertos(cantidadNumeros, numerosJugador, numerosPremiados)


}