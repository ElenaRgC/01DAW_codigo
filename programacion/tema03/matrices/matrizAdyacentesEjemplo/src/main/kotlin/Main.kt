import kotlin.random.Random

fun main() { // Elena Rodríguez Calderón

    val N: Int = 5
    var m = Array(N){IntArray(N){0}}

    // arrayOf(IntArray(5){0})
    // Array(5){Array<Int>(5){0}}

    rellenarMatriz(m)
    imprimirMatriz(m)

    println()

    var i: Int = -1
    var j: Int = -1

    while (i < 2) {
        j = -1
        while (j < 2) {
            print("($i, $j) ")
            j++
        }
        println("")
        i++
    }

}

fun rellenarMatriz(matriz: Array<IntArray>) {
    for (i in matriz.indices) {
        for (j in matriz[i].indices) {
            matriz[i][j] = Random.nextInt(0,10)
            // matriz[i][j] = (1..9).random
        }
    }
}

fun imprimirMatriz(matriz: Array<IntArray>) {
    for (i in matriz.indices) {
        for (j in matriz[i].indices) {
            print("${matriz[i][j]} ")
        }
        println("")
    }
}