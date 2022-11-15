import kotlin.random.Random

fun main() { // Elena Rodríguez Calderón
    /*
    Leer dos matrices de dimensión NxM de enteros y obtener una tercera matriz
    correspondiente a la suma de las dos.
     */

    println("Cuantas filas van a tener tus matrices?")
    val FILAS = readln().toInt()

    println("Cuantas columnas van a tener tus matriz?")
    val COLUMNAS = readln().toInt()

    var matrizA = Array(FILAS) { IntArray(COLUMNAS) { 0 } }
    var matrizB = Array(FILAS) { IntArray(COLUMNAS) { 0 } }
    var matrizC = Array(FILAS) { IntArray(COLUMNAS) { 0 } }

    println("Esta es la primera matriz:")
    rellenarMatriz(matrizA,FILAS, COLUMNAS)
    mostrarMatriz(matrizA)

    println("Esta es la segunda matriz:")
    rellenarMatriz(matrizB,FILAS, COLUMNAS)
    mostrarMatriz(matrizB)

    println("Esta es la matriz suma:")
    sumarMatrices(matrizA, matrizB, matrizC, FILAS, COLUMNAS)
    mostrarMatriz(matrizC)

}