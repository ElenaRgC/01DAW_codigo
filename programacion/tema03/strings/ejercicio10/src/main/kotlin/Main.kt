fun main(args: Array<String>) { // Elena Rodríguez Calderón
    /*
    Un grupo de inteligencia militar desea codificar los mensajes secretos de tal forma que
    no puedan ser interpretados con una lectura directa, para lo cual han establecido las
    siguientes reglas (ya inventadas por Julio César):
    a) Todo mensaje debe tener sus letras en mayúsculas.
    b) Remplazar cada letra por la que sigue según abecedario, excepto Z que se
    deberá reemplazar con la letra A.
    c) Remplazar cada dígito encontrado por el siguiente número excepto el 9 que
    deberá ser remplazado por el 0.
     */

    println("Introduce el texto a codificar.")
    var texto: String = readln().uppercase()

    println("Introduce el número de desplazamientos para codificar.")
    var numero: Int = readln().toInt()

    var caracterASCII: Int = 0
    var caracterCodificado: Char
    var textoCodificado: String = ""

    var i = 0

    while (i < texto.length) {
        if (texto[i] != ' ') { // No contamos los espacios.

            caracterASCII = texto[i].code

            if (texto[i] == 'Z') {
                caracterASCII = 64 // Situamos el valor ASCII en el anterior a la A
            }

            if (texto[i] == '9') {
                caracterASCII = 47 // Situamos el valor ASCII en el anterior al 0
            }

            caracterCodificado = (caracterASCII + numero).toChar() // Incluimos el numero de desplazamientos

            textoCodificado += caracterCodificado

        } else {
            textoCodificado += ' '
        }
        i++
    }

    println("El texto original era: ")
    println(texto)
    println("El texto codificado con $numero pasos es: ")
    println(textoCodificado)


}