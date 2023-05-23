package com.example.examen_05_22.Controllers

import com.example.examen_05_22.Database.usuario.Usuario
import com.example.examen_05_22.Utilities.Alerts
import com.example.examen_05_22.Utilities.Const
import com.example.examen_05_22.Services.PrincipalServices
import com.example.examen_05_22.Services.TablaServices
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.stage.Stage

class PrincipalController {
    @FXML
    private lateinit var lblNombre: Label

    var usuario = Usuario()

    @FXML
    private fun crearFicheroUsuario() {
        var nombre_fichero = Alerts.showInputDialogUsuario("Fichero", "Nombre:")

        PrincipalServices.anadirUsuariosAlFichero(nombre_fichero)
    }

    @FXML
    private fun insertarBBDDUsuario() {
        PrincipalServices.anadirUsuariosABBDD()
    }

    @FXML
    private fun crearFicheroCiudades() {
        PrincipalServices.anadirCiudadesAFichero()
    }

    @FXML
    private fun insertarBBDDCiudades() {
        PrincipalServices.anadirCiudadesABBDD()
    }

    @FXML
    private fun abrirTabla() {

        var viajes = TablaServices.recibirViajes()

        val loader = FXMLLoader()
        loader.location = javaClass.getResource(Const.RUTAtabla)

        val root: Parent = loader.load()

        val stage = Stage()
        stage.scene = Scene(root)
        stage.title = "Viajes"

        val controller = loader.getController<TablaController>()
        controller.obtenerDatosTabla(viajes)

        stage.show()

    }

    @FXML
    private fun abrirInsertar() {

        val loader = FXMLLoader()
        loader.location = javaClass.getResource(Const.RUTAinsertar)
        var controller = loader.getController<InsertarController>()
        controller.crearComboBox()

        val root: Parent = loader.load()

        val stage = Stage()
        stage.scene = Scene(root)
        stage.title = "Nuevo"


        stage.show()

        controller.devolverUsuario(usuario)
        lblNombre.text = usuario.nombre
    }


}