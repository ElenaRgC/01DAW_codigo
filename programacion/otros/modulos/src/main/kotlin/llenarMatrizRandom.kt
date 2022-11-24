import kotlin.random.Random

fun llenarMatrizRandom(matriz: Array<IntArray>, minimo:Int, maximo: Int) {
    var i: Int = 0
    var j: Int = 0

    while (i < matriz.size) {
        j = 0
        while (j < matriz.size) {
            matriz[i][j] = Random.nextInt(minimo, maximo)
            j++
        }
        i++
    }
}