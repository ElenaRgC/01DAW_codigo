fun mostrarPista(pista:String) {
    var i: Int = 0
    while(i < pista.length) {
        print("${pista[i]} ") // Añadimos un espacio para facilitar la lectura de la pista.
        i++
    }
    println("") // Añadimos un salto de línea.
}