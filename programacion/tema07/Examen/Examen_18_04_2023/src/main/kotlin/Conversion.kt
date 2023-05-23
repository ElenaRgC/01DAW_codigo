import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.random.Random

class Conversion {
    companion object {
        fun pasarTextoAFecha(fechaString: String): LocalDate {
            var fecha: LocalDate = LocalDate.now()
            try {
                var formateador = DateTimeFormatter.ISO_LOCAL_DATE
                var fecha = LocalDate.parse(fechaString, formateador)
            } catch (e: Exception) {
                println(e.message)
                println("Se ha producido un error. Se ha devuelto la fecha actual.")
            }

            return fecha
        }

        fun pasarFechaATexto(fecha: LocalDate): String {
            var fechaString = ""
            try {
                var formateador = DateTimeFormatter.ISO_LOCAL_DATE
                var fechaString = fecha.format(formateador)
            } catch (e: Exception) {
                println(e.message)
                println("Se ha producido un error. Se devuelve una String vacía.")
            }

            return fechaString
        }

        fun pasarEnteroATexto(numero: Int): String {
            var numeroString = ""

            try {
                numeroString = numero.toString()
            } catch (e: Exception) {
                println(e.message)
                println("Se ha producido un error. Se devuelve una String vacía.")
            }

            return numeroString
        }

        fun pasarTextoAEntero(numeroString: String): Int {
            var numero = 0

            try {
                numero = numeroString.toInt()
            }catch (e: Exception) {
                println(e.message)
                println("Se ha producido un error. Se devuelve 0.")
            }

            return numero
        }

        fun esDivisible(numero1: Int, numero2: Int): Boolean {
            var esDivisible = false

            try {
                if (numero1 % numero2 == 0) {
                    esDivisible = true
                } else {
                    esDivisible = false
                }
            } catch (e: Exception) {
                println(e.message)
                println("Se ha producido un error. Se devuelve false.")
            }

            return esDivisible
        }
    }
}

fun main() {

    var fechaCorrecta = LocalDate.now()
    var stringFechaCorrecta = "2023-04-11"
    var numeroStringCorrecto = "22"
    var numeroCorrecto1 = 12
    var numeroCorrecto2 = 13

    var valorIncorrecto = 22.2

    var fechaTexto = Conversion.pasarFechaATexto(fechaCorrecta)
    var fechaLocalDate = Conversion.pasarTextoAFecha(stringFechaCorrecta)
    var numero = Conversion.pasarTextoAEntero(numeroStringCorrecto)
    var stringNumero = Conversion.pasarEnteroATexto(numeroCorrecto1)
    var esDivisible = Conversion.esDivisible(numeroCorrecto1, numeroCorrecto2)

    // Si en el método estoy pidiendo fechas y enternos, no puedo probar con valores incorrectos, no pasarían
    // Lo único que puedo introducir mal son las String

    var stringIncorrecta = "-1"

    var fechaTextoError = Conversion.pasarTextoAFecha(stringIncorrecta)

    // Acabo de darme cuenta de que precisamente sólo me pedías eso

    println("_______________________________________________________")

    var numAleatorio1: Int
    var numAleatorio2: Int

    do {
        numAleatorio1 = Random.nextInt(1, 101)
        numAleatorio2 = Random.nextInt(1, 101)

        print("$numAleatorio1, $numAleatorio2 \n")

    } while (!Conversion.esDivisible(numAleatorio1, numAleatorio2))

}