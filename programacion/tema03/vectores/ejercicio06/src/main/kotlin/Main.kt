import kotlin.random.Random

fun main() {
    /*
    Escribe un programa que inicie un vector con números al azar de 1 a 100. Después
    crearemos un módulo al que le pasemos un número y me devuelva cuantas veces
    aparece ese número en el vector.
     */

    var vector = IntArray(20)
    vector = generarVector(vector)

    println("Que numero quieres buscar en el vector?")
    val NUMERO = readln().toInt()

    val APARICIONES = buscarNumero(vector, NUMERO)

    println("El numero $NUMERO aparece $APARICIONES veces en el vector.")
}

fun generarVector(vector: IntArray): IntArray {
    for (i in vector.indices) {
        vector[i] = Random.nextInt(0, 100)
        print("${vector[i]} ")
    }
    println()
    return vector
}

fun buscarNumero(vector:IntArray, numero: Int): Int {
    var apariciones = 0

    for (i in vector.indices) {
        if (vector[i] == numero) {
            apariciones++
        }
    }

    return apariciones
}

