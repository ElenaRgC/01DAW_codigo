package com.example.ejemplo2

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class PrincpalApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(PrincpalApplication::class.java.getResource("principal-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
        stage.title = "Hello!"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(PrincpalApplication::class.java)
}