open class SerVivo {

    var esperanzaVida = 120
    var nombre = ""
    var edad = 0

    constructor()

    constructor(nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad
    }

    fun tiempoRestante(): Int {
        return esperanzaVida - edad
    }

    fun analizarEstado(): String {
        var estado = ""

        when (tiempoRestante()) {
            in (20..120) -> estado = "Estoy muy vivo."
            in (2..5)  -> estado = "Estoy al borde de la muerte"
            0 -> estado = "Estoy muerto."
            else -> estado = "Aquí estoy."
        }

        return estado
    }

    override fun toString(): String {
        return "Ser Vivo: esperanzaVida=$esperanzaVida, nombre='$nombre', edad=$edad"
    }


}