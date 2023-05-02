package com.example.generadoraleatorios

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class PrincipalApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(PrincipalApplication::class.java.getResource("principal-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 450.0, 240.0)
        stage.title = "Generador Números Aleatorios"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(PrincipalApplication::class.java)
}