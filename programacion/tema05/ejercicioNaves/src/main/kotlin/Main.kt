fun main() { // Elena Rodríguez Calderón

    val TET = Tet()
    val TIERRA = Planeta(3)

    val TIEMPOMAX = 2 // minutos
    var tiempoTranscurrido = 0 // segundos, se considerará como la fecha de las órdenes
    var cantidadOrdenes = 0

    do {
        if (tiempoTranscurrido % 4 == 0) {
            TET.recorrerCuadrante(TIERRA)
        }

        if (tiempoTranscurrido % 10 == 0) {
            TET.crearOrdenesReparacion(TIERRA, tiempoTranscurrido)
            TET.crearOrdenesReconocimiento(tiempoTranscurrido)
        }

        if (tiempoTranscurrido % 20 == 0) {
            cantidadOrdenes = TET.ejecutarOrdenesReconocimiento() + TET.ejecutarOrdenesReparacion(TIERRA)
            println("Se han completado $cantidadOrdenes ordenes.")
        }

        tiempoTranscurrido++
        imprimirTiempo(tiempoTranscurrido)
    } while (tiempoTranscurrido < TIEMPOMAX * 60)

}

fun imprimirTiempo(tiempo: Int) {
    if (tiempo != 1) {
        println("Han pasado $tiempo segundos.")
    } else {
        println("Ha pasado $tiempo segundo.")
    }
}

/*
 * Tet:
 *  - Tiene un almacén de drones, inicialmente 200.
 *  - Manda drones a la Tierra.
 *  - Genera órdenes a los cuadrantes
 *
 * Tierra:
 *  - Tiene una parrilla de 9x9 cuadrantes.
 *
 * Cuadrante:
 *  - Posiciones X e Y
 *  - Tiene entre 1-3 drones.
 *  - Tiene un mecánico (Jack)
 *  - Tiene una supervisora (Vika)
 *
 * Drones
 *  - Estado: operativo, inactivo, fallido
 *  - Nº dron único
 *
 * Órdenes:
 *  - Completado booleano (no se repite dos veces una orden)
 *  - Fecha
 *  - Cuadrante destino
 *  - Pendiente booleano
 *  - Método mostrarInfo
 *  - Contabilizar órdenes
 *
 * Orden reparación:
 *  - Nº dron a reparar
 *  - Estado antes y después de reparar
 *
 * Orden reconocimiento:
 *  - Área a recorrer (num 1-20)
 *  - Qué se ha encontrado: animales, vegetales, radiación al azar
 *
 */