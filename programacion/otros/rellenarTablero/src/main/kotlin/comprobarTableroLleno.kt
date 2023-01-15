fun comprobarTableroLleno(matriz: Array<IntArray>):Boolean {
    for (fila in matriz) {
        for (elemento in fila) {
            if (elemento == 0) {
                return false
            }
        }
    }
    return true
}