import kotlin.random.Random

class GalletaEspecial: Galleta {
    var forma = Forma()

    companion object {
        var cantidadGalletas = 0
    }

    constructor()  {
        cantidadGalletas++
        forma = Forma()
        for (i in 0..Random.nextInt(5)) {
            ingredientes.add(Elemento())
        }
    }
}