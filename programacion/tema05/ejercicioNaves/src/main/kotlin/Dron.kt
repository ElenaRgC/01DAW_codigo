import kotlin.random.Random

class Dron {
    var estado: String = "Operativo" // Operativo, Inactivo o Fallido
    var numDron: Int

    companion object {
        var cantidadDronesCreados = 0
    }

    init {
        cantidadDronesCreados++
        numDron = cantidadDronesCreados
    }

    fun estropearse() {
        estado = "Inactivo"
        println("Se ha estropeado el dron $numDron.")
    }

    fun reparar() {
        if (Random.nextBoolean()) {
            estado = "Operativo"
            println("Se ha reparado el dron $numDron.")
        } else {
            estado = "Fallido"
            println("Ha fallado la reparación del dron $numDron.")
        }
    }

    override fun toString(): String {
        return "$numDron se encuentra en estado $estado."
    }
}