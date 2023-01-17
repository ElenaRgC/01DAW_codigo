fun imprimirTablero(tablero: Array<IntArray>) {
    var fila = 0
    var col = 0

    while (fila < tablero.size) {
        col = 0
        print("|")
        while (col < tablero[fila].size) {

            when (tablero[fila][col]) {
                0 -> print("   ")
                1 -> print("[#]")
                2 -> print(" O ")
                3 -> print(" · ")
                4 -> print(" * ")
            }

            col++
        }
        print("|")
        println("")
        fila++
    }
    println()
}