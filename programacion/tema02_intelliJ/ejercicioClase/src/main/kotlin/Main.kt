fun main() { // Elena Rodríguez Calderón

    // Declaración de variables marciano y contador
    var marciano: String = "prueba para saber lo que sé"
    var contador: Int = 0

    // Contador del 0 al 100
    while (contador <= 100) {
        println("Soy el $contador.")
        contador++
    }

    // Contador del 100 al 0
    do {
        println("Soy el $contador.")
        contador--
    } while (contador >= 0)

    // Pedir número por teclado y guardarlo en la variable número
    println("Introduce un número: ")
    var numero: Int = readln().toInt()

    // Evaluar si el número es par o impar
    if (numero % 2 == 0) {
        println("El número $numero es par.")
    } else {
        println("El número $numero es impar.")
    }

    // Dividir numero por 3 y si su resto es 0, que me diga "soy un número feliz"
    if (numero % 3 == 0) {
        println("Soy un número feliz porque soy múltiplo de tres.")
    }

    saludar()

    println("La suma es ${sumar(7,3)}")

}

// Función saludar que diga "Hola"
fun saludar() {
    println("Hola, soy Elena.")
}

// Función sumar que reciba dos argumentos y devuelva la suma
fun sumar(a: Int, b: Int): Int {
    return a + b
}