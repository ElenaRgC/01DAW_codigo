fun main() { // Elena Rodríguez Calderón

    val TET = Tet()
    val TIERRA = Planeta(3)
    TIERRA.generarCuadrantes()
    TET.repartirDrones(TIERRA)

    val TIEMPOMAX = 2 // minutos
    var tiempoTranscurrido = 0 // segundos, se considerará como la fecha de las órdenes



    do {
        tiempoTranscurrido++

        var ordenesRep = 0
        var ordenesRec = 0
        var ordenesTotales = 0

        if (tiempoTranscurrido % 4 == 0) {
            TET.recorrerCuadrante(TIERRA)
            TET.reemplazarDrones(TIERRA)
        }

        if (tiempoTranscurrido % 10 == 0) {
            TET.crearOrdenesReparacion(TIERRA, tiempoTranscurrido)
            TET.crearOrdenesReconocimiento(tiempoTranscurrido)
        }

        if (tiempoTranscurrido % 20 == 0) {
            ordenesRep = TET.ejecutarOrdenesReparacion(TIERRA)
            ordenesRec = TET.ejecutarOrdenesReconocimiento()
            ordenesTotales = ordenesRec + ordenesRep
            println("\nSe han completado $ordenesTotales ordenes, $ordenesRep de reparación y $ordenesRec de reconocimiento.")
        }

        imprimirTiempo(tiempoTranscurrido)

    } while (tiempoTranscurrido < TIEMPOMAX * 60)

}

fun imprimirTiempo(tiempo: Int) {
    if (tiempo != 1) {
        println("\n__________Han pasado $tiempo segundos.__________\n")
    } else {
        println("\n__________Ha pasado $tiempo segundo.__________\n")
    }
}