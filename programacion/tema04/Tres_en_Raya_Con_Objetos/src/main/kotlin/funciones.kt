fun turnoJugador(tablero: Array<IntArray>): Boolean {
    var i: Int
    var j: Int

    println("----------------")
    println("TURNO DEL HUMANO")
    println("----------------")
    println()

    do {
        do {
            println("Dime la fila")
            i = TECLADO.nextInt() - 1

            println("Dime la columna")
            j = TECLADO.nextInt() - 1

            if (i < 0 || i > tablero.size || j < 0 || j > tablero.size) {
                println("Las filas y columnas deben estar entre 1 y 3.")
            }
        } while (i < 0 || i > tablero.size || j < 0 || j > tablero.size)

        if (tablero[i][j] == -1) {
            tablero[i][j] = 1
        } else {
            println("Esa casilla ya esta ocupada")
            i = 10
        }
    } while (i > tablero.size)

    imprimirTablero(tablero)

    if (comprobarVictoria(tablero, 1)) {
        println("Has ganado")
        return true
    }
    return false
}

fun turnoPC(tablero: Array<IntArray>): Boolean {
    var i: Int
    var j: Int

    println("------------")
    println("TURNO DEL PC")
    println("------------")
    println()

    do {
        i = (0..2).random()
        println("Fila del PC: $i")
        j = (0..2).random()
        println("Columna del PC: $j")

        if (tablero[i][j] == -1) {
            tablero[i][j] = 0
        } else {
            println("El PC ha intentado poner una ficha en una casilla ocupada \n El PC va a volver a intentarlo")
            i = 10
        }
    } while (i > tablero.size || j > tablero.size)

    imprimirTablero(tablero)

    if (comprobarVictoria(tablero, 0)) {
        println("Has perdido")
        return true
    }
    return false
}

fun imprimirTablero(tablero: Array<IntArray>) {
    var fila = 0
    var col = 0

    println()
    while (fila < tablero.size) {
        col = 0
        print("|")
        while (col < tablero[fila].size) {
            if (tablero[fila][col] == 0) {
                print(" O ")
            } else if (tablero[fila][col] == 1) {
                print(" X ")
            } else {
                print(" - ")
            }
            col++
        }
        print("|")
        println("")
        fila++
    }
    println()

}

fun comprobarTableroLleno(tablero: Array<IntArray>): Boolean {
    for (fila in tablero) {
        for (elemento in fila) {
            if (elemento == -1) {
                return false
            }
        }
    }
    return true
}

fun comprobarVictoria(tablero: Array<IntArray>, jugadorActual: Int): Boolean {

    // Comprobamos las filas
    for (i in 0..2) {
        if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) {
            return true
        }
    }

    // Comprobamos las columnas
    for (i in 0..2) {
        if (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual) {
            return true
        }
    }

    // Comprobamos las diagonales
    if (tablero[1][1] == jugadorActual) {
        if (tablero[0][0] == jugadorActual && tablero[2][2] == jugadorActual) { // diagonal principal
            return true
        } else if (tablero[0][2] == jugadorActual && tablero[2][0] == jugadorActual) { // segunda diagonal
            return true
        }
    }
    return false

    /* Hemos encontrado también esta opción para comprobar filas con all
    for (i in 0..2) {
        if (tablero[i].all {
            it == tirada
        })
            return true
    } */
}