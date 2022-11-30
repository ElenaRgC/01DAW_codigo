fun imprimirAdyacentes (matriz: Array<IntArray>, fila: Int, columna: Int, filaElemento:Int, colElemento: Int ) {
    var i = 0
    var j = 0

    while (i < fila) {
        j = 0
        while (j < columna) {
            if(filaElemento == i-1 || filaElemento == i|| filaElemento == i+1) {
                if(colElemento == j-1 || colElemento == j|| colElemento == j+1) {
                    if (filaElemento == i && colElemento == j) {
                        print("(*) ")
                    } else {
                        print("[${matriz[i][j]}] ")
                    }
                }
            }
            j++
        }
        println("")
        i++
    }
}