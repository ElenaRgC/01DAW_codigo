package com.example.emociones.Utilities

import com.example.emociones.Database.Empleado.Empleado

class Const {
    companion object {
        // Base de Datos
        val BDurl = "jdbc:mysql://localhost/emociones"
        val BDuser = "kotlin"
        val BDpassword = ""
        val BDforname = "com.mysql.cj.jdbc.Driver"

        // Rutas
        val RUTAtests = "/com/example/emociones/tests-view.fxml"
        val RUTAtestEquipo = "/com/example/emociones/test-equipo-view.fxml"
        val RUTAtestJefe = "/com/example/emociones/test-jefe-view.fxml"
        val RUTAtestEmocion = "/com/example/emociones/test-emocion-view.fxml"

        // Ficheros
        val FICjefe = "/files/"

        // Usuario que ha iniciado sesión
        lateinit var usuario: Empleado
    }
}