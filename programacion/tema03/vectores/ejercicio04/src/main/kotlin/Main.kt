import kotlin.random.Random

fun main() { // Elena Rodríguez Calderón
    /*
    Crea un programa modular que inicie un vector con diez números aleatorios.
    Después un módulo me indicará cual es el valor máximo y la posición que ocupa. Caso
    de haber más de un máximo me debe devolver la posición del último.
     */
    var vector = IntArray(10)
    var valorMaximo = 0
    var posicionMaximo = 0

    vector = generarVector(vector)

    for (i in vector.indices) {
        if (vector[i] > valorMaximo) {
            valorMaximo = vector[i]
            posicionMaximo = i
        }
    }
    println()
    println("El valor maximo es $valorMaximo y esta en la posicion $posicionMaximo.")
}

fun generarVector(vector: IntArray): IntArray {
    for (i in vector.indices) {
        vector[i] = Random.nextInt(0, 10)
        print("${vector[i]} ")
    }
    return vector
}