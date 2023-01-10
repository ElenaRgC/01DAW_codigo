
fun main() { // Ines, Ramón y Elena
    // 0 vacio 1 obstaculo 2 persona

    val lado = tamanoTablero()
    var tablero = Array(lado) { IntArray(lado) }

    generarObstaculos(lado, tablero)
    introducirPersona(lado, tablero)
    imprimirTablero(tablero)

}



