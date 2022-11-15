fun sumarMatrices(matriz1: Array<IntArray>, matriz2: Array<IntArray>, matrizSuma:Array<IntArray>, filas: Int, columnas:Int) {
    var i: Int = 0
    var j: Int = 0

    while (i < filas) {
        j = 0
        while (j < columnas) {
            matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j]
            j++
        }
        i++
    }

}