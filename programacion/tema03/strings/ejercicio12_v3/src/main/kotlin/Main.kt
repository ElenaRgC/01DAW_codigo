fun main() { // Elena Rodríguez Calderón
    /*
    Realiza el juego del ahorcado. Se debe pedir una palabra a un usuario.
    Posteriormente se borra y se preguntan letras al segundo usuario hasta que este
    decida resolver. Se darán 7 intentos. El ahorcado de toa la vida, vamos.
     */

    val INTENTOS = 7
    var seguirJugando: String = ""
    var palabraSecreta: String = ""
    var esPalabra: Boolean
    do {
        do {
            println("Introduce la palabra secreta.")
            palabraSecreta = readln().trim().lowercase()
            esPalabra = sonLetras(palabraSecreta)
        } while (palabraSecreta == "" || !esPalabra)
        // Se vuelve a pedir una palabra secreta si se introducen caracteres no permitidos o está vacía.

        jugar(palabraSecreta,INTENTOS)

        println("Quiere volver a jugar? (S/N)")
        seguirJugando = readln().trim().lowercase()

    } while (seguirJugando == "s" || seguirJugando == "si" || seguirJugando == "sí")

}