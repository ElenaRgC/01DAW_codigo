fun dibujarFallos(numeroFallos: Int) {
    when (numeroFallos) {
        0 -> println("  _")
        1 -> println(" | ")
        2 -> println(" O ")
        3 -> print("/")
        4 -> print("|")
        5 -> {print("\\")
            println("")}
        6 -> print("/ ")
        7 -> print("\\")
    }
}