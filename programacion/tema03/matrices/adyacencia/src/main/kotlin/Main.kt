import kotlin.random.Random

fun main() { // Elena Rodríguez Calderón
    println("Cuantas filas va a tener tu matriz?")
    val FILAS = readln().toInt()

    println("Cuantas columnas va a tener tu matriz?")
    val COLUMNAS = readln().toInt()

    var matriz = Array(FILAS) { IntArray(COLUMNAS) { 0 } }

    var i = 0
    var j = 0

    while (i < FILAS) {
        j = 0
        while (j < COLUMNAS) {
            matriz[i][j] = Random.nextInt(-10,10)
            j++
        }
        i++
    }

    for (fila in matriz) {
        println(fila?.contentToString())
    }

    println("Vamos a buscar los adyacentes de un elemento.")
    println("Introduzca la fila del elemento.")
    val FILAELEMENTO: Int = readln().toInt() - 1
    println("Introduzca la columna del elemento.")
    val COLELEMENTO: Int = readln().toInt() - 1

    i = 0
    j = 0

    while (i < FILAS) {
        j = 0
        while (j < COLUMNAS) {
            if(FILAELEMENTO == i-1 || FILAELEMENTO == i|| FILAELEMENTO == i+1) {
                if(COLELEMENTO == i-1 || COLELEMENTO == i|| COLELEMENTO == i+1) {
                    print("[${matriz[i][j]}] ")
                }
            }
            j++
        }
        println("")
        i++
    }

}