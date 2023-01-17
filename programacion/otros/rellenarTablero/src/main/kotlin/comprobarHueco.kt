fun comprobarHueco(tablero: Array<IntArray>, posicionPersona: IntArray, posicionHuecoVacio: IntArray): Boolean {
    var fila = posicionPersona[0]
    var col = posicionPersona[1]
    var i: Int
    var j: Int
    var hayHueco = false

    var n = 0

    do {
        when (n) {
            0 -> {
                i = fila - 1
                j = col - 1
                hayHueco = recorrerHueco(tablero,i,j,fila,col,posicionHuecoVacio,1,1)
            }
            1 -> {
                i = fila + 1
                j = col + 1
                hayHueco = recorrerHueco(tablero,i,j,fila,col,posicionHuecoVacio,-1,-1)
            }
            2 -> {
                i = fila - 1
                j = col + 1
                hayHueco = recorrerHueco(tablero,i,j,fila,col,posicionHuecoVacio,1,-1)
            }
            3 -> {
                i = fila + 1
                j = col - 1
                hayHueco = recorrerHueco(tablero,i,j,fila,col,posicionHuecoVacio,-1,1)
            }

        }
        n++

    } while (!hayHueco && n < 4)

        return hayHueco || tablero[posicionHuecoVacio[0]][posicionHuecoVacio[1]] == 3

}