package com.example.emociones.Controllers

import com.example.emociones.Utilities.Const
import com.example.emociones.Utilities.Fichero
import com.example.emociones.Utilities.Fun
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.Slider
import javafx.scene.control.TextField
import kotlin.math.roundToLong

class TestJefeController {

    @FXML
    private lateinit var slNotaJefe: Slider

    @FXML
    private lateinit var txtNotaJefe: TextField

    @FXML
    fun enviarTestJefe() {
        var nota = slNotaJefe.value
        txtNotaJefe.text = Fun.redondearDouble(nota, 2).toString()

        var IDjefe = Const.usuario.ID_jefe
        var ruta = Const.FICjefe + IDjefe + ".txt"

        Fichero.escribirTexto(nota.toString(), ruta)
    }
}