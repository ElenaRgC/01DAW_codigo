fun comprobarHueco(tablero: Array<IntArray>, posicionPersona: IntArray, posicionHuecoVacio: IntArray): Boolean {
    var fila = posicionPersona[0]
    var col = posicionPersona[1]
    var i = fila - 1
    var j = col - 1

    while ((i <= fila + 1)) {
        j = col - 1
        while ((j <= col + 1)) {
            if (i >= 0 && i < tablero.size && j >= 0 && j < tablero[i].size) {
                if (!(i == fila && j == col)) {
                    if (tablero[i][j] == 0) {
                        posicionHuecoVacio[0] = i
                        posicionHuecoVacio[1] = j
                        return true
                    } else if (tablero[i][j] == 3) {
                        posicionHuecoVacio[0] = i
                        posicionHuecoVacio[1] = j
                    }
                }
            }
            j++
        }
        i++
    }

    if (tablero[posicionHuecoVacio[0]][posicionHuecoVacio[1]] == 3) {
        return true
    } else {
        return false
    }

}