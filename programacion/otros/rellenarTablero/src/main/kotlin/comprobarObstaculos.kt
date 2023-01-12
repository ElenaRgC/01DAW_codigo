fun comprobarObstaculos(tablero: Array<IntArray>): Boolean {
    var fila = 0
    var col = 0

    while (fila < tablero.size) {
        col = 0
        while (col < tablero[fila].size) {

            if (!comprobarAdyacentes(tablero, fila, col)) {
                limpiarTablero(tablero)
                println("Regenerando obstáculos.")
                return false
            }

            col++
        }

        fila++
    }

    return true

}