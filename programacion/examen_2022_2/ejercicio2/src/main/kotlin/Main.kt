import kotlin.random.Random

fun main(args: Array<String>) { // Elena Rodríguez Calderón
    // Fuego > Tierra > Aire > Fuego
    // 0 > 1 > 2 > 0

    var manoJugador = 0
    var manoOrdenador = 0

    var victorias = arrayOf(0,0) // Jugador, Ordenador

    var cantidadJugadas = arrayOf(0,0,0) // Fuego, tierra, aire

    do {

        manoJugador = pedirJugada()
        manoOrdenador = generarJugada()

        jugar(manoJugador, manoOrdenador, victorias)
        contarJugadas(manoJugador, manoOrdenador, cantidadJugadas)

    } while (victorias[0] < 3 && victorias[1] < 3)

    println("Victorias jugador: ${victorias[0]}")
    println("Victorias ordenador: ${victorias[1]}")
    if (victorias[0] > victorias[1]) {
        println("Ganador: Jugador")
    } else {
        println("Ganador: Ordenador")
    }

    println("Numero de veces que se ha jugado fuego: ${cantidadJugadas[0]}")
}

fun pedirJugada(): Int {
    var mano = ""
    do {
        println("Introduce tu mano")
        mano = readln().trim().lowercase()
    } while (mano != "fuego" && mano != "tierra" && mano != "aire")

    var jugada = 0

    when (mano) {
        "tierra" -> jugada = 1
        "aire" -> jugada = 2
    }

    return jugada

}

fun generarJugada(): Int {
    return Random.nextInt(0,3)
}

fun jugar(jugador:Int, ordenador: Int, victorias: Array<Int>) {

    var victoriasActualesJ = victorias[0]
    var victoriasActualesO = victorias[1]

    when (jugador) {
        0 -> when (ordenador) {
            1 -> victorias[0]++
            2 -> victorias[1]++
        }
        1 -> when (ordenador) {
            0 -> victorias[1]++
            2 -> victorias[0]++
        }
        2 -> when (ordenador) {
            0 -> victorias[0]++
            1 -> victorias[1]++
        }
    }

    if (victoriasActualesJ < victorias[0]) {
        println("Has ganado.")
    } else if (victoriasActualesO < victorias[1]) {
        println("Has perdido.")
    } else {
        println("Empate.")
    }

}

fun contarJugadas(jugador:Int, ordenador: Int, jugadas: Array<Int>) {
    var i = 0

    while (i < jugadas.size) {
        if (jugador == i) {
            jugadas[i] ++
        }
        if (ordenador == i) {
            jugadas[i] ++
        }
        i++
    }
}