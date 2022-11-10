fun main() { // Elena Rodríguez Calderón
    /*
    Realiza el juego del ahorcado. Se debe pedir una palabra a un usuario.
    Posteriormente se borra y se preguntan letras al segundo usuario hasta que este
    decida resolver. Se darán 7 intentos. El ahorcado de toa la vida, vamos.
     */

    val numeroIntentos = 7
    var seguirJugando: String = ""
    var palabraSecreta: String = ""

    do {
        do {
            println("Introduce la palabra secreta.")
            palabraSecreta = readln().trim().lowercase()
        } while (palabraSecreta == "") //Evitamos que por error no se introduzca una palabra.

        jugar(palabraSecreta,numeroIntentos)

        println("Quiere volver a jugar? (S/N)")
        seguirJugando = readln().trim().lowercase()

    } while (seguirJugando == "s" || seguirJugando == "si" || seguirJugando == "sí")

}