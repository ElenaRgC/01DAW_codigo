package com.example.emociones.Database.TestEmpleado

class TestEquipo {
    var ID_equipo: Int = 0
    var ID_empleado: Int = 0
    var ID_echar: Int = 0
    var estado: String = ""

    constructor()

    constructor(ID_equipo: Int, ID_empleado: Int, ID_echar: Int, estado: String) {
        this.ID_equipo = ID_equipo
        this.ID_empleado = ID_empleado
        this.ID_echar = ID_echar
        this.estado = estado
    }


}