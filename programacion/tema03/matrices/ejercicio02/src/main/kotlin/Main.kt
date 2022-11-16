fun main(args: Array<String>) {
    /*
    Escribir un programa que lea una matriz entera de tamaño NxM y un valor entero,
    y encuentre la primera ocurrencia del valor en la matriz.
     */

    println("Cuantas filas van a tener tus matrices?")
    val FILAS = readln().toInt()

    println("Cuantas columnas van a tener tus matriz?")
    val COLUMNAS = readln().toInt()

    var matriz = Array(FILAS) { IntArray(COLUMNAS) { 0 } }

    rellenarMatriz(matriz, FILAS, COLUMNAS)
    mostrarMatriz(matriz)


}