package com.example.emociones.Controllers

import com.example.emociones.Database.Empleado.Empleado
import com.example.emociones.Database.Empleado.EmpleadoDAOImpl
import com.example.emociones.Utilities.Const
import com.example.emociones.Utilities.Fun
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.DatePicker
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.stage.Stage

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

        if (empleadoDAO.sonMismoEmpleado(empleado1, empleado2)) {
            Const.usuario = empleado2
        }

        return empleadoDAO.sonMismoEmpleado(empleado1, empleado2)
    }

    fun iniciarSesion() {
        if (comprobarUsuario()) {
            lblError.text = "Datos correctos"

            val loader = FXMLLoader()
            loader.location = javaClass.getResource(Const.RUTAtests)
            val root: Parent = loader.load()

            val stage = Stage()
            stage.scene = Scene(root)
            stage.title = "Elección de test"

            stage.show()
        } else {
            lblError.text = "Datos incorrectos"
        }
    }
}
