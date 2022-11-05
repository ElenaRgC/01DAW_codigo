fun letraRepetida(letra: String, letrasUsadas: String): Boolean {
    var i: Int = 0
    while (i < letrasUsadas.length) { // Recorremos la lista de letras usadas
        if (letra[0] == letrasUsadas[i]) { // Comprobamos si la letra actual está en esa lista
            println("Ya has probado esa letra.")
            return true // Devolvemos TRUE a estaRepetida
        }
        i++
    }
    return false // Devolvemos FALSE a estaRepetida

}