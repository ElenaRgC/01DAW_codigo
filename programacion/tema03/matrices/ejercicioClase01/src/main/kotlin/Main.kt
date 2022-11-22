fun main() { // Elena Rodríguez Calderón
    val ARRAY1 = intArrayOf(1,2,3)
    val ARRAY2 = intArrayOf(4,5,6)
    val ARRAY3 = intArrayOf(7,8,9)

    val MATRIZ = arrayOf(ARRAY1, ARRAY2, ARRAY3)

    mostrarMatriz(MATRIZ)
    rellenarMatriz(MATRIZ)
    mostrarMatriz(MATRIZ)
}

fun mostrarMatriz(matriz: Array<IntArray>) {
    var i: Int = 0
    var j: Int = 0

    while (i < matriz.size) {
        j = 0
        while (j < matriz.size) {
            print("[${matriz[i][j]}] ")
            j++
        }
        println("")
        i++
    }
}

fun rellenarMatriz(matriz: Array<IntArray>) {
    var i: Int = 0
    var j: Int = 0

    while (i < matriz.size) {
        j = 0
        while (j < matriz.size) {
            println("Introduce un numero para la posicion (${i+1}, ${j+1})")
            matriz[i][j] = readln().toInt()
            j++
        }
        i++
    }
}