import java.io.File
import java.nio.file.*

fun main() { //Elena Rodríguez Calderón

    val DADO = Dado(3)
    val X = DADO.hacerTirada()
    val Y = DADO.hacerTirada()

    var listaGanadoras = ArrayList<MujerGuerrera>()
    var retos:ArrayList<Tarea>

    var turno = 0

    do {
        println("\n Turno ${turno + 1}")
        var tablero = Tablero()

        var equipo1 = tablero.crearEquipo(X)
        var equipo2 = tablero.crearEquipo(X)

        retos = tablero.generarRetos(X)

        var ganadorasTurno = tablero.jugar(equipo1, equipo2, retos)
        listaGanadoras.addAll(ganadorasTurno)

        turno++
    } while (turno < Y)

    println("\n Juego terminado.")

    val ruta = Constantes.ruta
    val lineas = ArrayList<String>()
    for (ganadora in listaGanadoras) {
        lineas.add(ganadora.toString())
    }

    Files.newBufferedWriter(ruta, StandardOpenOption.CREATE, StandardOpenOption.WRITE).use {
        writer -> lineas.forEach {
            writer.write(it)
            writer.newLine()
        }
    }

    println("\n Lista ganadoras:")

    var archivo = File(Constantes.stringRuta)
    var ganadoras = archivo.readLines()
    for (ganadora in ganadoras) {
        println(ganadora)
    }

}