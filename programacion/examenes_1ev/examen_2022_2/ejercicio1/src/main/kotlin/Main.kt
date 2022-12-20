import kotlin.math.pow
import kotlin.random.Random

fun main(args: Array<String>) { // Elena Rodríguez Calderón

    val PORCENTAJELIMITE = 80
    val LONGITUDMIN = 2
    val LONGITUDMAX = 7

    var longitudMax = seleccionarLongitud(LONGITUDMIN, LONGITUDMAX)
    var informe = arrayOf(0,0) // Sin 8, con 8

    do {

        var numeroAleatorio: Int = generarNumeroAleatorio(LONGITUDMIN, longitudMax)
        var porcentajeOchos: Int = comprobarOchos(numeroAleatorio)

        // println("$numeroAleatorio --> $porcentajeOchos%")

        generarInforme(porcentajeOchos, informe)

    } while (porcentajeOchos < PORCENTAJELIMITE)

    println("Hay ${informe[0]} numeros que no contienen 8.")
    println("Hay ${informe[1]} numeros que contienen un 8.")

}

fun seleccionarLongitud(min: Int, max: Int): Int {
    var longitud: Int = Random.nextInt(min, max)

    return longitud
}

fun generarNumeroAleatorio(min: Int, max: Int): Int {
    var valorMin = min.toDouble().pow(10.0).toInt()
    var valorMax = ((max+1).toDouble().pow(10)).toInt()-1

    var numero = Random.nextInt(valorMin, valorMax)

    return numero
}

fun comprobarOchos(numero: Int): Int {
    var contadorOchos = 0
    var contadorLongitud = 0

    for (cifra in numero.toString()) {
        if (cifra == '8') {
            contadorOchos++
        }
        contadorLongitud++
    }

    var porcentaje = contadorOchos * 100 / contadorLongitud

    return porcentaje
}

fun generarInforme(porcentaje: Int, informe:Array<Int>) {

    if (porcentaje == 0) {
        informe[0]++
    } else {
        informe[1]++
    }

}