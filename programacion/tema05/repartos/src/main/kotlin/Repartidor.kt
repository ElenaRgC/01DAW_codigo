class Repartidor {

    companion object {
        var numRepartidores = 0
    }

    var ID = 0
    var nombre = ""
    var fila = 0
    private var amonestaciones = 0
    private var furgo = Furgoneta()

    constructor() {
        this.ID = numRepartidores
        numRepartidores++

        this.nombre = Constantes.nombreAleatorio()
    }

    constructor(nombre: String, fila: Int) {
        this.ID = numRepartidores
        numRepartidores++

        this.nombre = nombre
        this.fila = fila
    }

    fun recibirAmonestacion() {
        amonestaciones++
    }

    fun llenarFurgoneta(sector: Sector) {
        for (paquete in sector.paquetes) {
            while (!furgo.estaLlena()) {
                furgo.maletero.add(paquete)
            }
        }
    }

}

/*
- ID
- Nombre
- Fila asignada
- Contador amonestaciones
- Furgoneta
 */