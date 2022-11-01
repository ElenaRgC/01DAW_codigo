fun main() { // Elena Rodríguez Calderón

    /*
    Pedir un número telefónico en formato de cadena y luego lo convierta de la
    siguiente manera:
    Número Telefónico: 34555332211
    Nueva Cadena: (+34)-555-332211
     */
    var telefono: String = ""

    do {
        println("Introduce tu número de teléfono con prefijo.")
        telefono = readln()
    } while (telefono.length != 11)

    var telefonoConFormato: String = "(+"
    var i = 0

    while (i < telefono.length) {
        if (i == 2) {
            telefonoConFormato += ")"
        }
        if (i == 2 || i == 4) {
            telefonoConFormato += "-"
        }

            telefonoConFormato += telefono[i]
        i++
    }

    println(telefonoConFormato)

}