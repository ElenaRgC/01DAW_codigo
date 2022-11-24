fun llenarMatrizUsuario(matriz: Array<IntArray>) {
    var i: Int = 0
    var j: Int = 0

    while (i < matriz.size) {
        j = 0
        while (j < matriz.size) {
            println("Introduce un numero para la posicion (${i+1}, ${j+1})")
            matriz[i][j] = readln().toInt()
            j++
        }
        i++
    }
}