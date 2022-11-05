fun generarSolucion(palabraSecreta:String): String {
    var solucion: String = ""
    var i: Int = 0
    while (i < palabraSecreta.length) {
        // Dividimos la palabra secreta entre espacios para poder compararla con la pista
        solucion += palabraSecreta[i]
        solucion += ' '
        i++
    }
    return solucion
}