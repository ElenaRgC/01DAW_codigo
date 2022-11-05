fun jugar(palabraSecreta: String, numeroIntentos: Int) {

    var pista = esconderPalabra(palabraSecreta)
    println(pista) // Imprimimos la pista inicial para que el jugador sepa el número de letras
    val solucion = generarSolucion(palabraSecreta)
    // Generamos una respuesta que nos servirá para comprobar si el jugador ha ganado o no

    var letra: String = ""
    var numeroFallos = 0
    var nuevaPista = pista
    // Creamos una nueva variable para controlar los aciertos del jugador
    // la inicializamos a la pista vacía para poder añadir o no letras cada turno.

    do {
        println("Prueba una letra:")
        letra = readln()
        var i = 0

        while (i < palabraSecreta.length) {

            if (letra[0] == palabraSecreta[i]) { // Reemplazamos cada letra acertada.
                // El valor es 2i para contabilizar los espacios.
                nuevaPista = nuevaPista.replaceRange(2*i..2*i, letra)
                // nuevaPista[2*i] = letra[0] Ojalá pudiera hacerse así ㅠㅠ
            } /* else {
                nuevaPista += "_ "
            } */
            i++
        }

        if (pista == nuevaPista) { // Si la pista no ha variado, es que no ha acertado con la letra
            numeroFallos++ // Aumentamos el número de intentos y avisamos al jugador
            println("Esa letra no está en la palabra.")
            println("Te quedan ${numeroIntentos - numeroFallos} intentos.")
        } else { // Si acierta, guardamos la nueva pista y no aumentamos el contador de fallos
            pista = nuevaPista
        }

        dibujarFallos(numeroFallos)
        println(pista)
    } while (numeroFallos < numeroIntentos && pista != solucion)

    if (pista == solucion) {
        println("Enhorabuena, has ganado.")
    } else {
        println("Has agotado tus intentos.")
        println("La palabra secreta era $palabraSecreta.")
    }
}