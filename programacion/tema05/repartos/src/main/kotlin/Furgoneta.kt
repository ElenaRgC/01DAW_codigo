class Furgoneta {

    var capacidad = 4
    var maletero = ArrayList<Paquete>()

    constructor()

    constructor(capacidad: Int) {
        this.capacidad = capacidad
    }

    fun introducirPaquete(paquete: Paquete) {
        if (maletero.size < capacidad) {
            maletero.add(paquete)
        }
    }

    fun estaLlena(): Boolean {
        return maletero.size == capacidad
    }

}