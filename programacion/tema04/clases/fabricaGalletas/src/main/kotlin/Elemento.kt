import kotlin.random.Random

class Elemento {
    var nombre = ""
    var cantidadGrasas = 0
    var cantidadCarbohidratos = 0

    constructor() {
        cantidadGrasas = Random.nextInt(0,10)
        cantidadCarbohidratos = Random.nextInt(0,20)
    }
}