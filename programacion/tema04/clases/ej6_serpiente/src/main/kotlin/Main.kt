import kotlin.random.Random

fun main() { // Elena Rodríguez Calderón

    var tiempo = 0
    val TIEMPOMAX = 5 // minutos

    var nido = Nido()

    do {
        if (tiempo % 5 == 0) {
            var nuevasSerpientes = Random.nextInt(1, 5)
            println("\n Nacen $nuevasSerpientes serpientes.")

            for (i in 1..nuevasSerpientes) {
                nido.nacenSerpientes()
            }
        }

        nido.envejecenSerpientes()

        if (tiempo % 10 == 0) {
            nido.muerenSerpientes(ataqueMangosta())
        }

        tiempo++

        println("\n En el nido hay ${nido.serpientes.size} serpientes vivas.")

        var i = 1

        for (serpiente in nido.serpientes) {
            print("Serpiente $i: ")
            println(serpiente)
            i++
        }

        println("\n Pasa un segundo.")
    } while (tiempo < TIEMPOMAX * 60)

    println("Han pasado $TIEMPOMAX minutos.")

}

fun ataqueMangosta(): Int {
    var ataqueExitoso = Random.nextInt(0, 10) < 2

    if (ataqueExitoso) {
        return Random.nextInt(0, 5)
    } else {
        return 0
    }

}

// Ejercicio original sin nido

/*do {
        serpiente1.envejecer()
        println(serpiente1)

        if (Random.nextInt(0, 10) >= 9) {
            println("Has sido atacado por una mangosta.")
            serpiente1.morir()
        }

    } while (serpiente1.cuerpo.isNotEmpty())*/