open class Orden {

    var cantidadOrdenes = 0
    var tipo = ""

    var completado = false
    var pendiente = true
    var fecha: Int = 0
    var numOrden = 0

    fun mostrarInfo() {
        println("Orden(cantidadOrdenes=$cantidadOrdenes, completado=$completado, pendiente=$pendiente, fecha=$fecha, numOrden=$numOrden)")
    }

    fun completar() {
        completado = true
        pendiente = false
    }

    fun fallar() {
        pendiente = false
    }


}