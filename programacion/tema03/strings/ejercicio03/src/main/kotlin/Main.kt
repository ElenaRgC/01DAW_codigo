fun main() { // Elena Rodríguez Calderón
    // Dada una cadena mostrar por pantalla la cantidad de vocales que tiene.

    print("Introduce una cadena: ")
    val cadena = readln()
    var i = 0
    var numeroVocales= 0

    while (i < cadena.length) {
        if (cadena[i] == 'a' || cadena[i] == 'e' || cadena[i] == 'i' || cadena[i] == 'o' || cadena[i] == 'u') {
            numeroVocales++
        }
        i++
    }

    println("La cadena tiene $numeroVocales vocales.")

}
