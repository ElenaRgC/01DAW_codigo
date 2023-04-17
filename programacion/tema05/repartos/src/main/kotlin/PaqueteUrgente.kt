class PaqueteUrgente: Paquete {

    var diasRetraso = 0

    constructor()

    constructor(destinatario: Destinatario, peso: Int, esFragil: Boolean, diasRetraso: Int) {
        this.destinatario = destinatario
        this.peso = peso
        this.esFragil = esFragil
        this.diasRetraso = diasRetraso
    }

    fun aumentarRetraso() {
        diasRetraso++
    }

}