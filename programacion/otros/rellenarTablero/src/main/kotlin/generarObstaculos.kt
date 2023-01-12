import kotlin.random.Random

fun generarObstaculos(tablero: Array<IntArray>, obstaculos: Int) {
    val LADO = tablero.size
    var cantObstaculos = obstaculos

    var fila = 0
    var col = 0

    while (cantObstaculos > 0) {

        fila = Random.nextInt(0, LADO)
        col = Random.nextInt(0, LADO)

        if (tablero[fila][col] == 0) {
            tablero[fila][col] = 1
            cantObstaculos--
        }

    }
}