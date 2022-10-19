fun pedirTeclado(): Int {
    var numero: Int
    do {
        println("Introduce un número entre 10.000 y 100.000.")
        numero = readln().toInt()
    } while (numero < 10000 || numero >= 100000)

    return numero

}