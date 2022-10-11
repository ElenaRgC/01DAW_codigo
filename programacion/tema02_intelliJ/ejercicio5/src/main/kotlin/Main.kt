// Determinar si un número leído por teclado es positivo o negativo.
import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    val numero = scanner.nextInt()

    if (numero == 0) {
        println("El numero es cero.")
    } else {
        if (numero > 0) {
            println("El numero es positivo.")
        } else {
            println("El numero es negativo")
        }
    }

}