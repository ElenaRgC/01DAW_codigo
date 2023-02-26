open class Orden {

    var cantidadOrdenes = 0

    var completado = false
    var pendiente = true
    var fecha: Int = 0
    var numOrden = 0

    constructor() {
        cantidadOrdenes++
        numOrden = cantidadOrdenes
    }

    fun mostrarInfo() {
        println() //TODO
    }

    fun completar() {
        completado = true
        pendiente = false
    }

    fun fallar() {
        pendiente = false
    }

}