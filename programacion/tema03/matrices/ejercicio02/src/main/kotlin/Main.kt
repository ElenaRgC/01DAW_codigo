fun main(args: Array<String>) {
    /*
    Escribir un programa que lea una matriz entera de tamaño NxM y un valor entero,
    y encuentre la primera ocurrencia del valor en la matriz.
     */

    println("Cuantas filas va a tener tu matriz?")
    val FILAS = readln().toInt()

    println("Cuantas columnas va a tener tu matriz?")
    val COLUMNAS = readln().toInt()

    var matriz = Array(FILAS) { IntArray(COLUMNAS) { 0 } }

    println("Que número entero quieres buscar?")
    val NUMERO = readln().toInt()

    rellenarMatriz(matriz)
    mostrarMatriz(matriz)

}