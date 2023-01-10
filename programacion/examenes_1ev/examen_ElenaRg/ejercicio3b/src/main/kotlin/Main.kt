import kotlin.random.Random

fun main(args: Array<String>) { // Elena Rodríguez Calderón
    val N = 3
    val ENERGIAINICIAL = 100
    var campamento = Array(N * N) { ENERGIAINICIAL }
    var zona = -1
    var cantidadRestada = 0

    do {
        zona = alerta()
        if (zona != -1) {
            println("Nuevo ataque!")
            imprimirCampamento(campamento)
            println("Zona atacada: ${zona + 1}")
            if (campamento[zona] > 50) {
                atacarZona(zona, campamento)
            } else {
                println("La zona atacada tiene muy poca energía.")
            }
            imprimirCampamento(campamento)
            println("Atacando el campamento:")
            ataqueCampamento(campamento, Random.nextInt(1, 20))
            imprimirCampamento(campamento)
            aumentarEnergia(zona, campamento, 15)
        } else {
            println("No se están recibiendo ataques.")
        }

    } while (zona != -1)

}

fun atacarZona(zona: Int, campamento: Array<Int>) {
    println("Energía de la zona atacada: ${campamento[zona]}")
    if (zona == campamento.size) {
        campamento[zona] -= 50
    } else if ((zona + 1) % 2 == 0) {
        campamento[zona] = campamento[zona] / 2
    } else {
        campamento[zona] -= 7
    }

    println("Energía tras el ataque: ${campamento[zona]}")
}

fun alerta(): Int {
    return Random.nextInt(-1, 9)
}

fun ataqueCampamento(campamento: Array<Int>, cantidad: Int) {
    var zona = 0
    while (zona < campamento.size) {
        if (campamento[zona] != 0) {
            campamento[zona] -= cantidad
        }
        zona++
    }
}

fun nivelZona(zona: Int, campamento: Array<Int>): Int {
    return campamento[zona]
}

fun aumentarEnergia(zona: Int, campamento: Array<Int>, cantidad: Int) {
    campamento[zona] += cantidad
}

fun imprimirCampamento(campamento: Array<Int>) {
    var zona = 0
    while (zona < campamento.size) {
        print("[${campamento[zona]}] ")
        zona++
    }
    println()
}