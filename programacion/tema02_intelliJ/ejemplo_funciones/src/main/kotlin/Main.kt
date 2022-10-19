fun main() { // Elena Rodríguez Calderón
    println("Soy el programa principal.")

    var x: Int = 2
    var y: Int = 3

    pantalla()
    suma(x,y)

    x = x + retornaelsiete()

    println("El número es " + retornaelsiete())

    suma3(2,4)

    resta(x,y,2)

    println("La resta es: " + resta2(y,5,x))
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
    var x2: Int = x
    x2++
    x2 *= y
    println(x2)
}