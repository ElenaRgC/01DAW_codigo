package com.example.vista1

import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.control.TextField

class PrincipalController {
    @FXML
    private lateinit var txtNumero1: TextField
    @FXML
    private lateinit var txtNumero2: TextField
    @FXML
    private lateinit var txtSolucion: TextField

    private fun cajaTextoADouble(cajaTexto: TextField): Double {
        return cajaTexto.text.trim().toDouble()
    }

    @FXML
    private fun sumar() {
        txtSolucion.text = (cajaTextoADouble(txtNumero1) + cajaTextoADouble(txtNumero2)).toString()
    }

    @FXML
    private fun restar() {
        txtSolucion.text = (cajaTextoADouble(txtNumero1) - cajaTextoADouble(txtNumero2)).toString()
    }

    @FXML
    private fun multiplicar() {
        txtSolucion.text = (cajaTextoADouble(txtNumero1) * cajaTextoADouble(txtNumero2)).toString()
    }

    @FXML
    private fun dividir() {
        if (cajaTextoADouble(txtNumero2) != 0.0) {
            txtSolucion.text = (cajaTextoADouble(txtNumero1) / cajaTextoADouble(txtNumero2)).toString()
        } else {
            txtSolucion.text = "ERROR"
        }
    }

    @FXML
    private fun limpiar() {
        txtNumero1.text = ""
        txtNumero2.text = ""
        txtSolucion.text = ""
    }
}