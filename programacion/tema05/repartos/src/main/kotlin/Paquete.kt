import kotlin.random.Random

open class Paquete {

    var destinatario = Destinatario()
    var peso = Random.nextInt(1,11)
    var esFragil = Random.nextBoolean()

    constructor()

    constructor(destinatario: Destinatario, peso: Int, esFragil: Boolean) {
        this.destinatario = destinatario
        this.peso = peso
        this.esFragil = esFragil
    }

}