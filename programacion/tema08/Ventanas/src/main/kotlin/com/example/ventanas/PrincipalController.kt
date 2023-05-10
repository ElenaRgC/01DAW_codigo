package com.example.ventanas

import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.stage.Modality
import javafx.stage.Stage
import java.io.IOException
import java.net.URL
import java.util.*

class PrincipalController:Initializable {
    @FXML
    private lateinit var lblNombre: Label

    var persona = Persona("PEPE")
    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        lblNombre.text = persona.nombre
    }
    @FXML
    private fun btnVentanaPulsado() {
       // val secundariaStage = Stage()
       // val fxmlLoader = FXMLLoader(SecundariaController::class.java.getResource("Secundaria-view.fxml"))

        try {

           //  * Metodo 1
            val loader = FXMLLoader(javaClass.getResource("Secundaria-view.fxml"))
            val root = loader.load<Parent>()
            val detailController = loader.getController<SecundariaController>()

            //estos dos métodos estan separados para que se entiendan mejor,
            // se podrian realizar en uno solamente
            detailController.traspaso(this.persona)
            detailController.inicializoConDatos()
            //detailController.persona=this.persona
            val stage = Stage()

            stage.scene = Scene(root)
            stage.initModality(Modality.APPLICATION_MODAL)
            stage.initModality(Modality.WINDOW_MODAL)
            //stage.show()
            stage.showAndWait()
            lblNombre.text = persona.nombre

/**
//Metodo 2
            val fxmlLoader = FXMLLoader(SecundariaController::class.java.getResource("Secundaria-view.fxml"))
            val scene = Scene(fxmlLoader.load(), 320.0, 400.0)
            val detailController = fxmlLoader.getController<SecundariaController>()
            detailController.transpaso(this.persona)
            detailController.inicializoConDatos()
            var  stage = Stage()
            stage.title = "Principal"
            stage.initModality(Modality.APPLICATION_MODAL)
            stage.scene = scene
            stage.showAndWait()
            lblNombre.text = persona.nombre

 **/
        } catch (e: IOException) {
            e.printStackTrace()
        }


    }
}