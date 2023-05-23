class MujerSanadora: Mujer {

    constructor()

    constructor(nombre: String, edad: Int, inteligencia: Int) {
        this.nombre = nombre
        this.edad = edad
        this.inteligencia = inteligencia
    }

    fun aumentarEsperanzaVida(serVivo: SerVivo) {
        serVivo.esperanzaVida++
    }

    override fun analizarTarea(tarea: Tarea): Boolean {

        var puedeRealizar: Boolean

        if (edad > tarea.edadMinima
            && inteligencia > tarea.gradoResolucion
            && tarea.tipo != Constantes.Fuerza) {

            println("Puedo realizar esta tarea.")
            puedeRealizar = true
        } else {
            println("No puedo realizar esta tarea.")
            puedeRealizar = false
        }

        return puedeRealizar
    }

}