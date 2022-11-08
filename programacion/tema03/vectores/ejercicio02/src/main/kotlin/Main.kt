fun main() { // Elena Rodríguez Calderón
    /*
    Variable -> Contador (1 al 20)
    Evaluamos Contador y según lo que dé lo guardo en el vector pares o en el vector impares
    Solo un bucle while.
     */

    var contador: Int = 1
    val pares = Array(10) { 0 }
    val impares = Array(10) { 0 }
    var i = 0
    var j = 0
    while (contador <= 20) {
        if(contador % 2 == 0) {
            pares[i] = contador
            i++
        } else {
            impares[j] = contador
            j++
        }
        contador++
    }
    i = 0
    j = 0

    println("Los primeros diez numeros pares son:")
    while (i<pares.size) {
        print("${pares[i]} ")
        i++
    }

    println("\n")

    println("Los primeros diez numeros impares son:")
    while (j<impares.size) {
        print("${impares[j]} ")
        j++
    }

}