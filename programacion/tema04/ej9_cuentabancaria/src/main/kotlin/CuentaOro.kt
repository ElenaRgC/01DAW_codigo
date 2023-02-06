class CuentaOro: Cuenta() {

    var esCuentaOro = true

    override fun sacarDinero(cantidad: Double): Boolean {
        var operacionCorrecta = false
        if (cantidad > 0) {
            operacionCorrecta = super.sacarDinero(cantidad)
            comprobarCuentaOro()
        }
        return operacionCorrecta
    }

    fun comprobarCuentaOro() {
        if (getSaldo() < 1000) {
            esCuentaOro = false
        } else {
            esCuentaOro = true
        }
    }
}
