import java.util.Scanner
import kotlin.random.Random

val TECLADO = Scanner(System.`in`)

fun main() { /* Inés, Ramón y Elena
    PARTICULARIDADES PARA NUESTRO PROGRAMA:
    -1 ⇾ vacío, 0 -> 'O', 1 ⇾ 'X'
    'X' ⇾ humano y 'O' ⇾ PC
    Hemos usado una variable "jugadorActual" que representa la persona que está jugando en ese mismo momento,
    si es 0 estará el humano y si es 1 está jugando el PC
     */

    val N = 3
    var tablero = Array<IntArray>(N) { IntArray(N) { -1 } }

    var tableroLleno = false
    var hayGanador = false
    var empiezaJugador = Random.nextBoolean()


    if (empiezaJugador) {
        do {
            hayGanador = turnoJugador(tablero)
            tableroLleno = comprobarTableroLleno(tablero)
            if (!hayGanador && !tableroLleno) {
                hayGanador = turnoPC(tablero)
                tableroLleno = comprobarTableroLleno(tablero)
            }
        } while (!tableroLleno && !hayGanador)

    } else {
        do {
            hayGanador = turnoPC(tablero)
            tableroLleno = comprobarTableroLleno(tablero)
            if (!hayGanador && !tableroLleno) {
                hayGanador = turnoJugador(tablero)
                tableroLleno = comprobarTableroLleno(tablero)
            }
        } while (!tableroLleno && !hayGanador)
    }

    if (!hayGanador) {
        println("El tablero se ha llenado. Hay un empate.")
    }

}