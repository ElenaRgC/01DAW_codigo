import kotlin.random.Random

open class Maquina: Jugador() {

    fun elegirCasilla(mapa: Mapa) {
        var filaMaquina = Random.nextInt(0, mapa.maxfilas)
        var colMaquina = Random.nextInt(0, mapa.maxcols)
        println("La máquina ha elegido la casilla ($filaMaquina, $colMaquina).")

        for (casilla in mapa.tablero) {
            if (casilla.fila == filaMaquina && casilla.col == colMaquina) {
                casilla.propietario = this
            }
        }
    }

    override fun toString(): String {
        return "Maquina"
    }

}