fun main() { // Elena Rodríguez Calderón

    val CIUDAD = Ciudad(3)
    val TIEMPOMAX = 2 // minutos
    var tiempoTranscurrido = 0 // segundos = días

    do {
        tiempoTranscurrido++
        println("Empieza el día $tiempoTranscurrido.")

        if (tiempoTranscurrido % 2 == 0) {
            CIUDAD.generarPaquetes()
        }

        if (tiempoTranscurrido % 6 == 0) {

        }

    } while (tiempoTranscurrido < TIEMPOMAX * 60)

}