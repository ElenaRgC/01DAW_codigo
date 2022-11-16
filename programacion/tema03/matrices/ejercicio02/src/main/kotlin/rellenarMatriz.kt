import kotlin.random.Random

fun rellenarMatriz(matriz: Array<IntArray>) {
    var i: Int = 0
    var j: Int = 0

    while (i < matriz.size) {
        j = 0
        while (j < matriz[0].size) {
            matriz[i][j] = Random.nextInt(0,10)
            j++
        }
        i++
    }
}