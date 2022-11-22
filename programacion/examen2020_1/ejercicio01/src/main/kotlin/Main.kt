import kotlin.math.pow
import kotlin.random.Random

fun main() { // Elena Rodríguez Calderón
    /*
    Vamos a crear un programa que genere números aleatorios hasta n cifras,
    que le parasemos como argumento a la función, una vez generado el número,
    se mirara cuanto de demoniaco tiene, a mayores números de 6 más demoniaco es.
    Al final nos dará en tanto por ciento su grado de demoniaco.
    Deberá estar generando números hasta que encuentre un número demoniaco mayor de 75%,
    cuando pase esto terminará y realizara un informe, de cuantos números son demoniacos
    y cuantos no lo son.
    El máximo del tamaño del número aleatorio podrá ser desde 2 a 7 cifras,
    una vez elegido por el programa ya no se cambia.
     */

    val MINIMOCIFRAS = 2
    val MAXIMOCIFRAS = 7

    val PORCENTAJESALIDA = 75

    // Determinamos el número de cifras máximo de los números generados
    val CIFRAS = Random.nextInt(MINIMOCIFRAS, MAXIMOCIFRAS)

    // Determinamos el mínimo valor de nuestro generador de números aleatorios
    val valorMin = 10.0.pow(MINIMOCIFRAS.toDouble()).toInt()/10

    // Determinamos el máximo valor de nuestro generador de números aleatorios
    var i = 0
    var valorMax = 0

    while (i < CIFRAS) {
       valorMax = (valorMax + 9 * 10.0.pow(i.toDouble())).toInt()
        i++
    }

    var numeroGenerado = 0
    var porcentajeDemon = 0
    var contadorSeis = 0
    var contadorDemon = 0
    var contadorNoDemon = 0
    var informe = ""

    do {
        contadorSeis = 0
        numeroGenerado = Random.nextInt(valorMin,valorMax)

        for (digito in numeroGenerado.toString()) {
            if (digito == '6') {
                contadorSeis++
            }
        }

        porcentajeDemon = contadorSeis * 100 / CIFRAS

        if (porcentajeDemon > 0) {
            contadorDemon++
        } else {
            contadorNoDemon++
        }

        //println("Numero: $numeroGenerado, Porcentaje demoniaco: $porcentajeDemon%")
        // Se descarta imprimir por línea, ya que nos piden un informe,
        // pero es útil para saber si el programa se está ejecuntando.
        informe += "Numero: $numeroGenerado, Porcentaje demoniaco: $porcentajeDemon% \n"

    } while (porcentajeDemon < PORCENTAJESALIDA)
    /* NOTA: para pruebas con números con muchas cifras se recomienda bajar el porcentaje de salida
    porque puede tardar en completarse la ejecución */

    println(informe)
    println("Total de numeros demoniacos: $contadorDemon")
    println("Total de numeros no demoniacos: $contadorNoDemon")

}