fun estarRepetido(arrayNumeros: IntArray, numeroQueComprobar: Int, iteraciones: Int): Boolean {
    var estaRepetido: Boolean = false
    var i: Int = 0

    while (i < iteraciones) {
        if (arrayNumeros[i] == numeroQueComprobar) {
            estaRepetido = true
            break
        }
        i++
    }

    return estaRepetido
}