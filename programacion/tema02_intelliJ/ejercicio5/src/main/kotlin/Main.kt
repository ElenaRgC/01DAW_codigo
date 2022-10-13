// Determinar si un número leído por teclado es positivo o negativo.
import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    println("Introduce un número.")
    val numero = scanner.nextInt()
    scanner.close()

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