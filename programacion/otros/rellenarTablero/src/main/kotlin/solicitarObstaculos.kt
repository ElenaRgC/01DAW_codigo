fun solicitarObstaculos(lado: Int): Int {
    var obstaculos = 0
    var entrada = ""

    do {
        do {
            println("Cuantos obstáculos habrá en el tablero?")
            entrada = readln()

            if (!esNumero(entrada)) {
                println("Introduce un número entero.")
            }

        } while (!esNumero(entrada))

        obstaculos = entrada.toInt()

        if ((obstaculos * 1 / 3).toInt() > lado) {
            println("Hay demasiados obstáculos para este tamano de tablero.")
        }
    } while ((obstaculos * 1 / 3) > lado)

    return obstaculos
}