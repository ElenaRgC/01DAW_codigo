fun imprimirTablero(tablero: Array<IntArray>) {
    var fila = 0
    var col = 0

    while (fila < tablero.size) {
        col = 0
        while (col < tablero[fila].size) {
            print("[${tablero[fila][col]}] ")
            col++
        }
        println("")
        fila++
    }
}