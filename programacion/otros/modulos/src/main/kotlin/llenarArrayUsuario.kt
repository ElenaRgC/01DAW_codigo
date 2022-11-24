fun llenarArrayUsuario(array: IntArray) {
    for (i in array.indices) {
        println("Introduce un número.")
        array[i] = readln().toInt()
    }
}