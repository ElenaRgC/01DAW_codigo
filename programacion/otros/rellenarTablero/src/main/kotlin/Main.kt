fun main() { // Ines, Ramón y Elena
    // Valores: 0 vacio, 1 obstaculo, 2 persona, 3 ya ha pasado
    // Representación: 0 espacio, 1 [#], 2 O, 3 ·

    val LADO = tamanoTablero()
    var tablero = Array(LADO) { IntArray(LADO) }

    var huecoVacio = IntArray(2) { 0 } // fila, columna del adyacente libre
    var posicionPersona = IntArray(2) { 0 } // fila, columna de la persona

    val obstaculos = solicitarObstaculos(LADO)
    var hayZonasAisladas = true

    do {
        generarObstaculos(tablero, obstaculos)
        hayZonasAisladas = comprobarObstaculos(tablero)

    } while (hayZonasAisladas == false)

    introducirPersona(tablero, posicionPersona)
    imprimirTablero(tablero)

    var recorrido = "(${posicionPersona[0] + 1}, ${posicionPersona[1] + 1}) "

    recorrido = recorrerTablero(tablero, posicionPersona, huecoVacio, recorrido)
    println(recorrido)

}


/* Esta función se creó para mejorar comprobarAdyacentes(),
   pero no está en uso porque no está completa */
fun comprobarAdyacenteN(tablero: Array<IntArray>, elemento: IntArray, lado: Int): Boolean {
    val fila = elemento[0]
    val col = elemento[1]
    var n = 0

    while (n <= lado) {
        if (fila >= n && tablero[fila - n][col] == 0) return true
        if (fila < tablero.size - n  && tablero[fila + n][col] == 0) return true
        if (col >= n && tablero[fila][col - n] == 0) return true
        if (col < tablero[fila].size - n && tablero[fila][col + n] == 0) return true
        n++
    }
    return false
}



