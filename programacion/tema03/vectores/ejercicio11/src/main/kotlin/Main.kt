import kotlin.random.Random

fun main() { // Elena Rodríguez Calderón
    /*
    Diseña un programa modular que inicie un vector de 20 posiciones con números
    al azar del 1 al 10. Después pide otro vector de tres posiciones por teclado. Crea un
    módulo al que le pasemos ambos vectores y nos calcule la posición en la que existe
    alguna repetición del vector más pequeño en el primero.
     */
    val LONGITUDVECTOR1 = 20
    val LONGITUDVECTOR2 = 3

    var vectorLargo = IntArray(LONGITUDVECTOR1)
    var vectorCorto = IntArray(LONGITUDVECTOR2)

    vectorLargo = generarVector(vectorLargo)
    vectorCorto = pedirVector(vectorCorto)

}

fun generarVector(vector: IntArray): IntArray {
    for (i in vector.indices) {
        vector[i] = Random.nextInt(0, 10)
        print("${vector[i]} ")
    }
    println()
    return vector
}

fun pedirVector(vector: IntArray): IntArray {
    for (i in vector.indices) {
        println("Introduce un numero.")
        vector[i] = readln().toInt()
    }
    println()
    return vector
}

fun buscarVector(vectorBusqueda: IntArray, vectorBuscado: IntArray): Int {
    var posicion = 0

    return posicion
}