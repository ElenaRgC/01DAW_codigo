import kotlin.random.Random

class Forma {
    var tipoForma = ""
    var dificultad = 0
    var tiempoModelado = 0 //minutos

    constructor() {
        tipoForma = definirForma()
        dificultad = Random.nextInt(0,11)
        tiempoModelado = Random.nextInt(5,16)
    }

    fun definirForma(): String {
        return ""
    }
}