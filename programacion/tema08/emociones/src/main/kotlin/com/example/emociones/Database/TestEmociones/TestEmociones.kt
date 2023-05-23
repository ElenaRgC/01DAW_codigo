package com.example.emociones.Database.TestEmociones

class TestEmociones {

    var ID_empleado: Int = 0
    var ID_emocion: Int = 0
    var fecha: String = ""

    constructor()

    constructor(ID_empleado: Int, ID_emocion: Int, fecha: String) {
        this.ID_empleado = ID_empleado
        this.ID_emocion = ID_emocion
        this.fecha = fecha
    }


}