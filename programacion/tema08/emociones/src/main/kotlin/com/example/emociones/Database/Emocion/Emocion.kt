package com.example.emociones.Database.Emocion

class Emocion {
    var ID: Int = 0
    var nombre: String = ""
    var descripcion: String = ""

    constructor()

    constructor(ID: Int, nombre: String, descripcion: String) {
        this.ID = ID
        this.nombre = nombre
        this.descripcion = descripcion
    }


}