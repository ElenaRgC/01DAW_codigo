import kotlin.random.Random

class Destinatario {

    var nombre = ""
    var direccion = ""
    var telefono = 0

    constructor() {
        nombre = Constantes.nombreAleatorio()
        direccion = Constantes.calleAleatoria()
        telefono = Random.nextInt(666666666,699999999)
    }

    constructor(nombre: String, direccion: String, tlf: Int) {
        this.nombre = nombre
        this.direccion = direccion
        this.telefono = tlf
    }

}