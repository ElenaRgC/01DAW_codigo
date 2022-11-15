fun sonLetras(string: String): Boolean {
    // Definimos la constante de caracteres válidos.
    val LETRAS: String = ("abcdefghifjlmnñopqrstuvwxyz")
    var i: Int = 0
    var j: Int = 0
    var k: Int = 0

    while (i < LETRAS.length) { // Recorremos el string de caracteres válidos
        while (j < string.length) { // Recorremos la palabra o letra
        if (string[j] == LETRAS[i]) {
            k++ // Contamos los caracteres válidos
        }
            j++
        }
        i++
    }

    return if (k == string.length) {
        true // Devolvemos TRUE solo si todos los caracteres son letras.
    } else {
        println("Utiliza letras. Numeros y simbolos especiales no estan permitidos.")
        false
    }

}