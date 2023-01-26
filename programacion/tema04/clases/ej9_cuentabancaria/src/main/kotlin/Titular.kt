class Titular {
    var nombre = ""
    var apellido1 = ""
    var apellido2 = ""
    var telefono = 0

    constructor() {
        println("Introduce tu nombre:")
        nombre = readln()
        println("Introduce tu primer apellido:")
        apellido1 = readln()
        println("Introduce tu segundo apellido:")
        apellido2 = readln()
        println("")
        telefono = readln().toInt()
    }
}