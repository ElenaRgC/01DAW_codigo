class Dron {
    var estado: String = "Operativo" // Operativo, Inactivo o Fallido
    private var numDron: Int

    companion object {
        var cantidadDronesCreados = 0
    }


    constructor() {
        cantidadDronesCreados++
        numDron = cantidadDronesCreados
    }

    fun estropearse() {
        estado = "Inactivo"
    }
}