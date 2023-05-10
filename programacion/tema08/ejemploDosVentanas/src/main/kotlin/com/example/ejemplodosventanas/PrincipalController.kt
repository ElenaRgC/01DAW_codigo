package com.example.ejemplodosventanas

import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.stage.Modality
import javafx.stage.Stage
import java.io.IOException

class PrincipalController {

    @FXML
    private fun abrirNuevaVentana() {
        // val secundariaStage = Stage()
        // val fxmlLoader = FXMLLoader(SecundariaController::class.java.getResource("Secundaria-view.fxml"))

        try {

            //  * Metodo 1
            val loader = FXMLLoader(javaClass.getResource("secondary-view.fxml"))
            val root = loader.load<Parent>()
            val detailController = loader.getController<SecondaryController>()

            val stage = Stage()

            stage.scene = Scene(root)
            stage.initModality(Modality.APPLICATION_MODAL)
            stage.initModality(Modality.WINDOW_MODAL)
            stage.showAndWait()

        } catch (e: Exception) {
            e.printStackTrace()
        }


    }

}