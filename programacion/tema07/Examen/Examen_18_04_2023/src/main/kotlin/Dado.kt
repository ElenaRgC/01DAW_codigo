import kotlin.random.Random

class Dado {

    companion object {
        private var totalTiradas = 0
    }

    var caras = 0
    private var tiradasDado = 0
    private var historico = "Dados lanzados"

    constructor()

    constructor(caras: Int) {
        this.caras = caras
    }

    fun hacerTirada(): Int {
        totalTiradas++
        tiradasDado++
        var tirada = Random.nextInt(1, caras + 1)

        historico = "$historico, $tirada"

        return tirada
    }

    fun hacerVariasTiradas(numTiradas: Int): IntArray {
        var tiradas = IntArray(numTiradas)

        for (i in tiradas.indices) {
            tiradas[i] = hacerTirada()
        }

        return tiradas
    }

    fun getTiradasTotales(): Int {
        return totalTiradas
    }

    fun getTiradasDado(): Int {
        return tiradasDado
    }

    fun getHistorico(): String {
        return historico
    }

    fun getEstadisticas(): String {
        var probabilidad = 1 / caras * 100
        var estadistica = ""

        for (i in 1 .. caras) {
            estadistica += "$i: $probabilidad \n"
        }

        return estadistica
    }

    override fun toString(): String {
        return "Dado: caras=$caras"
    }


}