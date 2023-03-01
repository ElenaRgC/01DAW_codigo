import kotlin.random.Random

class PokemonTierra(): Pokemon() {


    companion object {
        var cantidadPokemon = 0
    }

    var fechaNacimiento = 0
    var alias = ""

    init {
        cantidadPokemon++
        tipo = "tierra"
        fechaNacimiento = Random.nextInt(1980,2010)
    }

    override fun calcularMediaCalidad(): Int {
        try {
            return valoracion/precio
        } catch (e: Exception) {
            return 0
        }
    }

    override fun generarNombre() {
        nombre = "tipo" + cantidadPokemon
    }

    override fun toString(): String {
        return super.toString() + "Fecha de nacimiento: $fechaNacimiento"
    }
}