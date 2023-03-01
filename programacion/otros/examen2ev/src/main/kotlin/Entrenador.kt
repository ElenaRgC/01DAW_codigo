class Entrenador {

    companion object {
        var cantidad = 0
    }

    var grupos = arrayOfNulls<GrupoPokemon>(0)

    constructor(cantidadGrupos: Int) {
        if (cantidad < 2) {
        cantidad++
        grupos = arrayOfNulls(cantidadGrupos)
        }
    }

    override fun toString(): String {
        var informe = ""

        for (grupo in grupos) {
            informe += grupo?.nombre
            if (grupo != null) {
                for (pokemon in grupo.grupo) {
                    informe += pokemon
                }
            }
        }

        return informe
    }

}