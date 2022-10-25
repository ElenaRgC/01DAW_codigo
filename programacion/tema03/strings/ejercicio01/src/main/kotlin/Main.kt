fun main() { // Elena Rodríguez Calderón
    // Pedir dos cadenas por teclado y compararlas en: longitud, alfabéticamente y si son iguales.
    println("Introduce una cadena: ")
    val cadena1 = readln()
    println("Introduce otra cadena: ")
    val cadena2 = readln()

    // Comparar longitud
    if (cadena1.length > cadena2.length) {
        println("$cadena1 tiene más caracteres que $cadena2.")
    } else if (cadena1.length < cadena2.length) {
        println("$cadena2 tiene más caracteres que $cadena1.")
    } else {
        println("$cadena1 y $cadena2 tienen la misma longitud.")
    }

    // Comparar alfabéticamente
    if (cadena1.lowercase() > cadena2.lowercase()) {
        println("$cadena1 estaría después en el diccionario que $cadena2.")
    } else if (cadena1.lowercase() < cadena2.lowercase()) {
        println("$cadena1 estaría antes en el diccionario que $cadena2.")
    } else {
        println("Las cadenas son la misma.")
    }

    // Comparar si son iguales
    if (cadena1 == cadena2) {
        println("Las cadenas son iguales.")
    } else {
        println("Las cadenas no son iguales.")
    }
}