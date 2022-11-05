fun esconderPalabra(palabraSecreta:String): String {
    var pista: String = ""
    var i: Int = 0
    while (i < palabraSecreta.length) { // Creamos un _ por cada letra de la palabra
        pista += "_ " // y añadimos un espacio para poder diferenciarlas
        i++
    }
    return pista
}