package com.example.emociones.Controllers

import com.example.emociones.Services.TestEmocionService
import com.example.emociones.Utilities.Alerts
import com.example.emociones.Utilities.Const
import com.example.emociones.Utilities.Fun
import javafx.fxml.FXML
import javafx.scene.control.CheckBox
import javafx.scene.control.Label
import javafx.scene.control.TextField

class TestEmocionController {

    @FXML
    private lateinit var lblEmocion0: Label

    @FXML
    private lateinit var txtEmocion0: Label

    @FXML
    private lateinit var cbEmocion0: CheckBox

    @FXML
    private lateinit var lblEmocion1: Label

    @FXML
    private lateinit var txtEmocion1: Label

    @FXML
    private lateinit var cbEmocion1: CheckBox

    @FXML
    private lateinit var lblEmocion2: Label

    @FXML
    private lateinit var txtEmocion2: Label

    @FXML
    private lateinit var cbEmocion2: CheckBox

    @FXML
    private lateinit var lblEmocion3: Label

    @FXML
    private lateinit var txtEmocion3: Label

    @FXML
    private lateinit var cbEmocion3: CheckBox

    @FXML
    private lateinit var lblEmocion4: Label

    @FXML
    private lateinit var txtEmocion4: Label

    @FXML
    private lateinit var cbEmocion4: CheckBox

    @FXML
    private lateinit var lblEmocion5: Label

    @FXML
    private lateinit var txtEmocion5: Label

    @FXML
    private lateinit var cbEmocion5: CheckBox

    @FXML
    private lateinit var lblEmocion6: Label

    @FXML
    private lateinit var txtEmocion6: Label

    @FXML
    private lateinit var cbEmocion6: CheckBox

    @FXML
    private lateinit var lblEmocion7: Label

    @FXML
    private lateinit var txtEmocion7: Label

    @FXML
    private lateinit var cbEmocion7: CheckBox

    @FXML
    private lateinit var lblEmocion8: Label

    @FXML
    private lateinit var txtEmocion8: Label

    @FXML
    private lateinit var cbEmocion8: CheckBox


    @FXML
    private lateinit var labels: List<Label>

    @FXML
    private lateinit var textLabels: List<Label>

    @FXML
    private lateinit var checkBoxes: List<CheckBox>

    private var ID_emociones = ArrayList<Int>()

    fun initialize() {
        agruparElementos()

        var emociones = TestEmocionService.devolverEmociones()

        for (i in 0..8) {
            labels[i].text = emociones[i].nombre
            textLabels[i].text = emociones[i].descripcion
            textLabels[i].isWrapText = true
            ID_emociones.add(emociones[i].ID)
        }

    }

    fun agruparElementos() {
        labels = arrayListOf(
            lblEmocion0,
            lblEmocion1,
            lblEmocion2,
            lblEmocion3,
            lblEmocion4,
            lblEmocion5,
            lblEmocion6,
            lblEmocion7,
            lblEmocion8
        )
        textLabels = arrayListOf(
            txtEmocion0,
            txtEmocion1,
            txtEmocion2,
            txtEmocion3,
            txtEmocion4,
            txtEmocion5,
            txtEmocion6,
            txtEmocion7,
            txtEmocion8
        )
        checkBoxes = arrayListOf(
            cbEmocion0,
            cbEmocion1,
            cbEmocion2,
            cbEmocion3,
            cbEmocion4,
            cbEmocion5,
            cbEmocion6,
            cbEmocion7,
            cbEmocion8
        )
    }

    fun enviarTestEmociones() {

        var emocionesSeleccionadas = ArrayList<Int>()

        try {
            for (i in checkBoxes.indices) {
                if (checkBoxes[i].isSelected) {
                    emocionesSeleccionadas.add(ID_emociones[i])
                }
            }

            if (emocionesSeleccionadas.size != 3) {
                emocionesSeleccionadas.clear()
                throw Exception("Deben seleccionarse 3 emociones.")
            } else {
                TestEmocionService.insertarEmociones(Const.usuario,emocionesSeleccionadas)

                Alerts.showInfoMessage("Base de datos actualizada",
                    "Se han añadido las emociones correctamente.")

                Fun.cerrarVentana(lblEmocion0)
            }

        } catch (e: Exception) {
            val errorMessage = e.message ?: "Error desconocido"
            Alerts.showErrorMessage("Se ha producido un error.", errorMessage)
        }

    }


}