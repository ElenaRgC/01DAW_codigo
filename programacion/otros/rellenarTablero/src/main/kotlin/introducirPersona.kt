import kotlin.random.Random

fun introducirPersona(tablero: Array<IntArray>) {
    val LADO = tablero.size
    var fila = 0
    var col = 0
    var cabePersona = false

    while (cabePersona == false) {

        fila = Random.nextInt(0, LADO)

        if (fila == 0 || fila == LADO - 1) {
            col = Random.nextInt(0, LADO)
        } else {
            col = if (Random.nextBoolean()) 0 else LADO - 1
        }

        if (tablero[fila][col] == 0) {
            tablero[fila][col] = 2
            cabePersona = true
        }
    }

}