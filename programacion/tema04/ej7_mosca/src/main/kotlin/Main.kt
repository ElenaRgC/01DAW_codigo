import kotlin.random.Random

fun main() {
    /*Vamos a realizar la mosca que ya hicimos con matrices en el tema anterior pero orientado a
    objetos.
    Una vez que tengamos resuelto el problema vamos a ampliar el juego añadiendo a la mosca un
    tipo (corriente, verde, negra, coj…) y vidas. Las vidas de la mosca indican la cantidad de golpes
    que tiene que recibir para matarla. Cuando golpeamos una mosca y le quedan vidas, le
    restamos una vida y revolotea.*/

    var mosca1 = Mosca()
    var golpeAdyacente = false
    var golpeAcertado = false

    val FILAS = 5
    val COLUMNAS = 5
    val TABLERO =  arrayOfNulls<Casilla> (FILAS * COLUMNAS)

    var i = 0
    var j = 0

    while (i < FILAS) {
        j = 0
        while (j < COLUMNAS) {
            
            j++
        }
        i++
    }

    if (golpeAdyacente) {
        mosca1.revolotear()
    }

    if (golpeAcertado) {
        mosca1.morir()
    }

}

class Mosca {
    var posicionX: Int = 0
    var posicionY: Int = 0
    var estaViva: Boolean = true

    fun revolotear() {
        posicionX = Random.nextInt()
        posicionY = Random.nextInt()
    }

    fun morir() {
        estaViva = false
    }

}

class Casilla {
    var posicionX: Int = 0
    var posicionY: Int = 0
}

class Persona {

    fun golpear(X: Int, Y: Int) {

    }
}
