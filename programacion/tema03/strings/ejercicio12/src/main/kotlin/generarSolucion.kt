fun generarSolucion(palabraSecreta:String): String {
    var solucion: String = ""
    var i: Int = 0
    while (i < palabraSecreta.length) {
        solucion += palabraSecreta[i]
        solucion += ' '
        i++
    }
    return solucion
}