fun jugar(palabraSecreta: String, numeroIntentos: Int) {

    var pista = esconderPalabra(palabraSecreta)
    println(pista) // Imprimimos la pista inicial para que el jugador sepa el número de letras
    val solucion = generarSolucion(palabraSecreta)
    // Generamos una respuesta que nos servirá para comprobar si el jugador ha ganado o no

    var letra: String = ""
    var letrasUsadas: String = ""
    var estaRepetida: Boolean
    var numeroFallos = 0
    var nuevaPista = pista
    // Creamos una nueva variable para controlar los aciertos del jugador
    // la inicializamos a la pista vacía para poder añadir o no letras cada turno.

    do {
        do {
            println("Prueba una letra:")
            letra = readln().lowercase()
            estaRepetida = letraRepetida(letra, letrasUsadas)
        } while (estaRepetida) // Volvemos a pedir una letra si ya la ha usado antes.

        letrasUsadas += letra // Añadimos la letra actual a la lista de letras usadas.

        var i = 0

        while (i < palabraSecreta.length) { // Recorremos la palabra secreta

            if (letra[0] == palabraSecreta[i]) { // Reemplazamos cada letra acertada.
                // El valor es 2i para contabilizar los espacios.
                nuevaPista = nuevaPista.replaceRange(2*i..2*i, letra)
            }
            i++
        }

        if (pista == nuevaPista) { // Si la pista no ha variado, es que no ha acertado con la letra
            numeroFallos++ // Aumentamos el número de intentos y avisamos al jugador
            println("Esa letra no esta en la palabra.")
            println("Te quedan ${numeroIntentos - numeroFallos} intentos.")
        } else { // Si acierta, guardamos la nueva pista y no aumentamos el contador de fallos
            pista = nuevaPista
        }

        println("$pista\n")
        dibujarFallos(numeroFallos)

        // Seguimos jugando mientras no lleguemos al número máximo de fallos o acertemos todas las letras
    } while (numeroFallos < numeroIntentos && pista != solucion)

    if (pista == solucion) {
        println("Enhorabuena, has ganado.")
    } else {
        println("Has agotado tus intentos.")
        println("La palabra secreta era $palabraSecreta.")
    }
}