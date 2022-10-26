import kotlin.random.Random

fun generarNumeros(cantidadNumeros: Int, valorMaximo: Int): IntArray {
    var numerosPremiados = IntArray(cantidadNumeros)
    var numeroAleatorio: Int = 0
    var i: Int = 0
    var estaRepetido: Boolean

    while (i < cantidadNumeros) {

        numeroAleatorio = Random.nextInt(1, valorMaximo)
        estaRepetido = estarRepetido(numerosPremiados, numeroAleatorio, i)

        if (!estaRepetido) {
            numerosPremiados[i] = numeroAleatorio
            i++
            println("$numeroAleatorio ha sido premiado.")
        }

    }

    return numerosPremiados

}