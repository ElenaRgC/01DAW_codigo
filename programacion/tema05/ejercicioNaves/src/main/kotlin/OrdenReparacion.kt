import kotlin.random.Random

class OrdenReparacion(dron: Dron) : Orden() {

    private var numDron = 0
    private var estadoInicial = ""
    private var estadoFinal = ""

    init {
        super.cantidadOrdenes++
        numOrden = super.cantidadOrdenes
        numDron = dron.numDron
        estadoInicial = dron.estado
        estadoFinal = reparar()
    }

    private fun reparar(): String {
        pendiente = false

        return if (Random.nextBoolean()) {
            "Operativo"
        } else {
            "Fallido"
        }

    }

}