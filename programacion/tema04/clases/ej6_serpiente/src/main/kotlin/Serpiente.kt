import kotlin.random.Random

class Serpiente {
    var cuerpo = ArrayList<Anilla>()
    var edad = 0

    constructor() {
        for (i in 0..Random.nextInt(1, 6)) {
            var anilla = Anilla()
            cuerpo.add(anilla)
        }

        edad = 0

    }

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

    private fun crecer() {
        cuerpo.add(Anilla())
    }

    private fun decrecer() {
        if (cuerpo.size > 1) {
            cuerpo.removeAt(cuerpo.size - 1)
        } else {
            morir()
        }
    }

    private fun mudarPiel() {
        /*println("Se muda la piel.")*/
        for (anilla in cuerpo.indices) {
            cuerpo[anilla] = Anilla()
        }
    }

    fun morir() {
        cuerpo.removeAll { true }
    }

    override fun toString(): String {
        var patronColores = ""

        for (anilla in cuerpo) {
            patronColores += anilla
        }

        return "Anillas = $patronColores, edad = $edad"
    }

}