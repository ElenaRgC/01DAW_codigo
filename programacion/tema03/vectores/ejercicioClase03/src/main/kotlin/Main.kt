fun main() { // Elena Rodríguez Calderón
    /*
    Creo vector [5] int
    Rellenamos (1,2,3,4,5) con un bucle
    Inverso del vector (5, 4, 3, 2, 1)
     */

    var array = arrayOf(1,2,3,4,5)
    var arrayInversa = Array(5) { 0 }

    var i = 0
    var j = array.size-1

    while (i < array.size) {
        arrayInversa[i] = array[j]
        print(arrayInversa[i])
        j--
        i++
    }


    }

