import java.util.Scanner

fun main(args: Array<String>) {
    println("Hello World!")

    var saludo ="Hola"
    var n: Int = 0
    // var n: Int
    n = 18; n++ //n = n + 1

    // variables operaciones
    val number1 = 12.5 // constante
    val number2 = 3.5  // constante
    var result: Double // variable

    result = number1 + number2
    println("number1 + number2 = $result")

    result = number1 - number2
    println("number1 - number2 = " + result)

    result = number1 / number2
    println("number1 / number2 = $result")

    result = number1 % number2
    println("number1 / number2 = $result")

    //Leer por teclado
    //modo 1 usando scanner
    val scanner = Scanner(System.`in`) // Poner esto siempre cuando vayamos a leer por teclado

    println(scanner.nextLine()) // Lee la línea completa
    println(scanner.nextInt()) // Espero un entero
    println(scanner.next()) // Espero cualquier cosa
    println(scanner.nextDouble()) // Espero un doble
    println(scanner.nextLong())

    var num1 = scanner.nextInt()

    scanner.close() // Cuando he terminado de leer, tengo que cerrar la clase scanner

    // Escribir un if

    val a = 4
    val b = 5
    val max = a


    // Con un else
    var max1: Int

    if (a > b) {
        max1 = a
    } else {
        max1 = b
    }