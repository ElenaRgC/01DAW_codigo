package com.example.examen_05_22.Controllers

import com.example.examen_05_22.Database.destino.Destino
import com.example.examen_05_22.Database.usuario.Usuario
import com.example.examen_05_22.Database.viaje.Viaje
import com.example.examen_05_22.Utilities.Alerts
import com.example.examen_05_22.Utilities.Const
import com.example.examen_05_22.Utilities.Fun
import com.example.examen_05_22.Services.InsertarServices
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.control.CheckBox
import javafx.scene.control.ComboBox
import javafx.scene.control.DatePicker

class InsertarController {

    @FXML
    private lateinit var cbUsuario: ComboBox<Usuario>

    @FXML
    private lateinit var cbDestino: ComboBox<Destino>

    @FXML
    private lateinit var dpFecha: DatePicker

    @FXML
    private lateinit var cbPagado: CheckBox

    private lateinit var usuariosObs: ObservableList<Usuario>
    private lateinit var destinosObs: ObservableList<Destino>

    var usuario = Usuario()

    @FXML
    private fun insertarValores() {
        try {
            usuario = cbUsuario.value

            Alerts.showInfoMessage("Valor insertado", "Se ha introducido el valor correctamente.")
        } catch (e: Exception) {
            val errorMessage = e.message ?: "Error desconocido"
            Alerts.showErrorMessage("Se ha producido un error.", errorMessage)
            e.printStackTrace()
        }

    }

    fun crearComboBox() {
        var usuarios = InsertarServices.recibirUsuarios()
        var destinos = InsertarServices.recibirDestinos()

        for (usuario in usuarios) {
            usuariosObs.add(usuario)
        }

        for (destino in destinos) {
            destinosObs.add(destino)
        }
    }

    fun initialize() {
        cbUsuario.items = usuariosObs
        cbDestino.items = destinosObs
    }

    fun devolverUsuario(usuario: Usuario) {
        this.usuario = usuario
    }

    @FXML
    fun volver() {
        this.usuario = cbUsuario.value
        Fun.cerrarVentana(cbUsuario)
    }




}