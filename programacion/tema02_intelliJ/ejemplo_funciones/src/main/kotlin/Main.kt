fun main() { // Elena Rodríguez Calderón
    println("Soy el programa principal.")

    var x: Int = 2
    var y: Int = 3

    pantalla()
    suma(x,y)
}

fun pantalla() {
    println("Imprimo por pantalla.")
}

fun suma(x_aux: Int, y_aux: Int) {
    println("La x vale $x_aux")
    println("La y vale $y_aux")
}

fun retornaelsiete():Int {
    return 7
}

fun suma3(x:Int, y: Int) {
    x++
}