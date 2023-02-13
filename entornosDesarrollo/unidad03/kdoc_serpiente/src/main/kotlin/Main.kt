import kotlin.random.Random

/**
 * Main
 * @author Elena Rodríguez Calderón
 * @version 1.0
 *
 ** Simula la vida de un nido de serpientes durante 5 minutos, donde cada segundo es un año.
 *
 * Cada año las serpientes envejecen.
 * Cada 5 años nacen serpientes si hay hueco en el nido.
 * Cada 10 años hay un ataque de mangosta que mata entre 0 y 5 serpientes.
 */
fun main() { // Elena Rodríguez Calderón

    var tiempo = 0 // segundos = año
    val TIEMPOMAX = 5 // minutos

    var nido = Nido()

    do {
        nido.envejecenSerpientes()

        if (tiempo % 5 == 0) {
            var nuevasSerpientes = Random.nextInt(1, 5)
            println("\n Nacen $nuevasSerpientes serpientes.")

            for (i in 1..nuevasSerpientes) {
                nido.nacenSerpientes()
            }
        }

        if (tiempo % 10 == 0) {
            nido.muerenSerpientes(ataqueMangosta())
        }

        println("\n En el nido hay ${nido.serpientes.size} serpientes vivas.")

        var i = 1

        for (serpiente in nido.serpientes) {
            print("Serpiente $i: ")
            println(serpiente)
            i++
        }

        println("\n Pasa un anyo.")
        tiempo++

    } while (tiempo < TIEMPOMAX * 60)

    println("Han pasado $TIEMPOMAX minutos.")

}

/**
 * Ataque mangosta
 *
 * @return Int Cantidad de serpientes muertas por ataque de mangosta
 *
 * Simula un ataque de mangosta que mata entre 0 y 5 serpientes.
 */
fun ataqueMangosta(): Int {
    var ataqueExitoso = Random.nextInt(0, 10) < 2

    if (ataqueExitoso) {
        return Random.nextInt(0, 5)
    } else {
        return 0
    }
}