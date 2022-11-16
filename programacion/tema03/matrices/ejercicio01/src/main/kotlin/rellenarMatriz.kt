import kotlin.random.Random

fun rellenarMatriz(matriz: Array<IntArray>, filas: Int, columnas:Int) {
    var i: Int = 0
    var j: Int = 0

    while (i < filas) {
        j = 0
        while (j < columnas) {
            matriz[i][j] = Random.nextInt(0,10)
            j++
        }
        i++
    }
    /*while (i < filas) {
        matriz[i][j] = Random.nextInt(0,10)
        j++
        if(j == columnas) {
            j = 0
            i++
        }
    }*/
}