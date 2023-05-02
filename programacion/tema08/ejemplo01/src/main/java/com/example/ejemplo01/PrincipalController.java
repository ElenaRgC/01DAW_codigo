package com.example.ejemplo01;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrincipalController {
    @FXML
    private lateinit var txtNombre: textField;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

}