package com.example.emociones.Controllers

import com.example.emociones.Services.TestEquipoService
import com.example.emociones.Utilities.Const
import com.example.emociones.Utilities.Fun
import com.example.emociones.Database.TestEquipo.TestEquipo
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.ComboBox
import javafx.stage.Stage
import java.time.LocalDate

class TestEquipoController {

    @FXML
    private lateinit var cbEstado: ComboBox<String>

    @FXML
    private lateinit var cbEchar: ComboBox<String>

    @FXML
    fun enviarTestEquipo() {
        var test = TestEquipo(Const.usuario.nombre, cbEstado.value, cbEchar.value, Fun.convertirFechaArray(LocalDate.now()))

        val loader = FXMLLoader()
        loader.location = javaClass.getResource(Const.RUTAtabla)

        val root: Parent = loader.load()

        val stage = Stage()
        stage.scene = Scene(root)
        stage.title = "Resultados test equipo"

        val controller = loader.getController<TablaController>()
        controller.recibirValores(test)

        stage.show()
    }

    fun initialize() {
        var companeros = TestEquipoService.obtenerNombresCompaneros(Const.usuario.ID)
        companeros.add(0, "Nadie")

        cbEstado.items = Fun.convertirAObservableList(Const.estadosPosibles)
        cbEchar.items = Fun.convertirAObservableList(companeros)
    }
}