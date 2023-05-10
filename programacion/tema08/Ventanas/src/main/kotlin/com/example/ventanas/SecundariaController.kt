package com.example.ventanas

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Button
import javafx.scene.control.TextField
import javafx.stage.Stage
import java.io.IOException
import java.net.URL
import java.util.*

class SecundariaController: Initializable {

    @FXML
    private lateinit var btnSalir:Button
    @FXML
    private lateinit var txtSolucion:TextField



    var persona = Persona("kkkkk")

   /** constructor(p:Persona){
        this.persona = p
    }**/
    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        //txtSolucion.text = persona.nombre
    }
    @FXML
    private fun btnActualizarPulsado(event: ActionEvent) {
        persona.nombre = txtSolucion.text

    }

    @FXML
    private fun panelSecundarioDragDOne(event: ActionEvent) {
        txtSolucion.text = persona.nombre
    }

    @FXML
    private fun btnSalirPulsado(event: ActionEvent) {

        try {
            //persona.nombre = "Cambio"
            val stage = btnSalir.scene.window as Stage
            stage.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
    fun inicializoConDatos(){
        txtSolucion.text = persona.nombre
    }
    fun traspaso(p:Persona){
        this.persona = p
        txtSolucion.text = persona.nombre
    }
}