import kotlin.random.Random

open class Galleta {
    companion object {
        var cantidadGalletas = 0
    }

    var ingredientes = arrayListOf<Elemento>()

    constructor() {
        cantidadGalletas++
        for (i in 0..Random.nextInt(5)) {
            ingredientes.add(Elemento())
        }
    }
}