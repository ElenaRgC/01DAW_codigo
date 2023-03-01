class OrdenReparacion(dron: Dron, tiempo: Int) : Orden() {

    var numDron = 0
    private var estadoInicial = ""
    private var estadoFinal = ""

    init {
        super.cantidadOrdenes++
        numOrden = super.cantidadOrdenes
        numDron = dron.numDron
        estadoInicial = dron.estado
        fecha = tiempo
        tipo = "Reparación"
    }

    fun actualizarEstado(dron: Dron) {
        estadoFinal = dron.reparar(this)
    }

}