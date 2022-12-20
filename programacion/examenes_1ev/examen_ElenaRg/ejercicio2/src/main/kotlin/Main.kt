import kotlin.random.Random

fun main(args: Array<String>) { //Elena Rodríguez Calderón
    // vacío, O, S
    // 0, 1, 2

    val FILAS = 5
    val COLUMNAS = 5

    var tablero: Array<IntArray> = Array(FILAS) {IntArray(COLUMNAS){0}}
    var tableroLleno = false

    var entradaUsuario = 0
    var entradaOrdenador = 0

    var posicionUsuario = Array(2){0}
    var posicionOrdenador = Array(2){0}

    var puntuacionUsuario = 0
    var puntuacionOrdenador = 0

    do {
        entradaOrdenador = generarLetra()
        posicionarOrdenador(tablero, entradaOrdenador, posicionOrdenador)
        println("Tu oponente ha jugado.")
        imprimirTablero(tablero)
        if (entradaOrdenador != 1) {
            puntuacionOrdenador += comprobarOso(tablero, posicionOrdenador)
        }

        if (!tableroLleno) { // Da la casualidad de que se llena en el turno del jugador antes de llegar al while
            entradaUsuario = pedirLetra()
            posicionarUsuario(tablero, entradaUsuario, posicionUsuario)
            imprimirTablero(tablero)

            if (entradaUsuario != 1) {
            puntuacionUsuario += comprobarOso(tablero, posicionUsuario)
            }
        }

        tableroLleno = comprobarTableroLleno(tablero)
    } while(!tableroLleno)

    println("Puntos PC: $puntuacionOrdenador")
    println("Puntos Humano: $puntuacionUsuario")
}

fun comprobarOso(matriz: Array<IntArray>, posicion: Array<Int>): Int {
    var fila = posicion[0]
    var col = posicion[1]
    var puntos = 0

    if (fila+1 < matriz.size && fila-1 > 0 && col+1 < matriz[0].size && col-1 > 0) {
        if ((matriz[fila - 1][col - 1] == 1) && (matriz[fila + 1][col + 1] == 1)) {
            puntos++
        }

        if ((matriz[fila - 1][col + 1] == 1) && (matriz[fila + 1][col - 1] == 1)) {
            puntos++
        }
    }

    if (puntos > 0) {
        println("En esta jugada se han ganado $puntos punto/s.")
    }
    return puntos

}

fun comprobarCasilla(fila: Int, columna: Int, matriz: Array<IntArray>): Boolean {
    return matriz[fila][columna] == 0
}

fun posicionarOrdenador(matriz: Array<IntArray>, entradaOrdenador: Int, posicionOrdenador: Array<Int>) {
    var casillaLibre = false

    do {
        posicionOrdenador[0] = Random.nextInt(0, matriz.size)
        posicionOrdenador[1] = Random.nextInt(0, matriz.size)

        casillaLibre = comprobarCasilla(posicionOrdenador[0], posicionOrdenador[1], matriz)

    } while (!casillaLibre)

    matriz[posicionOrdenador[0]][posicionOrdenador[1]] = entradaOrdenador

}

fun posicionarUsuario(matriz: Array<IntArray>, entradaUsuario: Int, posicionUsuario: Array<Int>) {
    var casillaLibre = false

    do {
        println("En que fila quieres meter tu letra?")
        posicionUsuario[0] = readln().toInt() - 1
        println("En que columna quieres meter tu letra?")
        posicionUsuario[1] = readln().toInt() - 1

        casillaLibre = comprobarCasilla(posicionUsuario[0], posicionUsuario[1], matriz)
        if (!casillaLibre) {
            println("Ya se ha jugado en esa casilla.")
        }

    } while (!casillaLibre)

    matriz[posicionUsuario[0]][posicionUsuario[1]] = entradaUsuario

}

fun imprimirTablero(matriz: Array<IntArray>) {
    for (fila in matriz) {
        for (elemento in fila) {
            when (elemento) {
                0 -> print("[ ]")
                1 -> print("[O]")
                2 -> print("[S]")
            }
        }
        println("")
    }
}

fun generarLetra():Int {
    return Random.nextInt(1,3)
}

fun pedirLetra(): Int {
    var jugada = 0
    var input = ""
    do {
    println("Introduce S u O.")
    input = readln().lowercase().trim()
    when (input) {
        "o"-> jugada = 1
        "s"-> jugada = 2
    }

    } while (jugada == 0)

    return jugada

}

fun comprobarTableroLleno(matriz: Array<IntArray>):Boolean {
    for (fila in matriz) {
        for (elemento in fila) {
            if (elemento == 0) {
            return false
            }
        }
    }
    return true
}