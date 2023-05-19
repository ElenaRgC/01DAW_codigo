package com.example.emociones.Utilities

class TestEquipo {
    var empleado: String = ""
    var estado: String = ""
    var echar: String = ""
    var fecha: String = ""

    constructor()

    constructor(empleado: String, estado: String, echar: String, fecha: String) {
        this.empleado = empleado
        this.estado = estado
        this.echar = echar
        this.fecha = fecha
    }

}