fun main() { // Elena Rodríguez Calderón
    /*
    Crea un programa en Java que solicite al usuario la introducción de una cadena de
    caracteres y devuelva esta cadena invertida. Convierte la cadena resultante en
    mayúsculas.
     */

    println("Introduce una cadena: ")
    val cadena: String = readln()
    var cadenaInvertida = ""
    var i: Int = cadena.length - 1

    do {
        cadenaInvertida = cadenaInvertida + cadena[i]
        i--
    } while (i >= 0)

    println(cadenaInvertida)
    println(cadenaInvertida.uppercase())
}