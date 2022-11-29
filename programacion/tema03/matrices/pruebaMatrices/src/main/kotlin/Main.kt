import kotlin.random.Random

fun main() { //Elena Rodríguez Calderón

    // Crear vector con los valores fijos 1,2,3

    val V = intArrayOf(1,2,3)

    // Lo recorremos y lo sacamos por pantalla

    for (i in V.indices) {
        print("${V[i]} ")
    }
    println()

    // Crear matriz de enteros de 4x4 de enteros
    var M = Array(4) {IntArray(4)}

    // Lo recorremos y la llenamos de números aleatorios

    var i: Int = 0
    var j: Int = 0

    while (i < M.size) {
        j = 0
        while (j < M.size) {
            M[i][j] = Random.nextInt(1, 10)
            j++
        }
        i++
    }

    // La imprimimos por pantalla

    i = 0
    j = 0

    while (i < M.size) {
        j = 0
        while (j < M.size) {
            print("${M[i][j]} ")
            j++
        }
        println("")
        i++
    }

}