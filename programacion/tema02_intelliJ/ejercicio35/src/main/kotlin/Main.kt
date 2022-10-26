fun main() { // Elena Rodríguez Calderón

    /* Genera una combinación al azar para la lotería primitiva.
    Los números de la lotería son 6, comprendidos del 1 al 49.
    En esta versión no importa si se repite algún número.  */

    val cantidadNumeros: Int = 6 // Cantidad de números pedidos y generados. En la primitiva son 6.
    val valorMaximo: Int = 49 // Número más alto que se puede seleccionar. En la primitiva es hasta el 49.
    var numerosJugador = IntArray(cantidadNumeros)
    var numerosPremiados = IntArray(cantidadNumeros)

    numerosJugador = introducirNumeros(cantidadNumeros, valorMaximo)
    numerosPremiados = generarNumeros(cantidadNumeros, valorMaximo)

    comprobarAciertos(cantidadNumeros, numerosJugador, numerosPremiados)


}