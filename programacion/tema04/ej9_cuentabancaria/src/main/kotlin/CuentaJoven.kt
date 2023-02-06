class CuentaJoven: Cuenta() {
    var comision = false

    companion object {
        var afortunados = 1000
    }

    init {
        afortunados--
    }

    override fun ingresarDinero(cantidad: Double) {
        if (cantidad > 0) {
            super.ingresarDinero(cantidad + 50) // "super" llama a la superclase Cuenta
        }
    }
}
