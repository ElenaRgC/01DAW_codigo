import kotlin.random.Random
import java.util.Scanner

fun main() {
    /*
    Juego del número secreto. El ordenador ‘pensará’ un número del 1 al 100.
    El usuario tendrá 5 intentos para averiguarlo. El programa le irá dando pistas del tipo mayor o menor.
    Al final, pase lo que pase (gane o pierda), se le preguntará al usuario si quiere continuar.
     */

    var continuar : String
    val numeroSecreto: Int = Random.nextInt(1, 100)
    var numeroPedido: Int
    val scanner = Scanner(System.`in`)
    var intentos : Int
    do {

        intentos = 0 // Se asigna el valor dentro del bucle porque debe reiniciarse cada partida.

        do {
            do { // Comprobamos que el número introducido por el usuario está entre 1 y 100.
                println("Introduce un número entre 1 y 100.")
                numeroPedido = scanner.nextInt()
            } while (numeroPedido < 1 || numeroPedido > 100)

            if (numeroPedido > numeroSecreto) {
                println("El número secreto es mayor.")
            } else if (numeroPedido < numeroSecreto) {
                println("El número secreto es menor.")
            }

            if (numeroPedido != numeroSecreto) { // Aumentamos el número de intentos si se falla.
                intentos++
                println("Has gastado $intentos intento/s.")
            }

        } while (intentos < 5 && numeroPedido != numeroSecreto) // Solo sigue el bucle si se alcanza el número de intentos o se acierta.

        if (intentos == 5 ) { // De primeras consideraba && numeroPedido != numeroSecreto, pero siempre va a ser cierto al ser condición de fin del do while.
            println("Has agotado tus intentos. Has perdido.")
            println("El número secreto era $numeroSecreto.")
        } else { // Al principio consideré un else if (numeroPedido == numeroSecreto), pero ocurre como en el caso anterior.
            println("Has acertado el número secreto.")
        }

        println("Introduzca S para seguir jugando, cualquier otro valor para salir.")
        continuar = scanner.next()

        // scanner.close() si cierro el escáner, no funciona para la segunda vuelta y sucesivas.

    } while (continuar == "S")


}