import kotlin.random.Random

class PokemonCielo(): Pokemon() {

    companion object {
        var cantidadPokemon = 0
    }

    var alturaVuelo = 0
    var numHorasVuelo = 0

    init {
        cantidadPokemon++
        tipo = "cielo"
        alturaVuelo = Random.nextInt(10,21)
        numHorasVuelo = Random.nextInt(1000, 100000)

    }

    override fun calcularMediaCalidad(): Int {
        try {
            return alturaVuelo/precio
        } catch (e: Exception) {
            return 0
        }
    }

    override fun generarNombre() {
        nombre = "tipo" + cantidadPokemon
    }

    override fun toString(): String {
        return super.toString() + "Altura de Vuelo: $alturaVuelo, Horas de Vuelo: $numHorasVuelo"
    }

}