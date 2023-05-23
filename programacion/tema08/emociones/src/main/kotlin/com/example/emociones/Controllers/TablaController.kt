package com.example.emociones.Controllers

import com.example.emociones.Database.TestEquipo.TestEquipo
import javafx.beans.property.SimpleObjectProperty
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.fxml.FXML
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.stage.Stage

class TablaController {
    @FXML
    private lateinit var tbTestEquipo: TableView<TestEquipo>

    @FXML
    private lateinit var colEmpleado: TableColumn<TestEquipo, String>

    @FXML
    private lateinit var colEstado: TableColumn<TestEquipo, String>

    @FXML
    private lateinit var colEchar: TableColumn<TestEquipo, String>

    @FXML
    private lateinit var colFecha: TableColumn<TestEquipo, String>

    private lateinit var obLista: ObservableList<TestEquipo>

    private lateinit var test: TestEquipo

    fun initialize() {
        colEmpleado.setCellValueFactory { cellData ->
            SimpleObjectProperty(cellData.value.empleado) }
        colEstado.setCellValueFactory { cellData ->
            SimpleObjectProperty(cellData.value.estado) }
        colEchar.setCellValueFactory { cellData ->
            SimpleObjectProperty(cellData.value.echar) }
        colFecha.setCellValueFactory { cellData ->
            SimpleObjectProperty(cellData.value.fecha) }

        obLista = FXCollections.observableArrayList()
        tbTestEquipo.items = obLista
    }

    fun recibirValores(test: TestEquipo) {
        this.test = test
        rellenarTabla()
    }

    fun rellenarTabla() {
        obLista.add(test)
    }

    @FXML
    fun volver() {
        val stage = tbTestEquipo.scene.window as Stage
        stage.close()
    }

}