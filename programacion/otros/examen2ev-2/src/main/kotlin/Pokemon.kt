import kotlin.random.Random

open class Pokemon {

    var nombre = ""
    var precio = 0
    var tipo = ""
    var valoracion = 0
    var mediaCalidad = 0

    constructor() {
        precio = Random.nextInt(0,101)
        mediaCalidad = calcularMediaCalidad()
    }

    open fun calcularMediaCalidad(): Int {
        try {
            return precio/valoracion
        } catch (e: Exception) {
            return 0
        }
    }

    open fun generarNombre() {
    }

    override fun toString(): String {
        return "Nombre: $nombre, Precio: $precio, Tipo: $tipo, Valoracion: $valoracion, Media Calidad: $mediaCalidad, "
    }

}