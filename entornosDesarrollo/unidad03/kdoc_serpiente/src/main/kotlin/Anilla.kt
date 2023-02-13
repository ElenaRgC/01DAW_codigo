import kotlin.random.Random

/**
 * Anilla
 *
 * @constructor Crea una anilla con un color aleatorio
 */
class Anilla {
    /**
     * Color
     *
     * r = rojo
     * v = verde
     * a = amarillo
     */
    private var color: String = elegirColor()

    /**
     * Elegir color
     *
     * @return String color
     *
     * Selecciona un color aleatorio
     */
    private fun elegirColor(): String {
        var colores = Random.nextInt(0, 3)
        when (colores) {
            0 -> return "r"
            1 -> return "v"
            2 -> return "a"
        }
        return ""
    }

    /**
     * To string
     *
     * @return String color
     */
    override fun toString(): String {
        return color
    }

}