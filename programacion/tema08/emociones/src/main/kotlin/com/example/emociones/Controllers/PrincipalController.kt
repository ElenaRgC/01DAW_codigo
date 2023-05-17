package com.example.emociones.Controllers

import com.example.emociones.Database.Empleado.Empleado
import com.example.emociones.Database.Empleado.EmpleadoDAOImpl
import com.example.emociones.Utilities.Fun
import javafx.fxml.FXML
import javafx.scene.control.DatePicker
import javafx.scene.control.Label
import javafx.scene.control.TextField

class PrincipalController {
    @FXML
    private lateinit var txtNombre: TextField
    @FXML
    private lateinit var txtApellido1: TextField
    @FXML
    private lateinit var txtID: TextField
    @FXML
    private lateinit var dpFechaNac: DatePicker
    @FXML
    private lateinit var lblError: Label


    fun comprobarUsuario(): Boolean {
        val empleadoDAO = EmpleadoDAOImpl()

        val empleado1 = Empleado(
            txtID.text.toInt(),
            txtNombre.text,
            txtApellido1.text,
            Fun.convertirFechaArray(dpFechaNac.value))

        var empleado2 = empleadoDAO.selectEmpleado(txtID.text.toInt())

        return empleadoDAO.sonMismoEmpleado(empleado1, empleado2)
    }

    fun iniciarSesion() {
        if (comprobarUsuario()) {
            lblError.text = "Datos correctos"
        } else {
            lblError.text = "Datos incorrectos"
        }
    }
}
