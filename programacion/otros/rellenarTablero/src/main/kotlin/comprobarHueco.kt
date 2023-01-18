import kotlin.random.Random

fun comprobarHueco(tablero: Array<IntArray>, posicionPersona: IntArray, posicionHuecoVacio: IntArray): Boolean {
    var fila = posicionPersona[0]
    var col = posicionPersona[1]
    var i: Int
    var j: Int
    var hayHueco = false

    var n = 0

    // La función original era solo la opción 0 del when.
    // El problema que surgía es que entraba en un bucle infinito si no había casillas sin pasar cerca.
    // El problema nuevo es que al ir de forma aleatoria, no tiene por qué ir en dirección al hueco sin pasar.

    do {
        when (n) {
            0 -> {
                i = fila - 1
                j = col - 1
                hayHueco = recorrerHueco(tablero,i,j,fila,col,posicionHuecoVacio,1,1)
            }
            1 -> {
                i = fila + 1
                j = col - 1
                hayHueco = recorrerHueco(tablero,i,j,fila,col,posicionHuecoVacio,-1,1)
            }
            2 -> {
                i = fila - 1
                j = col + 1
                hayHueco = recorrerHueco(tablero,i,j,fila,col,posicionHuecoVacio,1,-1)
            }
            3 -> {
                i = fila + 1
                j = col + 1
                hayHueco = recorrerHueco(tablero,i,j,fila,col,posicionHuecoVacio,-1,-1)
            }
            4 -> {
                when (Random.nextInt(0, 4)) {
                    0 -> {
                        i = fila - 1
                        j = col - 1
                        hayHueco = recorrerHueco(tablero,i,j,fila,col,posicionHuecoVacio,1,1)
                    }
                    1 -> {
                        i = fila + 1
                        j = col - 1
                        hayHueco = recorrerHueco(tablero,i,j,fila,col,posicionHuecoVacio,-1,1)
                    }
                    2 -> {
                        i = fila - 1
                        j = col + 1
                        hayHueco = recorrerHueco(tablero,i,j,fila,col,posicionHuecoVacio,1,-1)
                    }
                    3 -> {
                        i = fila + 1
                        j = col + 1
                        hayHueco = recorrerHueco(tablero,i,j,fila,col,posicionHuecoVacio,-1,-1)
                    }

                }
            }

        }
        n++

    } while (!hayHueco && n < 5)

        return hayHueco || tablero[posicionHuecoVacio[0]][posicionHuecoVacio[1]] == 3

}