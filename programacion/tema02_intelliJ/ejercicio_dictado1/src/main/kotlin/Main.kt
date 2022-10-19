import kotlin.math.pow
import kotlin.math.truncate

fun main() { // Elena Rodríguez Calderón
    /*
    Programa que pida por teclado un número que esté entre 10.000 y 100.000.
    Si no está entre estos valores, sigue pidiendo el número.
    Cuando se cumpla, devolvemos el número dado la vuelta.
    Ej: 12345 -> 54321
     */

    val numero: Int = pedirTeclado()
    var parcial: Int
    val diez = 10.0
    var i = 4.0

    do {
        parcial = truncate(numero / (diez.pow(i))).toInt()
        i--
        print(parcial)
    } while (i > 1)

}