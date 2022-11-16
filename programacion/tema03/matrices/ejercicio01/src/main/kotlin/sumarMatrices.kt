fun sumarMatrices(matriz1: Array<IntArray>, matriz2: Array<IntArray>, matrizSuma:Array<IntArray>) {
    var i: Int = 0
    var j: Int = 0

    while (i < matriz1.size) {
        j = 0
        while (j < matriz1[0].size) {
            matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j]
            j++
        }
        i++
    }

}