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
    var parteInicial: Int
    var parteFinal: Int
    var cifra: Int
    val diez = 10.0 // Para poder usar la función pow e ir incrementando el divisor en múltiplos de 10
    var i = 1.0

    do {
        // Cortamos las cifras finales sucesivamente dividiendo entre 10, 100, 1000...para obtener la parte inicial del número
        parteInicial = truncate(numero / (diez.pow(i))).toInt()
        // Si restamos al número introducido el valor anterior multiplicado por 10, 100, 1000... conseguimos las cifras finales
        parteFinal = (numero - parteInicial * diez.pow(i)).toInt()


        if (i > 1) { // Si a la parte final le quitamos las cifras una a una, conseguimos darle la vuelta al número
            cifra = truncate(parteFinal / (diez.pow(i - 1)) ).toInt()
        } else { // En el primer paso conseguimos la cifra inicial directamente, por lo que podemos imprimirla sin más cálculos
            cifra = parteFinal
        }

        print(cifra) //Imprimimos sin realizar saltos de línea para dar la sensación de que es un único número.

        i++
    } while (i < 6.0) // Como el número está entre 10.000 y 100.000 sabemos que no tendrá más de 5 cifras.

}