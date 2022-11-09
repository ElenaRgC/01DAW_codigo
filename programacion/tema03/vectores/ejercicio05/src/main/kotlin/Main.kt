import kotlin.random.Random

fun main(args: Array<String>) { // Elena Rodríguez Calderón
    /* Diseña un programa que genere un vector con números al azar que oscilan entre
    [-100 y 100]. Después realiza un módulo que indique cuantos números positivos y
    cuantos negativos hay. */

    val cantidadNumeros = 5

    var vector = Array(cantidadNumeros){0}

    rellenarVector(vector)
    positivoNegativo(vector)
}

fun rellenarVector(vector: Array<Int>) {
    for (i in vector.indices) {
        vector[i] = Random.nextInt(-100,100)
        print("${vector[i]} ")
    }
}

fun positivoNegativo(vector: Array<Int>) {
    var cantidadPositivos = 0
    var cantidadNegativos = 0
    for (i in vector.indices) {
        if (vector[i] >= 0) { // Considero el 0 como positivo
            cantidadPositivos++
        } else {
            cantidadNegativos++
        }
    }
    println("\nHay $cantidadPositivos numeros positivos y $cantidadNegativos numeros negativos.")
}
