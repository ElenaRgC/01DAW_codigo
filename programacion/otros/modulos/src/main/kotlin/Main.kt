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

    /* Crear una matriz con su número de filas y columnas */

    /* Rellenar una matriz con números aleatorios entre MIN y MAX */

    /* Llenar una matriz con valores pedidos al usuario */

    llenarMatrizUsuario(matriz)
    imprimirMatriz(matriz)

    /* Modificar adyacentes de un elemento i,j */

    /* Modificar los NO adyacentes de un elemento i,j */
}