import kotlin.random.Random

class Casilla {

    var propietario: Jugador? = null
    var recurso = ""
    var valor = 0

    var fila = 0
    var col = 0

    constructor(fila: Int, col: Int) {
        valor = Random.nextInt(1, 7)
        recurso = generarRecurso()

        this.fila = fila
        this.col = col
    }

    fun generarRecurso(): String {
        val RANDOM = Random.nextInt(1,3)

        when (RANDOM) {
            1 -> return "trigo"
            2 -> return "madera"
            else -> return "carbon"
        }
    }

    override fun toString(): String {
        return "$recurso \n $valor"
    }
}