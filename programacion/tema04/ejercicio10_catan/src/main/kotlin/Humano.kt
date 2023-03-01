class Humano: Jugador() {

    fun elegirCasilla(mapa: Mapa) {
        println("Elige la fila de la casilla:")
        var filaHumano = readln().toInt()
        println("Elige la columna de la casilla")
        var colHumano = readln().toInt()

        for (casilla in mapa.tablero) {
            if (casilla.fila == filaHumano && casilla.col == colHumano) {
                casilla.propietario = this
            }
        }
    }

    override fun toString(): String {
        return "Humano"
    }

}