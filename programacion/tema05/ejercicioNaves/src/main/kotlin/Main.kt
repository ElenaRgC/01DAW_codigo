fun main() { // Elena Rodríguez Calderón

    val TET = Tet()
    val TIERRA = Tierra()

    val TIEMPOMAX = 2 // minutos
    var tiempoTranscurrido = 0 // segundos

    do {
        if (tiempoTranscurrido % 4 == 0) {
            // se estropean drones con un 20% de posibilidad
        }

        if (tiempoTranscurrido % 10 == 0) {
            // El tet crea órdenes de reparación
            // se crean entre 5 y 10 órdenes de observación
            // se guardan las órdenes cursadas
        }

        if (tiempoTranscurrido % 20 == 0) {
            // cada cuadrante hace sus órdenes sin cursar
            // si es de reparación hay un 50% de posibilidades de que falle y se pide dron nuevo al tet
            // si es de observación se pondrá uno de los tres valores posibles al azar
            // se etiqueta la orden como cumplida
            // se contabilizan las órdenes completadas
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