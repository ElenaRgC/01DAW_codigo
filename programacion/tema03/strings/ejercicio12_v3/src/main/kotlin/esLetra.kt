fun esLetra(letra: String): Boolean {
    // Definimos la constante de caracteres válidos.
    val LETRAS: String = ("abcdefghifjlmnñopqrstuvwxyz")
    var i = 0
    while (i < LETRAS.length) { // Recorremos el string de caracteres válidos
        if (letra[0] == LETRAS[i]) {
            return true // La letra está en nuestra lista.
        }
        i++
    }
    println("Utiliza una letra. Números y símbolos especiales no están permitidos.")

    return false // El return false se hace fuera del while o solo se daría una vuelta al bucle
}