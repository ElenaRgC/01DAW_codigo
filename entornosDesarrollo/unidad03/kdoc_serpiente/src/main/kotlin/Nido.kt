import kotlin.random.Random

/**
 * Nido
 *
 * @constructor Crea un nido con una poblacion inicial de 0
 */
class Nido {
    /**
     * Serpientes
     *
     * Contiene las serpientes del nido
     */
    var serpientes = ArrayList<Serpiente>()

    /**
     * Capacidad
     *
     * Capacidad máxima de serpientes del nido
     */
    private val CAPACIDAD = 20

    companion object {
        var poblacion = 0
    }

    /**
     * Nacen serpientes
     *
     * @param cantidadNacidas
     *
     * Añade serpientes al nido
     */
    fun nacenSerpientes() {
        if (poblacion <= CAPACIDAD) {
            poblacion++
            serpientes.add(Serpiente())
        }
    }

    /**
     * Envejecen serpientes
     *
     * Cada año las serpientes envejecen y mueren las viejas
     *
     * Las serpientes mueren cuando su cuerpo se queda vacío
     */
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

    /**
     * Mueren serpientes
     *
     * Elimina serpientes del nido cuando son atacadas por una mangosta
     */
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