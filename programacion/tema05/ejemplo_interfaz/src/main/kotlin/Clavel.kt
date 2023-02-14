class Clavel: Vegetal(), SerVivo {
    override var vivo: Boolean
        get() = true
        set(value) {}

    override fun estaVivo(valor: Int, tipo: String) {
        TODO("Not yet implemented")
    }

    override fun nacer() {
        TODO("Not yet implemented")
    }

    override fun crecer() {
        TODO("Not yet implemented")
    }

    override fun morir() {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return ("Tengo un tamaño de $tamano cm.")
    }
}