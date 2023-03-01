import kotlin.random.Random

class Tet {
    private var almacenDrones = arrayListOf<Dron>()
    private val TAMANOALMACEN = 200
    private var ordenesReparacion = arrayListOf<OrdenReparacion>()
    private var ordenesReconocimiento = arrayListOf<OrdenReconocimiento>()

    constructor() {
        rellenarTet()
    }

    private fun rellenarTet() {
        for (i in 1..TAMANOALMACEN) {
            almacenDrones.add(Dron())
        }
    }

    fun recorrerCuadrante(planeta: Planeta) {
        for (cuadrante in planeta.cuadrantes) {
            cuadrante.estropearDrones()
        }
    }

    fun crearOrdenesReconocimiento(tiempo: Int) {
        val NUMORDENES = Random.nextInt(5,11)
        for (i in 1.. NUMORDENES) {
            val ORDEN = OrdenReconocimiento(tiempo)
            ordenesReconocimiento.add(ORDEN)
        }
    }

    fun crearOrdenesReparacion(planeta: Planeta, tiempo: Int) {
        for (cuadrante in planeta.cuadrantes) {
            for (dron in cuadrante.flotaDrones) {
                if (dron.estado == "Inactivo") {
                    val ORDEN = OrdenReparacion(dron, tiempo)
                    ordenesReparacion.add(ORDEN)
                    cuadrante.dronesEstropeados.add(dron)
                }
            }
        }
    }

    fun ejecutarOrdenesReparacion(planeta: Planeta): Int {
        var ordenesCompletadas = 0
        for (orden in ordenesReparacion) {
            for (cuadrante in planeta.cuadrantes) {
                for (dron in cuadrante.dronesEstropeados) {
                    if(orden.numDron == dron.numDron) {
                        dron.reparar(orden)
                        ordenesReparacion.remove(orden)
                        ordenesCompletadas++
                    }
                }
            }
        }
        return ordenesCompletadas
    }

    fun ejecutarOrdenesReconocimiento(): Int {
        var ordenesCompletadas = 0
        for (orden in ordenesReconocimiento) {
            orden.rastrear()
            ordenesReconocimiento.remove(orden)
            ordenesCompletadas++
        }
        return ordenesCompletadas
    }
}