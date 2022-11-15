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
    println("Esta es la matriz de $FILAS x $COLUMNAS generada:")
    for (fila in matriz) {
        println(fila.contentToString())
    }

    println("Vamos a buscar los adyacentes de un elemento de la matriz.")
    println("Introduzca la fila del elemento.")
    val FILAELEMENTO: Int = readln().toInt() - 1
    println("Introduzca la columna del elemento.")
    val COLELEMENTO: Int = readln().toInt() - 1

    println("Buscamos los adyacentes de [${matriz[FILAELEMENTO][COLELEMENTO]}] que esta en la posicion ($FILAELEMENTO, $COLELEMENTO).")
    println("Estos son los adyacentes del elemento (*):")

    i = 0
    while (i < FILAS) {
        j = 0
        while (j < COLUMNAS) {
            if(FILAELEMENTO == i-1 || FILAELEMENTO == i|| FILAELEMENTO == i+1) {
                if(COLELEMENTO == j-1 || COLELEMENTO == j|| COLELEMENTO == j+1) {
                    if (FILAELEMENTO == i && COLELEMENTO == j) {
                        print("(*) ")
                    } else {
                    print("[${matriz[i][j]}] ")
                    }
                }
            }
            j++
        }
        println("")
        i++
    }

}