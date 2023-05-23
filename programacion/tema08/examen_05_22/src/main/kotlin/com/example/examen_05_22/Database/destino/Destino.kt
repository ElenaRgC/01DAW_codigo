package com.example.examen_05_22.Database.destino

class Destino {

    var id = 0
    var nombre = ""
    var precio = 0
    var disponible = true
    var duracion = 0

    constructor()

    constructor(id: Int, nombre: String, precio: Int, disponible: Boolean, duracion: Int) {
        this.id = id
        this.nombre = nombre
        this.precio = precio
        this.disponible = disponible
        this.duracion = duracion
    }


}