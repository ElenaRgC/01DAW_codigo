fun main() { // Elena Rodríguez Calderón
    var valenciana = Naranja()
    println(valenciana)

    valenciana.diametro = 7 //setDiametro(7)
    valenciana.color = "rojo" //setColor("rojo")
    println(valenciana)

    var miColor = valenciana.color //getColor()
    println(miColor)

    val NUMNARANJAS: Int = 5000
    var cestaNaranjas = arrayOfNulls<Naranja>(NUMNARANJAS)

    for (naranja in cestaNaranjas.indices) {
        cestaNaranjas[naranja] = Naranja()
    }

    /*var i = 0
    while (i < cestaNaranjas.size) {
        cestaNaranjas[i] = Naranja()
        i++
    }*/
}