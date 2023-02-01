class Naranja {
    var color: String = ""
    var diametro: Int = 0
        /*get() {
            return field*9
        }*/
    var sabor: Boolean = false

    /*fun getDiametro():Int {
        return this.diametro + 2
    }*/

    override fun toString(): String {
        return "Naranja(color='$color', diametro=$diametro, sabor=$sabor)"
        /*return super.toString()*/
    }

    fun pelar(d: Int) {
        if (d > this.diametro) {
            println("Usar el cuchillo.")
        } else {
            println("Usar la mano.")
        }
    }

    fun pelar() {
        if (sabor) {
            println("Me la puedo comer.")
        } else {
            println("Está mala.")
        }
    }

}