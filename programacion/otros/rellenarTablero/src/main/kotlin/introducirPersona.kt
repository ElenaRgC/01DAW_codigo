fun introducirPersona(lado: Int, tablero: Array<IntArray>) {
    var fila = 0
    var col = 0
    var entraPersona = false

    while (entraPersona == false) {

        fila = Random.nextInt(0, lado - 1)
        col = Random.nextInt(0, lado - 1)

        if (tablero[fila][col] == 0) {
            tablero[fila][col] = 2
            entraPersona = true
        }
    }

}