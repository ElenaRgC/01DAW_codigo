class PaqueteCertificado: Paquete {

    var fechaEntrega = 0
    var firmaEntrega = ""

    constructor()

    constructor(destinatario: Destinatario, peso: Int, esFragil: Boolean, fecha: Int, firma: String) {
        this.destinatario = destinatario
        this.peso = peso
        this.esFragil = esFragil
        this.fechaEntrega = fecha
        this.firmaEntrega = firma
    }

}