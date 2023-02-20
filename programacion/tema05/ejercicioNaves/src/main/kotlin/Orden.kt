open class Orden {

    companion object {
        var cantidadOrdenes = 0
    }

    var completado = false
    var pendiente = true
    var fecha: Int = 0

    constructor() {
        cantidadOrdenes++
    }

    fun mostrarInfo() {
        println() //TODO
    }

}