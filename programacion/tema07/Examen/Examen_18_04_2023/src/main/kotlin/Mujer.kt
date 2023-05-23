open class Mujer: SerVivo {

    var inteligencia = 0

    constructor()

    constructor(nombre: String, edad: Int, inteligencia: Int) {
        this.nombre = nombre
        this.edad = edad
        this.inteligencia = inteligencia
    }

    open fun analizarTarea(tarea: Tarea): Boolean {

        var puedeRealizar: Boolean

        if (edad > tarea.edadMinima && inteligencia > tarea.gradoResolucion){
            println("Puedo realizar esta tarea.")
            puedeRealizar = true
        } else {
            println("No puedo realizar esta tarea.")
            puedeRealizar = false
        }

        return puedeRealizar
    }

    override fun toString(): String {
        return "Mujer: esperanzaVida=$esperanzaVida, nombre='$nombre', edad=$edad, inteligencia=$inteligencia"
    }


}