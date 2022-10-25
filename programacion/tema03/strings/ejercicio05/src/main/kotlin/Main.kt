fun main() { // Elena Rodríguez Calderón
    /*
    Leer una frase y encontrar la palabra de mayor longitud. El programa debe
    imprimir tanto la palabra como el número de caracteres de la misma.
     */

    println("Introduce una frase.")
    val frase: String = readln()

    var palabraMasLarga = ""
    var palabra = ""
    var i: Int = 0
    var j: Int = 0

    while (i < frase.length) {
        if (frase[i] != ' ') { // Si no es un espacio, añadimos letra a letra hasta terminar la palabra en el siguiente espacio.
            palabra += frase[i]
            j++
        } else { // Si es un espacio, estamos en una nueva palabra.
            if (j > palabraMasLarga.length) { // Comprobamos si la palabra es más larga que la anterior para almacenarla.
                palabraMasLarga = palabra
            }
            palabra = "" // Vaciamos la variable palabra.
            j = 0 // Reiniciamos el contador de letras.
        }
        i++
    }

    println("La palabra más larga es $palabraMasLarga y tiene $j letras.")

}