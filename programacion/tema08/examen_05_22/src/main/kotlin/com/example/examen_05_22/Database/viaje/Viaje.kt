package com.example.examen_05_22.Database.viaje

class Viaje {

    var id = 0
    var usuario = ""
    var destino = ""
    var fecha_viaje = ""
    var pagado = true

    constructor()

    constructor(id: Int, usuario: String, destino: String, fecha_viaje: String, pagado: Boolean) {
        this.id = id
        this.usuario = usuario
        this.destino = destino
        this.fecha_viaje = fecha_viaje
        this.pagado = pagado
    }


}