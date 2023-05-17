package com.example.tabla_bbdd_persona

import BaseDatos.Alumnado
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Label
import java.net.URL
import java.util.*

class AlumnoController: Initializable {

    @FXML
    private lateinit var lblAlumno: Label
    @FXML
    private lateinit var lblNombre: Label
    @FXML
    private lateinit var lblEdad: Label

    fun mostrarAlumno(alumno: Alumnado) {
        lblAlumno.text = alumno.toString()
        lblNombre.text = alumno.nombre
        lblEdad.text = alumno.edad.toString()
    }

    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        //
    }

}