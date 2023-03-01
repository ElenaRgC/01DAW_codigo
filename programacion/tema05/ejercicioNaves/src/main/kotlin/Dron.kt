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
    }

    fun reparar(orden: OrdenReparacion): String {
        orden.pendiente = false

        return if (Random.nextBoolean()) {
            "Operativo"
        } else {
            "Fallido"
        }

    }
}