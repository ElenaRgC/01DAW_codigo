fun main() { // Elena Rodríguez Calderón

    print(lmao())

}

fun lmao(): Int {
    var i = 0
    try {
        var i = 0
        var j = 7
        print(j/i)
    } catch (e:ArithmeticException) {
        i = -1
        println("ERROR")
    }
    return i
}