fun main() { // Ines, Ramón y Elena
    // 0 vacio, 1 obstaculo, 2 persona, 3 ya ha pasado
    // espacio, [#], O, ·

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


