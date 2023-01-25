import java.util.Scanner
import kotlin.random.Random

/* Inés, Ramón y Elena
    -1 ⇾ vacío, 0 -> 'O', 1 ⇾ 'X'
    'X' ⇾ humano y 'O' ⇾ PC*/

val TECLADO = Scanner(System.`in`)

fun main() {

    var tablero1 = Tablero()

    var empiezaJugador = Random.nextBoolean()


    if (empiezaJugador) {
        do {
            tablero1.turnoJugador()
            print(tablero1)
            tablero1.comprobarVictoria(1)
            tablero1.comprobarLleno()
            if (tablero1.estaLleno == false && tablero1.ganador == -1) {
                tablero1.turnoPC()
                print(tablero1)
                tablero1.comprobarVictoria(0)
                tablero1.comprobarLleno()
            }
        } while (!tablero1.estaLleno && tablero1.ganador == -1)

    } else {
        do {
            tablero1.turnoPC()
            print(tablero1)
            tablero1.comprobarVictoria(0)
            tablero1.comprobarLleno()
            if (tablero1.estaLleno == false && tablero1.ganador == -1) {
                tablero1.turnoJugador()
                print(tablero1)
                tablero1.comprobarVictoria(1)
                tablero1.comprobarLleno()

            }
        } while (!tablero1.estaLleno && tablero1.ganador == -1)
    }

    if (tablero1.ganador == 1) {
        println("Has ganado.")
    } else if (tablero1.ganador == 0) {
        println("Has perdido.")
    }

    if (tablero1.estaLleno && tablero1.ganador == -1) {
        println("El tablero está lleno, empate")

    }


}