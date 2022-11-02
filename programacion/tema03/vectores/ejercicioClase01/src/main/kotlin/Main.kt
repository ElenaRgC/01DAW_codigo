fun main() { // Elena Rodríguez Calderón
    /*
    Crear un Array(50) de 0 a 100.
    Rellenamos el array de números aleatorios.
    Recorrer el array e imprimir.
    Función: mayor número del array e imprimirlos.
    Función: menor número del array e imprimirlos.
    Función: buscar los números pares e imprimirlos.
     */

    val arrayNumeros = Array(50) { 0 }

    var i = 0
    while (i < arrayNumeros.size) {
        arrayNumeros[i] = (0..100).random()
        i++
    }

    var j = 0
    println("Los numeros en la array son:")
    do {
        println(arrayNumeros[j])
        j++
    } while (j < arrayNumeros.size)

    mayorNumero(arrayNumeros)
    menorNumero(arrayNumeros)
    numerosPares(arrayNumeros)
}

fun mayorNumero(arrayNumeros: Array<Int>) {
    var mayor = 0
    var i = 0
    while (i < arrayNumeros.size) {
        if (arrayNumeros[i] > mayor) {
            mayor = arrayNumeros[i]
        }
        i++
    }
    println("El mayor numero es: $mayor")
}

fun menorNumero(arrayNumeros: Array<Int>) {
    var menor = 100
    var i = 0
    while (i < arrayNumeros.size) {
        if (arrayNumeros[i] < menor) {
            menor = arrayNumeros[i]
        }
        i++
    }
    println("El menor numero es: $menor")
}

fun numerosPares(arrayNumeros:Array<Int>) {
    var i = 0
    println("Los numeros pares son:")
    while (i < arrayNumeros.size) {
        if (arrayNumeros[i] % 2 == 0) {
            println("En la posicion $i hay un ${arrayNumeros[i]}.")
        }
        i++
    }
}