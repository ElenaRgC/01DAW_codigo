package com.example.generadoraleatorios

import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.control.ProgressBar
import javafx.scene.control.TextField
import javafx.scene.input.MouseEvent
import kotlin.math.truncate
import kotlin.random.Random

class PrincipalController {
    @FXML
    private lateinit var txtNumero1: TextField

    @FXML
    private lateinit var txtNumero2: TextField

    @FXML
    private lateinit var txtResultado: TextField

    @FXML
    private lateinit var barNumero1: ProgressBar

    @FXML
    private lateinit var barNumero2: ProgressBar

    @FXML
    private fun seleccionarMinimo(event: MouseEvent) {
        val mouseX = event.x
        val progressBarWidth = barNumero1.width
        val progress = mouseX / progressBarWidth
        barNumero1.progress = progress
        txtNumero1.text = truncate(barNumero1.progress * 100).toInt().toString()
    }

    @FXML
    private fun seleccionarMaximo(event: MouseEvent) {
        val mouseX = event.x
        val progressBarWidth = barNumero2.width
        val progress = mouseX / progressBarWidth
        barNumero2.progress = progress
        txtNumero2.text = truncate(barNumero2.progress * 100).toInt().toString()
    }

    @FXML
    private fun generarNumeroAleatorio() {
        txtResultado.text = (Random.nextInt(txtNumero1.text.toInt(),txtNumero2.text.toInt())).toString()
    }
}