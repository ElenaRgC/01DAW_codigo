import kotlin.random.Random

class OrdenReconocimiento(tiempo: Int): Orden() {
    private var areaRecorrer = 0
    private var encontrado = ""

    init {
        areaRecorrer = Random.nextInt(1,21)
        fecha = tiempo
        tipo = "Reconocimiento"
    }

    fun rastrear() {
        val numAleatorio = Random.nextInt(1,3)

        when(numAleatorio) {
            1 -> encontrado = "Animales"
            2 -> encontrado = "Vegetales"
            else -> encontrado = "Radiación"
        }
        completado = true
    }

}