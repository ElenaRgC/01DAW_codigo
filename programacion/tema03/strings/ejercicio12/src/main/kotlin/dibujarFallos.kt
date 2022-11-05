fun dibujarFallos(numeroFallos: Int) {
    val fallo0 = "  _"
    val fallo1 = "$fallo0\n | "
    val fallo2 = "$fallo1\n O "
    val fallo3 = "$fallo2\n/"
    val fallo4 = "$fallo3|"
    val fallo5 = "$fallo4\\"
    val fallo6 = "$fallo5\n/ "
    val fallo7 = "$fallo6\\"

    when (numeroFallos) {
        0 -> println(fallo0)
        1 -> println(fallo1)
        2 -> println(fallo2)
        3 -> println(fallo3)
        4 -> println(fallo4)
        5 -> println(fallo5)
        6 -> println(fallo6)
        7 -> println(fallo7)
    }
    println("")
}