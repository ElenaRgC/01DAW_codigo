fun crearMatrizAdyacentes (matriz: Array<IntArray>, i: Int, j: Int): Array<IntArray> {
    val matrizAdyacentes = Array(3) { IntArray(3) }
    for (x in 0..2) {
        for (y in 0..2) {
            matrizAdyacentes[x][y] = matriz[i-1+x][j-1+y]
        }
    }
    return matrizAdyacentes
}