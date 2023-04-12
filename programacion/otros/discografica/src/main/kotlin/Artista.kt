class Artista {
    var cod: Int = 0
    var nombre_artistico: String = ""
    var apellido: String = ""
    var nombre: String = ""

    constructor()

    constructor(cod: Int, nombre_artistico: String, apellido: String, nombre: String){
        this.cod = cod
        this.nombre_artistico = nombre_artistico
        this.apellido = apellido
        this.nombre = nombre
    }

    override fun toString(): String {
        return "$nombre_artistico: COD= $cod, Nombre = $apellido $nombre"
    }

}