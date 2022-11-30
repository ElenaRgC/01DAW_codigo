fun main() { // Elena Rodríguez Calderón
    println("Cuantas filas va a tener tu matriz?")
    val FILAS = readln().toInt()

    println("Cuantas columnas va a tener tu matriz?")
    val COLUMNAS = readln().toInt()

    var matriz = Array(FILAS) { IntArray(COLUMNAS) { 0 } }

    generarMatriz(matriz, FILAS, COLUMNAS)

    println("Esta es la matriz de $FILAS x $COLUMNAS generada:")
    for (fila in matriz) {
        println(fila.contentToString())
    }

    println("Vamos a buscar los adyacentes de un elemento de la matriz.")
    println("Introduzca la fila del elemento.")
    val FILAELEMENTO: Int = readln().toInt() - 1
    println("Introduzca la columna del elemento.")
    val COLELEMENTO: Int = readln().toInt() - 1

    println("Buscamos los adyacentes de [${matriz[FILAELEMENTO][COLELEMENTO]}] que esta en la posicion (${FILAELEMENTO + 1}, ${COLELEMENTO + 1}).")
    println("Estos son los adyacentes del elemento (*):")

    imprimirAdyacentes(matriz, FILAS, COLUMNAS, FILAELEMENTO, COLELEMENTO)

}