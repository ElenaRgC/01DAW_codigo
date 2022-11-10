fun jugar(palabraSecreta: String, numeroIntentos: Int) {

    var pista = esconderPalabra(palabraSecreta)
    mostrarPista(pista) // Imprimimos la pista inicial para que el jugador sepa el número de letras

    var letra: String = ""
    var letrasUsadas: String = ""
    var estaRepetida: Boolean
    var esLetra: Boolean
    var numeroFallos = 0
    var nuevaPista = ""
    // Creamos una nueva variable para controlar los aciertos del jugador
    // la inicializamos a la pista vacía para poder añadir o no letras cada turno.

    do {
        do {
            println("Prueba una letra:")
            letra = readln().trim().lowercase()
            estaRepetida = letraRepetida(letra, letrasUsadas)
            esLetra = esLetra(letra)

        } while (estaRepetida || !esLetra)
        // Volvemos a pedir una letra si ya la ha usado antes o NO ha introducido un carácter válido.

        letrasUsadas += letra // Añadimos la letra actual a la lista de letras usadas.

        var i = 0

        while (i < palabraSecreta.length) { // Recorremos la palabra secreta

            if (letra[0] == palabraSecreta[i]) { // Reemplazamos cada nueva letra acertada.
                nuevaPista += palabraSecreta[i]
            } else { // En caso contrario, añadimos el contenido original de la pista.
                nuevaPista += pista[i]
            }
            i++
        }

        if (pista == nuevaPista) { // Si la pista no ha variado, es que no ha acertado con la letra
            numeroFallos++ // Aumentamos el número de intentos y avisamos al jugador
            println("${letra.uppercase()} no esta en la palabra.")
            println("Te quedan ${numeroIntentos - numeroFallos} intentos.")
        } else { // Si acierta, guardamos la nueva pista y no aumentamos el contador de fallos
            pista = nuevaPista
        }

        nuevaPista = ""
        dibujarFallos(numeroFallos)
        mostrarPista(pista)

        // Seguimos jugando mientras no lleguemos al número máximo de fallos o acertemos todas las letras
    } while (numeroFallos < numeroIntentos && pista != palabraSecreta)

    if (pista == palabraSecreta) {
        println("Enhorabuena, has ganado.")
    } else {
        println("Has agotado tus intentos.")
        println("La palabra secreta era $palabraSecreta.")
    }
}