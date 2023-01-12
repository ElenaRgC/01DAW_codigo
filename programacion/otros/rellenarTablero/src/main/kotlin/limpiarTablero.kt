fun limpiarTablero(tablero: Array<IntArray>) {
    var i = 0
    var j = 0

    while (i < tablero.size) {
        j = 0
        while (j < tablero[i].size) {
            tablero[i][j] = 0
            j++
        }
        i++

    }
}