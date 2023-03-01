import kotlin.random.Random

open class Jugador{

    var nombre = ""

    var almacenMadera = 0
    var almacenCarbon = 0
    var almacenTrigo = 0

    fun tirarDado(): Int {
        return Random.nextInt(1,7)
    }

    fun incrementarRecursos(tipoRecurso: String) {
        when (tipoRecurso.trim().lowercase()) {
            "trigo" -> almacenTrigo++
            "madera" -> almacenMadera++
            "carbon" -> almacenCarbon++
        }
    }

    fun haGanado(): Boolean {
        return almacenCarbon >= 20 && almacenMadera >= 20 && almacenTrigo >= 20
    }
}