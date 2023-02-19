open class Orden {

    companion object {
        cantidadOrdenes = 0
    }

    var completado = false
    var pendiente = true
    var fecha: Int

    constructor(fecha: Int) {
        cantidadOrdenes++
        this.fecha = fecha
    }

    fun mostrarInfo() {
        println() //TODO
    }

}