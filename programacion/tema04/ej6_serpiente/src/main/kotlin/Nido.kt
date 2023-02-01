import kotlin.random.Random

class Nido {
    var serpientes = ArrayList<Serpiente>()
    private val CAPACIDAD = 20

    companion object {
        var poblacion = 0
    }

    fun nacenSerpientes() {
        if (poblacion <= CAPACIDAD) {
            poblacion++
            serpientes.add(Serpiente())
        }
    }

    fun envejecenSerpientes() {
        var i = 0
        var muerenViejas = 0

        while (i < serpientes.size) {
            serpientes[i].envejecer()
            if (serpientes[i].cuerpo.size == 0) {
                serpientes.remove(serpientes[i])
                poblacion--
                muerenViejas++
                i--
            }
            i++
        }
        if (muerenViejas > 0) {
            println("Mueren $muerenViejas serpientes de viejas.")
        }

    }

    fun muerenSerpientes(cantidadMuertas: Int) {
        poblacion -= cantidadMuertas
        if (cantidadMuertas != 0) {
            println("\n Mueren $cantidadMuertas serpientes por ataque de mangosta.")
            for (i in 1..cantidadMuertas) {
                if (serpientes.size > 1) {
                    serpientes.removeAt(Random.nextInt(0, serpientes.size - 1))
                }
            }
        }
    }

}