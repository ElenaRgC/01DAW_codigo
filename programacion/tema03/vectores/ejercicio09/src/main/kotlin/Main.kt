fun main() { // Elena Rodríguez Calderón
    /* Crea una aplicación que pida un numero por teclado y después comprobaremos si
    el numero introducido es capicúa, es decir, que se lee igual sin importar la dirección.
    Por ejemplo, si introducimos 30303 es capicúa, si introducimos 30430 no es capicúa.
    Utiliza vectores para resolver el problema. */

    println("Introduce un número.")
    val NUMERO = readln()
    val VECTOR = Array(NUMERO.length) { 0 }

    var i = 0

    while (i < NUMERO.length) {
        VECTOR[i] = NUMERO[i].code
        i++
    }

    if (esCapicua(VECTOR)) {
        println("El número $NUMERO es capicua.")
    } else {
        println("El número $NUMERO no es capicua.")
    }

}

fun esCapicua (vector:Array): Boolean {
    var i = 0
    var j = vector.size

    while (i < vector.size) {
        if (i == j) {
            return false
        }
        i++
        j--
    }
    return true
}