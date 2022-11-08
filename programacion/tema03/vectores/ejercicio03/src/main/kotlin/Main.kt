fun main() { // Elena Rodríguez Calderón
    /*
    Escribe un programa modular que pida diez valores reales y los almacene en un
    vector. Recórrelo luego para averiguar la media de dichos números.
     */

    val array = Array(10) { 0f }
    var i: Int = 0
    var suma: Float = 0f

    while (i < array.size) {
        println("Introduzca un número real.")
        array[i] = readln().toFloat()
        suma += array[i]
    }

    var media: Float = suma/array.size
    print(media)

}