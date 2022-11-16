fun mostrarMatriz(matriz: Array<IntArray>) {
    var i: Int = 0
    var j: Int = 0

    while (i < matriz.size) {
        j = 0
        while (j < matriz[0].size) {
            print("[${matriz[i][j]}] ")
            j++
        }
        println("")
        i++
    }
}