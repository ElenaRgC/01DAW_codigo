import java.io.Serializable

class Pelicula: Serializable {

    var titulo = ""
    var director = ""
    var duracion = 0
    var anoLanzamiento = 0

    constructor()

    constructor(titulo: String, director: String, duracion: Int, ano: Int) {
        this.titulo = titulo
        this.director = director
        this.duracion = duracion
        this.anoLanzamiento = ano
    }

    override fun toString(): String {
        return "$titulo por $director ($anoLanzamiento), $duracion minutos."
    }

}