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
    var texto: String = readln()
    var i: Int = 0

    var numeroA: Int = 0
    var numeroE: Int = 0
    var numeroI: Int = 0
    var numeroO: Int = 0
    var numeroU: Int = 0

    var cantidadA: String = ""
    var cantidadE: String = ""
    var cantidadI: String = ""
    var cantidadO: String = ""
    var cantidadU: String = ""

    while (i < texto.length) {
        when (texto[i]) {
            'a' -> cantidadA += 1

        }
    }

}