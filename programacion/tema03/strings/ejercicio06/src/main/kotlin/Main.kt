fun main() { // Elena Rodríguez Calderón
    /*
    Diseña un programa en Java que solicite al usuario una cadena en la que buscará y
    otra que será la cadena buscada. El programa indicará cuantas veces aparece la
    segunda cadena en la primera.
     */

    println("Introduce un texto:")
    val cadenaParaBuscar: String = readln()

    println("Introduce lo que quieres buscar en el texto:")
    val cadenaBuscada: String = readln()

    buscarCadena(cadenaParaBuscar, cadenaBuscada)

}

fun buscarCadena(texto: String, busqueda: String) {
    var texto: String = texto
    var busqueda: String = busqueda
    var palabra: String = ""
    var numeroEncuentros: Int = 0
    var i: Int = 0 // Recorre el texto.


    while (i < texto.length) {
        if (texto[i] != ' ') {
            palabra = palabra + texto[i]
        } else {
            if (palabra == busqueda) {
                numeroEncuentros++
            }
            palabra = "" // Vaciamos la variable palabra.
        }
        i++
    }

    println("La palabra $busqueda aparece $numeroEncuentros veces en el texto.")
}