fun main() { // Elena Rodríguez Calderón

    /*
    Dados dos números enteros, realizar el algoritmo que calcule el cociente y el resto mediante restas sucesivas.
     */

    println("Introduce el dividendo.")
    val dividendo : Int = readln().toInt()

    println("Introduce el divisor.")
    val divisor: Int = readln().toInt()

    var cociente: Int = 0
    var resto: Int = 0

    var i = 1
    var j = 1

    while (i > 0) { // Cuando i sea menor que cero es que ya me he pasado de restas.
        if (i > 0) {
            i = dividendo - divisor * j
            cociente++
        }

        if (i == 0) { // Si llego justo a cero, significa que no me paso restando y era una división exacta.
            resto = 0
        }

        if (i <0) {
            cociente-- // Hay que restar uno porque ya me he pasado (i < 0)
            resto = dividendo - divisor * (j-1) // Idem ^
        }

        j++
    }

    println("El cociente es $cociente.")
    println("El resto es $resto.")

}