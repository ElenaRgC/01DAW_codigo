package com.example.emociones.Utilities

import com.example.emociones.Database.Empleado.Empleado

class Const {
    companion object {
        // Base de Datos
        val BDurl = "jdbc:mysql://localhost/emociones"
        val BDuser = "kotlin"
        val BDpassword = ""
        val BDforname = "com.mysql.cj.jdbc.Driver"

        // ACUÉRDATE DE PONER UN ESPACIO AL FINAL SI HACES SALTOS DE LÍNEA

        // Queries
        val QempleadosEquipo = "SELECT * FROM empleado " +
                                    "JOIN grupo_empleado ON empleado.ID = grupo_empleado.ID_empleado " +
                                    "WHERE grupo_empleado.ID_grupo = ?"

        val QgrupoEmpleado = "SELECT ID_grupo FROM grupo_empleado " +
                                    "WHERE ? = ID_empleado"

        val QnueveEmociones = "SELECT * FROM emocion ORDER BY RAND() LIMIT 9"

        val QinsertarEmociones = "INSERT INTO test_emociones (ID_empleado, ID_emocion, fecha) " +
                                        "VALUES (?,?,?)"

        // Rutas
        val RUTAtests = "/com/example/emociones/tests-view.fxml"
        val RUTAtestEquipo = "/com/example/emociones/test-equipo-view.fxml"
        val RUTAtestJefe = "/com/example/emociones/test-jefe-view.fxml"
        val RUTAtestEmocion = "/com/example/emociones/test-emocion-view.fxml"
        val RUTAtabla = "/com/example/emociones/tabla-view.fxml"

        // Ficheros
        val FICjefe = "files/"

        // Estados posibles
        val estadosPosibles: ArrayList<String> = arrayListOf("Bien", "Mal", "Regular")


        // Usuario que ha iniciado sesión
        lateinit var usuario: Empleado
    }
}