import kotlin.random.Random

class Utensilio {
    var fuerza = 0

    constructor() {
        fuerza = Random.nextInt(0,11)
    }

    constructor(fuerza: Int) {
        this.fuerza = fuerza
    }

    override fun toString(): String {
        return "Utensilio: fuerza=$fuerza"
    }

}