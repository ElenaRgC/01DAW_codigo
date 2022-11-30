import kotlin.random.Random

fun generarMatriz(matriz: Array<IntArray>, fila: Int, columna: Int) {
    var i = 0
    var j = 0

    while (i < fila) {
        j = 0
        while (j < columna) {
            matriz[i][j] = Random.nextInt(-10,10)
            j++
        }
        i++
    }
}