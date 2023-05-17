package com.example.emociones.Database.Empleado

class Empleado {

    var ID: Int = 0
    var nombre: String = ""
    var apellido: String = ""
    var fecha_nac: String = ""
    var ID_jefe: Int = 0

    constructor()

    constructor(ID: Int, nombre: String, apellido: String, fecha_nac: String, ID_jefe: Int) {
        this.ID = ID
        this.nombre = nombre
        this.apellido = apellido
        this.fecha_nac = fecha_nac
        this.ID_jefe = ID_jefe
    }

    constructor(ID: Int, nombre: String, apellido: String, fecha_nac: String) {
        this.ID = ID
        this.nombre = nombre
        this.apellido = apellido
        this.fecha_nac = fecha_nac
    }
}