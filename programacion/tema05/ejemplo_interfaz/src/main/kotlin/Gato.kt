class Gato: SerVivo, Animal {

    var nombre: String = "Sin nombre"
    override var vivo: Boolean = true

    override fun estaVivo(valor: Int): Boolean {
        return vivo
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
        return nombre
    }

}