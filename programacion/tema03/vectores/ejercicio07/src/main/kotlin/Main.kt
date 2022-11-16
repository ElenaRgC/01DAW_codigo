import kotlin.random.Random

fun main() { // Elena Rodríguez Calderón
    /*
    Repetir el ejercicio anterior pero ahora, después de rellenar el vector, se le pasará
    un número al módulo y debe devolver la posición de la primera aparición de ese
    número en el vector; devolverá -1 si ese número no está en el vector.
     */

    var vector = IntArray(20)
    vector = generarVector(vector)

    println("Que numero quieres buscar en el vector?")
    val NUMERO = readln().toInt()

    val POSICION = buscarNumero(vector, NUMERO)

    when (POSICION) {
        -1 -> println("El numero $NUMERO no aparece en el vector.")
        else -> println("El numero $NUMERO aparece por primera vez en la posicion ${POSICION + 1}.")
    }

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
    var posicion = -1

    for (i in vector.indices) {
        if (vector[i] == numero) {
            posicion = i
            return posicion
        }
    }
    return posicion
}