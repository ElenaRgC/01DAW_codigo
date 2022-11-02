fun main() { // Elena Rodríguez Calderón
    /*
    Crear un Array(50) de 0 a 100.
    Rellenamos el array de números aleatorios.
    Recorrer el array e imprimir.
    Función: mayor número del array e imprimirlos.
    Función: menor número del array e imprimirlos.
    Función: buscar los números pares e imprimirlos.
    Recorrer el array y sacar la media de los números.
    Buscar el número del array, buscar los dos números más pequeños y ponerlos en la posición 0  y 1.
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
    mediaNumeros(arrayNumeros)
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

fun mediaNumeros(arrayNumeros: Array<Int>) {
    var i = 0
    var suma = 0
    while (i < arrayNumeros.size) {
        suma += arrayNumeros[i]
        i++
    }

    var media = suma / arrayNumeros.size
    println("La media de los numeros es: $media")
}

