class Cuenta {
    var titulares = ArrayList<Titular>()

    companion object {
        var cantidadTitulares = 0
    }

    constructor() {
        cantidadTitulares++
    }
}