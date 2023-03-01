import kotlin.random.Random

class Tet {
    var almacenDrones = arrayListOf<Dron>()
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

    fun repartirDrones(planeta: Planeta) {
        for (cuadrante in planeta.cuadrantes) {
            for (i in 0..Random.nextInt(0, 3)) {
                cuadrante.flotaDrones.add(almacenDrones.last())
                almacenDrones.remove(almacenDrones.last())
            }
        }
    }

    fun recorrerCuadrante(planeta: Planeta) {
        for (cuadrante in planeta.cuadrantes) {
            cuadrante.estropearDrones()
        }
        println("")
    }

    fun reemplazarDrones(planeta: Planeta) {
        for (cuadrante in planeta.cuadrantes) {
            var i = 0
            while (i < cuadrante.numeroDrones()) {
                println(cuadrante.flotaDrones[i].estado)
                if (cuadrante.flotaDrones[i].estado == "Fallido" && almacenDrones.isNotEmpty()) {
                    "Se va a reemplazar el dron ${cuadrante.flotaDrones[i].numDron} por el dron ${almacenDrones.last().numDron}."
                    cuadrante.flotaDrones.removeAt(i)
                    cuadrante.flotaDrones.add(almacenDrones.last())
                    almacenDrones.remove(almacenDrones.last())
                    i--
                }
                i++
            }
        }
    }

    fun crearOrdenesReconocimiento(tiempo: Int) {
        val NUMORDENES = Random.nextInt(5, 11)
        for (i in 1..NUMORDENES) {
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
                }
            }
        }
    }

    fun ejecutarOrdenesReparacion(planeta: Planeta): Int {
        var ordenesCompletadas = 0
        for (cuadrante in planeta.cuadrantes) {
            for (dron in cuadrante.flotaDrones) {
                for (orden in ordenesReparacion) {
                    if (orden.ejecutarOrden(dron)) {
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
            if (orden.pendiente) {
                orden.rastrear()
                ordenesCompletadas++
            }
        }
        return ordenesCompletadas
    }
}