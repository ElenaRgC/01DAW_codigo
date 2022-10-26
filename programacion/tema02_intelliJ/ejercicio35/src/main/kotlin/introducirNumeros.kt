import java.util.*

fun introducirNumeros(cantidadNumeros: Int, valorMaximo: Int): IntArray {

    var numeroIntroducido: Int = 0
    var numerosJugador = IntArray(cantidadNumeros)
    var estaRepetido: Boolean
    var i = 0
    val scanner = Scanner(System.`in`)

    while (i < cantidadNumeros) {
        do { // Filtramos los números que puede elegir el jugador.

            println("Introduzca un número entre 1 y $valorMaximo.")
            numeroIntroducido = readln().toInt()

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

        } while (estaRepetido || numeroIntroducido < 1 || numeroIntroducido > valorMaximo)

        numerosJugador[i] = numeroIntroducido
        i++
    }

    return numerosJugador

}