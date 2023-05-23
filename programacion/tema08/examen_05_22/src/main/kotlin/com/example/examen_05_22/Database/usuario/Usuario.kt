package com.example.examen_05_22.Database.usuario

import java.io.Serializable

class Usuario:Serializable {
    var ID = 0
    var nombre = ""
    var fecha_nacimiento = ""

    constructor()

    constructor(ID: Int, nombre: String, fecha_nacimiento: String) {
        this.ID = ID
        this.nombre = nombre
        this.fecha_nacimiento = fecha_nacimiento
    }


}