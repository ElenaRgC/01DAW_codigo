import kotlin.random.Random

class GrupoPokemon {

    companion object {
        var cantidadGrupos = 0
    }

    var nombre = ""
    var grupo = arrayOfNulls<Pokemon>(0)

    constructor(numPokemon: Int) {
        cantidadGrupos++
        grupo = arrayOfNulls(numPokemon)
        this.nombre = "Grupo" + cantidadGrupos
    }

    fun estaLleno(): Boolean {
        for (pokemon in grupo) {
            if (pokemon == null) {
                return false
            }
        }
        return true
    }

    fun precioMedio(): Double {
        var cantidadPoke = 0
        var valorTotal = 0
        for (pokemon in grupo) {
            if (pokemon != null) {
                cantidadPoke++
                valorTotal += pokemon.precio
            }
        }
        return (valorTotal / cantidadPoke).toDouble()
    }

    fun anadirPokemon(pokemon: Pokemon) {
        if (!estaLleno()) {
            var i = 0
            while (i < grupo.size) {
                grupo[i] = pokemon
                i = grupo.size
            }
        }
    }

    fun llenarGrupo() {
        if (!estaLleno()) {
            var i = 0
            while (i < grupo.size) {
                var aleatorio = Random.nextInt(2)
                var pokemon: Pokemon
                when (aleatorio) {
                    0 -> pokemon = PokemonAgua()
                    1 -> pokemon = PokemonCielo()
                    else -> pokemon = PokemonTierra()
                }
                anadirPokemon(pokemon)
                i++
            }
        }
    }

    override fun toString(): String {
        return nombre
    }
}