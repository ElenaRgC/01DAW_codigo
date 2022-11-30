fun modificarAdyacentes(matriz: Array<IntArray>, i: Int, j: Int) {
    if (i > 0) {
        matriz[i-1][j] += 1
    }
    if (i < matriz.size-1) {
        matriz[i+1][j] += 1
    }
    if (j > 0) {
        matriz[i][j-1] += 1
    }
    if (j < matriz.size-1) {
        matriz[i][j+1] += 1
    }
}