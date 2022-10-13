// Determinar si un número leído por teclado es positivo o negativo.
import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    println("Introduce un número.")
    val numero = scanner.nextInt()
    scanner.close()

    if (numero == 0) {
        println("El número es cero.")
    } else {
        if (numero > 0) {
            println("El número es positivo.")
        } else {
            println("El número es negativo")
        }
    }

}