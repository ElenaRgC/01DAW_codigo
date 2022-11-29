fun main() { //Elena Rodríguez Calderón

    /* Crear una array de longitud dada, llena de un número dado */

    val LONGITUDARRAY:Int = 5

    val NUMERO: Int = 0

    var array = IntArray(LONGITUDARRAY){NUMERO}

    /* Imprimir una array */

    imprimirArray(array)

    /* Llenar una array con números aleatorios entre MIN y MAX */

    val MIN = 1
    val MAX = 100

    llenarArrayRandom(array, MIN, MAX)

    imprimirArray(array)

    /* Llenar una array con números pedidos al usuario */

    llenarArrayUsuario(array)

    imprimirArray(array)

    /* Crear una matriz a partir de arrays */
    val ARRAY1 = intArrayOf(1,2,3)
    val ARRAY2 = intArrayOf(4,5,6)
    val ARRAY3 = intArrayOf(7,8,9)

    var matriz = arrayOf(ARRAY1, ARRAY2, ARRAY3)


    /* Imprimir una matriz */

    imprimirMatriz(matriz)

    /* Crear una matriz dado su número de filas y columnas */
    val FILAS = 4
    val COLUMNAS = 4

    var matriz2 = crearMatriz(FILAS, COLUMNAS)

    /* Rellenar una matriz con números aleatorios entre MIN y MAX */

    llenarMatrizRandom(matriz, MIN, MAX)

    imprimirMatriz(matriz)

    /* Llenar una matriz con valores pedidos al usuario */

    llenarMatrizUsuario(matriz)

    imprimirMatriz(matriz)

    /* Modificar adyacentes de un elemento */
    // En este ejemplo se le suma 1 al valor de los adyacentes al elemento x, y

    val X = 1
    val Y = 1

    modificarAdyacentes(matriz, X, Y)
    imprimirMatriz(matriz)

    /* Modificar los NO adyacentes de un elemento i,j */
    // En este ejemplo se les cambia el valor a 0 a los valores no adyacentes al elemento x, y
}

/* Funcion para crear una matriz de adyacentes dada una matriz y un elemento de la misma */
fun crearMatrizAdyacentes (matriz: Array<IntArray>, i: Int, j: Int): Array<IntArray> {
    val matrizAdyacentes = Array(3) { IntArray(3) }
    for (x in 0..2) {
        for (y in 0..2) {
            matrizAdyacentes[x][y] = matriz[i-1+x][j-1+y]
        }
    }
    return matrizAdyacentes
}

