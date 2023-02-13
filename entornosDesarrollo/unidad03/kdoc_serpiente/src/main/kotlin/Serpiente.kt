import kotlin.random.Random

/**
 * Serpiente
 *
 * @constructor Crea una serpiente con un numero aleatorio de anillas de edad 0
 */
class Serpiente {
    /**
     * Cuerpo
     *
     * Contiene las anillas de la serpiente
     */
    var cuerpo = ArrayList<Anilla>()

    /**
     * Edad
     *
     * Edad de la serpiente
     */
    private var edad = 0

    constructor() {
        for (i in 0..Random.nextInt(1, 6)) {
            var anilla = Anilla()
            cuerpo.add(anilla)
        }

        edad = 0

    }

    /**
     * Envejecer
     *
     * Cada año la serpiente envejece
     *
     * Si la serpiente tiene menos de 10 años tiene un 80% de crecer
     *
     * Si la serpiente tiene menos de 10 años tiene un 20% de mudar la piel
     *
     * Si la serpiente tiene mas de 10 años tiene un 90% de decrecer
     *
     * Si la serpiente tiene mas de 10 años tiene un 10% de mudar la piel
     */
    fun envejecer() {
        edad++

        if (edad < 10) {
            if (Random.nextInt(0, 10) < 8) {
                crecer()
            } else {
                mudarPiel()
            }
        } else {
            if (Random.nextInt(0, 10) < 9) {
                decrecer()
            } else {
                mudarPiel()
            }
        }
    }

    /**
     * Crecer
     *
     * Añade una anilla a la serpiente
     */
    private fun crecer() {
        cuerpo.add(Anilla())
    }


    /**
     * Decrecer
     *
     * Elimina una anilla a la serpiente
     */
    private fun decrecer() {
        if (cuerpo.size > 1) {
            cuerpo.removeAt(cuerpo.size - 1)
        } else {
            morir()
        }
    }

    /**
     * Mudar piel
     *
     * Cambia el color de todas las anillas de la serpiente
     */
    private fun mudarPiel() {
        for (anilla in cuerpo.indices) {
            cuerpo[anilla] = Anilla()
        }
    }

    /**
     * Morir
     *
     * Elimina todas las anillas de la serpiente
     */
    private fun morir() {
        cuerpo.removeAll { true }
    }


    /**
     * To string
     *
     * @return Patrón de colores y edad
     */
    override fun toString(): String {
        var patronColores = ""

        for (anilla in cuerpo) {
            patronColores += anilla
        }

        return "Anillas = $patronColores, edad = $edad"
    }

}