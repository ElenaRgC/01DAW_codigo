import kotlin.random.Random

class Sector {
    var fila = 0
    var col = 0
    var paquetes = ArrayList<Paquete>()

    constructor()

    constructor(fila: Int, col: Int) {
        this.fila = fila
        this.col = col
    }

    fun generarPaquetes() {
        var aleatorio = Random.nextInt(0,100)
        when (aleatorio) {
            in (0..50) -> paquetes.add(Paquete())
            in (51..75) -> paquetes.add(PaqueteCertificado())
            else -> paquetes.add(PaqueteUrgente())
        }
    }
}