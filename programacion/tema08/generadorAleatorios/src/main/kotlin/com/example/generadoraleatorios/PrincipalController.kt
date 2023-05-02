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

        barNumero2.isDisable = false

        if (txtNumero2.text != ""){
            if (progress > barNumero2.progress) {
                barNumero2.progress = barNumero1.progress + 0.01
            }
            txtNumero2.text = truncate(barNumero2.progress * 100).toInt().toString()
        }
    }

    @FXML
    private fun seleccionarMaximo(event: MouseEvent) {
        val mouseX = event.x
        val progressBarWidth = barNumero2.width
        val progress = mouseX / progressBarWidth

        if (progress < barNumero1.progress) {
            barNumero2.progress = barNumero1.progress + 0.01
        } else {
            barNumero2.progress = progress
        }

        txtNumero2.text = truncate(barNumero2.progress * 100).toInt().toString()
    }

    @FXML
    private fun generarNumeroAleatorio() {
        if (txtNumero1.text == "" || txtNumero2.text == ""){
            txtResultado.text = "ERROR"
        } else {
            txtResultado.text = (Random.nextInt(txtNumero1.text.trim().toInt(),txtNumero2.text.trim().toInt())).toString()
        }

    }
}