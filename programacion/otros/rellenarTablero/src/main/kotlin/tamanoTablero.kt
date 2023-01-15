fun tamanoTablero(): Int {
    var entrada = ""
    var lado = 0

    do {
        println("Que tamaño de lado tendra el tablero?")
        entrada = readln()

        if (!esNumero(entrada)) {
            println("Introduce un número entero.")
        } else {
            lado = entrada.toInt()

            if (lado < 2) {
                println("El tamano de los lados del tablero debe dos o más.")
            }
        }

    } while (lado < 2 || !esNumero(entrada))




    return lado
}

