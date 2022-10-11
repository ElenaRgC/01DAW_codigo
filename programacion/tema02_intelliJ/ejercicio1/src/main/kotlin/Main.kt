import java.util.Scanner

fun main() {
 // Calcula la superficie y el perímetro de un cuadrado cuyo lado pediremos por teclado.

    println("Introduce el lado del cuadrado.")
    var scanner = Scanner(System.`in`)
    var lado = scanner.nextInt()
    var area = lado * lado
    println("El área es $area.")
    
}