fun comprobarAdyacentes(tablero: Array<IntArray>, fila: Int, col: Int): Boolean {
    var i = fila - 1
    var j = col - 1

    while (i <= fila + 1) {
        j = col - 1
        while (j <= col + 1) {
            if (i >= 0 && i < tablero.size && j >= 0 && j < tablero[i].size) {
                if (!(i == fila && j == col)) {
                    if (tablero[i][j] == 0) {
                        return true
                    }
                }
            }
            j++
        }
        i++
    }
    return false
}