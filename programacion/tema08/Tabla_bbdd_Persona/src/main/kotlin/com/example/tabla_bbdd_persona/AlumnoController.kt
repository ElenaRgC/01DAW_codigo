package com.example.tabla_bbdd_persona

import BaseDatos.Alumnado
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Label
import java.net.URL
import java.util.*

class AlumnoController: Initializable {

    @FXML
    private lateinit var lbAlumno: Label

    fun mostrarAlumno(alumno: Alumnado) {
        lbAlumno.text = alumno.toString()
    }

    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        TODO("Not yet implemented")
    }

}