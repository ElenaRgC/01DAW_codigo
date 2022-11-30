fun imprimirMatriz(matriz: Array<IntArray>) {
    var i: Int = 0
    var j: Int = 0

    while (i < matriz.size) {
        j = 0
        while (j < matriz[i].size) {
            print("[${matriz[i][j]}] ")
            j++
        }
        println("")
        i++
    }
}