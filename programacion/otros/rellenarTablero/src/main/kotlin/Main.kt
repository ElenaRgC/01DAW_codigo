fun main() { // Ines, Ramón y Elena
    // 0 vacio, 1 obstaculo, 2 persona, 3 ya ha pasado

    val LADO = tamanoTablero()
    var tablero = Array(LADO) { IntArray(LADO) }
    var hayZonasAisladas = true
    var posicionHuecoVacio = IntArray(2) { 0 } // fila, columna del adyacente libre

    val obstaculos = solicitarObstaculos(LADO)

    do {
        generarObstaculos(tablero, obstaculos)
        hayZonasAisladas = comprobarObstaculos(tablero, posicionHuecoVacio)

    } while (hayZonasAisladas == false)

    var posicionPersona = IntArray(2) { 0 } // fila, columna de la persona

    introducirPersona(tablero, posicionPersona)
    imprimirTablero(tablero)

    recorrerTablero(tablero, posicionPersona, posicionHuecoVacio)
    /*
        imprimirTablero(tablero)
    */

}

fun guardarAdyacenteVacio(huecoVacio: IntArray, fila: Int, col: Int) {
    huecoVacio[0] = fila
    huecoVacio[1] = col

}

fun comprobarAdyacentesInversa(tablero: Array<IntArray>, fila: Int, col: Int, huecoVacio: IntArray): Boolean {
    var i = fila + 1
    var j = col + 1

    while (i >= fila - 1) {
        j = col + 1
        while (j >= col - 1) {
            if (i >= 0 && i < tablero.size && j >= 0 && j < tablero[i].size) {
                if (i != fila || j != col) {
                    if (tablero[i][j] == 0 || tablero[i][j] == 3) {
                        if (tablero[i][j] == 0) {
                            guardarAdyacenteVacio(huecoVacio, i, j)
                        } else {
                            /*if (tablero[i][j] == 3) {
                                tablero[i][j] = 4
                            }*/
                            guardarAdyacenteVacio(huecoVacio, i, j)
                        }
                        return true
                    }
                }
            }
            j--
        }
        i--
    }
    return false
}

fun recorrerTablero(tablero: Array<IntArray>, posicionPersona: IntArray, huecoVacio: IntArray) {
    var estaVacio = false
    do {
        estaVacio = comprobarHueco(tablero, posicionPersona, huecoVacio)

        if (estaVacio) {

            tablero[posicionPersona[0]][posicionPersona[1]] = 3
            tablero[huecoVacio[0]][huecoVacio[1]] = 2

            posicionPersona[0] = huecoVacio[0]
            posicionPersona[1] = huecoVacio[1]

            imprimirTablero(tablero)

            /*comprobarAdyacentesInversa(tablero, posicionPersona[0], posicionPersona[1], huecoVacio)
            if (tablero[huecoVacio[0]][huecoVacio[1]] == 3) {
                tablero[huecoVacio[0]][huecoVacio[1]] = 4
            }*/
        }

    } while (!comprobarTableroLleno(tablero))

}

fun imprimirRecorrido() {
    println()
}

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
