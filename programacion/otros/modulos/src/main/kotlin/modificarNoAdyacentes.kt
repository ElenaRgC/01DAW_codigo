fun modificarNoAdyacentes(matriz: Array<IntArray>, i: Int, j: Int) {
    for (x in 0..matriz.size-1) {
        for (y in 0..matriz[x].size-1) {
            if (x != i-1 && x != i && x != i+1) {
                matriz[x][y] = 0
            }
            if (y != j-1 && y != j && y != j+1) {
                matriz[x][y] = 0
            }
        }
    }
}