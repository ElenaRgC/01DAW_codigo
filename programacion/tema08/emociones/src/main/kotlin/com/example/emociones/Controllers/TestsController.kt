package com.example.emociones.Controllers

import com.example.emociones.Utilities.Const
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.stage.Stage

class TestsController {

    private lateinit var stage: Stage

    @FXML
    private lateinit var btnTestEquipo: Button
    @FXML
    private lateinit var btnTestJefe: Button
    @FXML
    private lateinit var btnTestEmocion: Button
    @FXML
    private lateinit var btnVolver: Button

    @FXML
    fun abrirTestEquipo() {
        val loader = FXMLLoader()
        loader.location = javaClass.getResource(Const.RUTAtestEquipo)
        val root: Parent = loader.load()

        val stage = Stage()
        stage.scene = Scene(root)
        stage.title = "Elección de test"

        stage.show()
    }

    @FXML
    fun irTestJefe() {
        val loader = FXMLLoader()
        loader.location = javaClass.getResource(Const.RUTAtestJefe)
        val root: Parent = loader.load()

        val stage = Stage()
        stage.scene = Scene(root)
        stage.title = "Elección de test"

        stage.show()
    }

    @FXML
    fun irTestEmocion() {
        val loader = FXMLLoader()
        loader.location = javaClass.getResource(Const.RUTAtestEmocion)
        val root: Parent = loader.load()

        val stage = Stage()
        stage.scene = Scene(root)
        stage.title = "Elección de test"

        stage.show()
    }

    @FXML
    fun irAlInicio() {
        val stage = btnVolver.scene.window as Stage
        stage.close()
    }
}