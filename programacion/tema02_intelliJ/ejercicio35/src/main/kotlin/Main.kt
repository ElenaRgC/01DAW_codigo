import kotlin.random.Random
import java.util.Scanner

fun introducirNumeros(cantidadNumeros: Int, valorMaximo: Int) {

    var numeroIntroducido: Int = 0
    val numerosJugador = Array(cantidadNumeros) {0}
    var i = 0

    while (i < cantidadNumeros) {
        do {

            println("Introduzca un número entre 1 y $valorMaximo.")

        } while (estaRepetido && numeroIntroducido >= 1 && numeroIntroducido <= numeroMaximo)

    i++
    }

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

    /*
Genera una combinación al azar para la lotería primitiva.
Los números de la lotería son 6, comprendidos del 1 al 49.
En esta versión no importa si se repite algún número.
 */

    val cantidadNumeros: Int = 6 // Cantidad de números pedidos y generados. En la primitiva son 6.
    val valorMaximo: Int = 49 // Número más alto que se puede seleccionar. En la primitiva es hasta el 49.
}