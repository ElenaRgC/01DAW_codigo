fun main() { // Elena Rodríguez Calderón
    /*
    Realiza el juego del ahorcado. Se debe pedir una palabra a un usuario.
    Posteriormente se borra y se preguntan letras al segundo usuario hasta que este
    decida resolver. Se darán 7 intentos. El ahorcado de toa la vida, vamos.
     */

    val numeroTurnos = 7
    var letrasUsadas: String = ""
    var letra: String = ""


    println("Introduce la palabra secreta.")
    var palabraSecreta: String = readln()

    var pista = esconderPalabra(palabraSecreta)

    println("Prueba una letra:")
    letra = readln()
    var i = 0
    pista = ""
    while (i < palabraSecreta.length) {

        if (letra[0] == palabraSecreta[i]) {
            pista += letra[0]
            pista += ' '
        } else {
            pista += "_ "
        }
        i++
    }

    println(pista)


}

fun esconderPalabra(palabraSecreta:String): String {
    var pista: String = ""
    var i: Int = 0
    while (i < palabraSecreta.length) { // Creamos un _ por cada letra de la palabra
        pista += "_ " // y añadimos un espacio para poder diferenciarlas
        i++
    }
    return pista
}