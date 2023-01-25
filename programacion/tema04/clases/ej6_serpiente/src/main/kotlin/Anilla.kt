import kotlin.random.Random

class Anilla {
    private var color: String = elegirColor()

    private fun elegirColor(): String {
        var colores = Random.nextInt(0, 3)
        when (colores) {
            0 -> return "r"
            1 -> return "v"
            2 -> return "a"
        }
        return ""
    }

    override fun toString(): String {
        return color
    }

}