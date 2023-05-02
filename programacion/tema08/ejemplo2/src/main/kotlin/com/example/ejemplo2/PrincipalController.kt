package com.example.ejemplo2

import javafx.fxml.FXML
import javafx.scene.control.Label

class PrincipalController {
    @FXML
    private lateinit var welcomeText: Label

    @FXML
    private fun onHelloButtonClick() {
        welcomeText.text = "Welcome to JavaFX Application!"
    }
}