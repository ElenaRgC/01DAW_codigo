class MujerGuerrera: Mujer {

    var fuerza = 0
    var inventario = ArrayList<Utensilio>()
    var animales = ArrayList<Animal>()

    constructor()

    constructor(nombre: String, edad: Int, inteligencia: Int, fuerza: Int) {
        this.nombre = nombre
        this.edad = edad
        this.inteligencia = inteligencia
        this.fuerza = fuerza
    }

    fun guardarUtensilio(utensilio: Utensilio) {
        inventario.add(utensilio)
    }

    fun fuerzaTotal(): Int {
        var fuerzaTotal = this.fuerza
        for (utensilio in inventario) {
            fuerzaTotal += utensilio.fuerza
        }

        for (animal in animales) {
            fuerzaTotal += animal.fuerza
        }

        return fuerzaTotal
    }

    override fun analizarTarea(tarea: Tarea): Boolean {

        var puedeRealizar: Boolean

        if (edad > tarea.edadMinima
            && inteligencia > tarea.gradoResolucion
            && tarea.tipo == Constantes.Fuerza
            && fuerzaTotal() > tarea.cantidadFuerza) {

            println("Puedo realizar esta tarea.")
            puedeRealizar = true
        } else {
            println("No puedo realizar esta tarea.")
            puedeRealizar = false
        }

        return puedeRealizar
    }

    fun tieneAnimales(): Boolean {

        for (animal in animales) {
            println(animal)
        }

        return animales.isNotEmpty()
    }

    fun adoptarAnimal(animal: Animal) {
        animales.add(animal)
        animal.esLibre = false
    }

    override fun toString(): String {
        return "Mujer Guerrera: esperanzaVida=$esperanzaVida, nombre='$nombre', edad=$edad, inteligencia=$inteligencia, fuerza=$fuerza, inventario=$inventario, animales=$animales."
    }


}