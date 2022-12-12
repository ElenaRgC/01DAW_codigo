import kotlin.random.Random

fun main(args: Array<String>) { // Elena Rodríguez Calderón

    var feliz: Int = madrugar()
    feliz = felicidad()

    var dato: Boolean = chequeoFelicidad()

    dato = tenerSueno()

    fiestaTotal()

    contarOvejas()

}

fun fiestaTotal() {
    val NUMSALIDA = 14
    var numero1 = 0
    var numero2 = 0

    do {
        numero1 = Random.nextInt(2,9)
        numero2 = Random.nextInt(1,10)

        if (numero1 + numero2 == NUMSALIDA) {
            println("$numero1 + $numero2 = ${numero1 + numero2}")
        }

    } while ((numero1 + numero2 != NUMSALIDA) && (numero1 != numero2))
}