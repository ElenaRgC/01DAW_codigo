fun recorrerTablero(tablero: Array<IntArray>, posicionPersona: IntArray, huecoVacio: IntArray, recorrido: String): String {
    var recorrido = recorrido
    var estaVacio = false
    do {
        estaVacio = comprobarHueco(tablero, posicionPersona, huecoVacio)

        if (estaVacio) {

            tablero[posicionPersona[0]][posicionPersona[1]] = 3
            tablero[huecoVacio[0]][huecoVacio[1]] = 2

            posicionPersona[0] = huecoVacio[0]
            posicionPersona[1] = huecoVacio[1]

            recorrido += "(${posicionPersona[0] + 1}, ${posicionPersona[1] + 1}) "

            imprimirTablero(tablero)
        }

    } while (!comprobarTableroLleno(tablero))

    return recorrido

}