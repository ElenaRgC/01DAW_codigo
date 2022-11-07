fun esconderPalabra(palabraSecreta:String): String {
    var pista: String = ""
    var i: Int = 0
    while (i < palabraSecreta.length) {
        pista += "_"
        i++
    }
    return pista
}