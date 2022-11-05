fun main() { // Elena Rodríguez Calderón
    /*
    Escriba un programa que calcule la frecuencia de aparición de las vocales de un
    texto proporcionado por el usuario. Esta solución se debe presentar en forma de
    histograma, por ejemplo:
    a 15 ***************
    e 8 ********
    etc…
     */

    println("Introduce un texto:")
    var texto: String = readln().lowercase() // Convertimos a minúsculas para poder contar más fácilmente.
    var i: Int = 0

    var cantidadA: Int = 0
    var cantidadE: Int = 0
    var cantidadI: Int = 0
    var cantidadO: Int = 0
    var cantidadU: Int = 0

    while (i < texto.length) { // Aumentamos en uno la cantidad de la vocal cada vez que nos la encontramos.
        when (texto[i]) {
            'a' -> cantidadA += 1
            'e' -> cantidadE += 1
            'i' -> cantidadI += 1
            'o' -> cantidadO += 1
            'u' -> cantidadU += 1
        }
        i++
    }
    // Como repetiríamos muchas veces el mismo proceso, es más cómodo definir una función
    imprimirCantidadVocales('a', cantidadA)
    imprimirCantidadVocales('e', cantidadE)
    imprimirCantidadVocales('i', cantidadI)
    imprimirCantidadVocales('o', cantidadO)
    imprimirCantidadVocales('u', cantidadU)

}

fun imprimirCantidadVocales(vocal: Char, cantidad: Int) {
    var i: Int = 0
    print("$vocal ") // Usamos el comando print() en vez de println() para escribir en la misma línea,
    print("$cantidad ") // también añadimos un espacio entre caracteres.
    while (i < cantidad) { // Imprimimos * tantas veces como aparece la vocal.
        if ((i % 5) == 0) { // Añadimos un espacio cada 5 * para facilitar el conteo.
            print(' ')
        }
        print("*")
        i++
    }
    println("") // Creamos un salto de línea para no juntarnos con la siguiente vocal
}