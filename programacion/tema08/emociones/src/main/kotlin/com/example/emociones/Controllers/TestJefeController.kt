package com.example.emociones.Controllers

import com.example.emociones.Utilities.Const
import com.example.emociones.Utilities.Fichero
import com.example.emociones.Utilities.Fun
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.Slider
import javafx.scene.control.TextField
import javafx.stage.Stage
import kotlin.math.roundToLong

class TestJefeController {

    @FXML
    private lateinit var slNotaJefe: Slider

    @FXML
    private lateinit var txtNotaJefe: TextField

    @FXML
    fun actualizarValor() {
        var nota = slNotaJefe.value
        txtNotaJefe.text = Fun.redondearDouble(nota, 2).toString()
    }

    @FXML
    fun enviarTestJefe() {
        var IDjefe = Const.usuario.ID_jefe
        var ruta = Const.FICjefe + IDjefe +".txt"

        var nota = txtNotaJefe.text

        try {
            Fichero.escribirTexto(nota.toString(), ruta)
            volver()
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    private fun volver() {
        val stage = txtNotaJefe.scene.window as Stage
        stage.close()
    }
}