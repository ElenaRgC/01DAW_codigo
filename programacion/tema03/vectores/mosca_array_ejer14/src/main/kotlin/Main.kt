fun main(args: Array<String>) {

    var tamanio: Int = 0
    var golpe: Int = 0

    println("Cuantas casillas tienen el tablero")
    tamanio = readln().toInt()
    var tablero = Array<Int>(tamanio) { 0 }

    var posicion = (0..(tamanio - 1)).random()
    tablero[posicion] = -1
    var seguir: Boolean = true
    do {
        println("Dime la posición (1- ${tamanio})")
        golpe = (readln().toInt()) - 1

        // if (golpe == posicion){
        if (tablero[golpe] == -1) {
            println("Has Acertado. Mosca muerta")
            seguir = false
        } else {
            println("Has Fallado.")
            if (revolotear(tablero, tamanio - 1, golpe)) {
                println("La mosca revolotea.")
                tablero[posicion] = 0
                posicion = (0..(tamanio - 1)).random()
                tablero[posicion] = -1
            }
        }
    } while (seguir)
}

fun revolotear(tablero: Array<Int>, tamanio: Int, golpe: Int): Boolean {
    var adyacente: Boolean = false
    if (tablero[0] == -1) {
        if (tablero[1] == -1) {
            adyacente = true
        }
    }
    if (tablero[tamanio] == -1) {
        if (tablero[tamanio - 1] == -1) {
            adyacente = true
        }
    }
    if (golpe > 0) {
        if (tablero[golpe + 1] == -1) {
            adyacente = true
        }
    }
    if (golpe < tamanio) {
        if (tablero[golpe - 1] == -1) {
            adyacente = true
        }
    }
    return adyacente
}