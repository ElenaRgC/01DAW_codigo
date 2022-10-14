import java.util.Scanner

fun main() { // Elena Rodríguez Calderón
 // Calcula la superficie y el perímetro de un cuadrado cuyo lado pediremos por teclado.

    println("Introduce el lado del cuadrado.")
    val scanner = Scanner(System.`in`)
    val lado = scanner.nextInt()
    val area = lado * lado
    println("El área es $area.")
    
}