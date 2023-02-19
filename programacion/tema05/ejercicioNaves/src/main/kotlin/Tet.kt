class Tet {
    private var almacenDrones = arrayListOf<Dron>()
    private val TAMANOALMACEN = 200

    constructor() {
        rellenarTet()
    }

    private fun rellenarTet() {
        for (i in 1..TAMANOALMACEN) {
            almacenDrones.add(Dron())
        }
    }

}