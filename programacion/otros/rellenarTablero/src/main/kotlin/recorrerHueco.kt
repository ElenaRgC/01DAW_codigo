fun recorrerHueco(
    tablero: Array<IntArray>,
    i: Int,
    j: Int,
    fila: Int,
    col: Int,
    posicionHuecoVacio: IntArray,
    incrementoI: Int,
    incrementoJ: Int
): Boolean {
    var i = i
    var j = j

    while ((i <= fila + 1 && fila >= fila -1)) {
        while ((j <= col + 1 && j >= col -1)) {
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
            j += incrementoJ
        }
        i += incrementoI
    }
    return false
}