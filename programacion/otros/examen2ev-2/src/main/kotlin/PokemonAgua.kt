import kotlin.random.Random

class PokemonAgua() : Pokemon() {

    companion object {
        var cantidadPokemon = 0
    }

    var tematica = ""
    var numAmigos = 0

    init {
        cantidadPokemon++
        tipo = "agua"
        tematica = determinarTematica()
        numAmigos = Random.nextInt(1,5)
    }


    override fun calcularMediaCalidad(): Int {
        try {
            return precio/valoracion
        } catch (e: Exception) {
            return 1
        }
    }

    fun determinarTematica(): String {
        var aleatorio = Random.nextInt(3)
        when (aleatorio) {
            0 -> return "pez"
            1 -> return "arrecife"
            2 -> return "depredador"
            else -> return "medusa"
        }
    }

    override fun generarNombre() {
        nombre = "tipo" + cantidadPokemon
    }

    override fun toString(): String {
        return super.toString() + "Tematica: $tematica, Numero Amigos: $numAmigos"
    }

}