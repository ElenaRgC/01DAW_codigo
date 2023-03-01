fun main() { // Elena Rodríguez Calderón

    var mapa = Mapa(3,4)
    var humano = Humano()
    var maquina = Maquina()

    var tirada = 0

    while(!mapa.estanTodasOcupadas()) {
        humano.elegirCasilla(mapa)

        if (!mapa.estanTodasOcupadas()) {
            maquina.elegirCasilla(mapa)
        }
    }

    do {
        tirada = humano.tirarDado()
        for (casilla in mapa.tablero) {
            if (casilla.valor == tirada) {
                casilla.propietario?.incrementarRecursos(casilla.recurso)
                println("${casilla.propietario} ha obtenido ${casilla.recurso}.")
            }
        }

        tirada = maquina.tirarDado()
        for (casilla in mapa.tablero) {
            if (casilla.valor == tirada) {
                casilla.propietario?.incrementarRecursos(casilla.recurso)
                println("${casilla.propietario} ha obtenido ${casilla.recurso}.")

            }
        }
    } while (!humano.haGanado() || !humano.haGanado())
}