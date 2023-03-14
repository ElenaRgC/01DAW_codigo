class Tablero {
    var N = 3
    var tablero = Array<IntArray>(N) { IntArray(N) { -1 } }
    var ganador: Int = -1 // Si gana el HUMANO -> 0 si gana el PC -> 1
    var estaLleno = false

    constructor() {
    }

    fun turnoJugador() {
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

                if (i < 0 || i > this.tablero.size || j < 0 || j > this.tablero.size) {
                    println("Las filas y columnas deben estar entre 1 y 3.")
                }
            } while (i < 0 || i > this.tablero.size || j < 0 || j > this.tablero.size)

            if (this.tablero[i][j] == -1) {
                this.tablero[i][j] = 1
            } else {
                println("Esa casilla ya esta ocupada")
                i = 10
            }
        } while (i > this.tablero.size)

    }

    fun turnoPC() {
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

            if (this.tablero[i][j] == -1) {
                this.tablero[i][j] = 0
            } else {
                println("El PC ha intentado poner una ficha en una casilla ocupada \n El PC va a volver a intentarlo")
                i = 10
            }
        } while (i > tablero.size || j > tablero.size)

    }

    fun comprobarVictoria(jugadorActual: Int) {

        // Comprobamos las filas
        for (i in 0..2) {
            if (this.tablero[i][0] == jugadorActual && this.tablero[i][1] == jugadorActual && this.tablero[i][2] == jugadorActual) {
                ganador = jugadorActual
            }
        }

        // Comprobamos las columnas
        for (i in 0..2) {
            if (this.tablero[0][i] == jugadorActual && this.tablero[1][i] == jugadorActual && this.tablero[2][i] == jugadorActual) {
                ganador = jugadorActual
            }
        }

        // Comprobamos las diagonales
        if (this.tablero[1][1] == jugadorActual) {
            if (this.tablero[0][0] == jugadorActual && this.tablero[2][2] == jugadorActual) { // diagonal principal
                ganador = jugadorActual
            } else if (this.tablero[0][2] == jugadorActual && this.tablero[2][0] == jugadorActual) { // segunda diagonal
                ganador = jugadorActual
            }
        }
    }

    override fun toString(): String {
        var impresion = ""
        var fila = 0
        var col = 0

        while (fila < tablero.size) {
            col = 0
            impresion+= "|"
            while (col < tablero[fila].size) {
                when(tablero[fila][col]){
                    -1 -> impresion += "   "
                    0 -> impresion += " O "
                    1 -> impresion += " X "
                }
                impresion+= "|"
                col++
            }
            impresion += "\n"
            fila++
        }

        return impresion

    }

    fun comprobarLleno() {
        var numCasillasLlenas = 0

        for (fila in tablero) {
            for (elemento in fila) {
                if (elemento != -1) {
                    numCasillasLlenas++
                }
            }
        }

        estaLleno = numCasillasLlenas == 9

    }

}