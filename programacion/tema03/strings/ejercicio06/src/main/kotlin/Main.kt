fun main() { // Elena Rodríguez Calderón
    /*
    Diseña un programa en Java que solicite al usuario una cadena en la que buscará y
    otra que será la cadena buscada. El programa indicará cuantas veces aparece la
    segunda cadena en la primera.
     */

    println("Introduce una oracion:")
    val cadenaParaBuscar: String = readln()

    println("Introduce la palabra que quieres buscar en la oración:")
    val cadenaBuscada: String = readln()

    buscarCadena(cadenaParaBuscar, cadenaBuscada)

}

fun buscarCadena(texto: String, busqueda: String) {
    var texto: String = texto.lowercase() + ' '
    var busqueda: String = busqueda
    var palabra: String = ""
    var numeroEncuentros: Int = 0
    var i: Int = 0 // Recorre el texto.


    while (i < texto.length) {
        if (texto[i] != ' ') { // Si no encontramos un espacio, guardamos caracteres en la variable palabra.
            palabra = palabra + texto[i]
        } else { // En el caso de que encontremos un espacio, acaba la palabra.
            if (palabra == busqueda) { // Si la palabra es la buscada,
                numeroEncuentros++ // sumamos un encuentro.
            }
            palabra = "" // Vaciamos la variable palabra.
        }
        i++
    }

    println("La palabra $busqueda aparece $numeroEncuentros veces en el texto.")
}