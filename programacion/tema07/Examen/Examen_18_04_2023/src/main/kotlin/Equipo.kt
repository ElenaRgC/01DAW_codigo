class Equipo {
    var miembros = ArrayList<MujerGuerrera>()

    constructor()

    constructor(listaGuerreras: ArrayList<MujerGuerrera>) {
        miembros = listaGuerreras
    }

    fun devolverMiembro(indice: Int): MujerGuerrera {
        return miembros[indice]
    }

    override fun toString(): String {
        return "Equipo: miembros=${miembros.size}"
    }


}