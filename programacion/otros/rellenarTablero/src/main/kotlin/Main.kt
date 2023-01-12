fun main() { // Ines, Ramón y Elena
    // 0 vacio 1 obstaculo 2 persona

    val LADO = tamanoTablero()
    var tablero = Array(LADO) { IntArray(LADO) }
    var hayZonasAisladas = true
    var obstaculos = 0

    do {
        println("Cuantos obstáculos habrá en el tablero?")
        obstaculos = readln().toInt()

        if ((obstaculos * 1 / 5) > LADO) {
            println("Hay demasiados obstáculos para este tamano de tablero.")
        }
    } while ((obstaculos * 1 / 5) > LADO)


    do {
        generarObstaculos(tablero, obstaculos)
        hayZonasAisladas = comprobarObstaculos(tablero)

    } while (!hayZonasAisladas)

    introducirPersona(tablero)
    imprimirTablero(tablero)

}


