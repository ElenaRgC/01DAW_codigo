import kotlin.random.Random

fun generarObstaculos(lado: Int, tablero: Array<IntArray>) {

    var obstaculos = lado

    do {
        println("Cuantos obstáculos habrá en el tablero?")
        obstaculos = readln().toInt()

        if ((obstaculos * 1 / 3) > lado) {
            println("Hay demasiados obstáculos para este tamano de tablero.")
        }
    } while ((obstaculos * 1 / 3) > lado)

    var fila = 0
    var col = 0

    while (obstaculos > 0) {

        fila = Random.nextInt(0, lado - 1)
        col = Random.nextInt(0, lado - 1)

        if (tablero[fila][col] == 0) {
            tablero[fila][col] = 1
            obstaculos--
        }

    }
}