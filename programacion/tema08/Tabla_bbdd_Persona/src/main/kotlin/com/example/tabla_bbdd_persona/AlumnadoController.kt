package com.example.tabla_bbdd_persona

import javafx.collections.ObservableList
import javafx.fxml.FXML
import BaseDatos.*
import Servicio.*
import javafx.beans.binding.Bindings
import javafx.beans.property.SimpleBooleanProperty
import javafx.beans.property.SimpleObjectProperty
import javafx.beans.property.SimpleStringProperty
import javafx.collections.FXCollections
import javafx.fxml.Initializable
import javafx.scene.control.Button

import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import java.net.URL
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.*

class AlumnadoController: Initializable {
    @FXML
    private lateinit var  colId: TableColumn<Alumnado, Int>
    @FXML
    private lateinit var colNombre: TableColumn<Alumnado, String>
    @FXML
    private lateinit var  colEdad: TableColumn<Alumnado, Int>
    @FXML
    private lateinit var colFecha: TableColumn<Alumnado, Date>
    @FXML
    private lateinit var colMatriculado: TableColumn<Alumnado, Boolean>
    @FXML
    private lateinit var colFechaString: TableColumn<Alumnado, String>

    @FXML
    private lateinit var tablaAlumno: TableView<Alumnado>

    //private lateinit var btnEliminar: Button

    private lateinit var obLista: ObservableList<Alumnado>
    private val alumnoService = AlumnadoServicio()

    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        //asociamos los elementos de la clase alumnado con cada una de las columnas,
        // por medio de una funcion lambda
        colId.setCellValueFactory { cellData ->
            SimpleObjectProperty(cellData.value.id)
        }

        colNombre.setCellValueFactory { cellData ->
            SimpleStringProperty(cellData.value.nombre)
        }

        colEdad.setCellValueFactory { cellData ->
            SimpleObjectProperty(cellData.value.edad)
        }

        colMatriculado.setCellValueFactory { cellData ->
            SimpleBooleanProperty(cellData.value.matriculado)
        }

        colFechaString.setCellValueFactory { cellData ->
            SimpleStringProperty(cellData.value.fechaString)
        }

        colFecha.setCellValueFactory {
                cellData->
            val fechaNacimiento = cellData.value.fechaNacimiento
            val fechaNacimientoSql =
                java.sql.Date.from(fechaNacimiento.atStartOfDay(ZoneId.systemDefault()).toInstant())
            SimpleObjectProperty(fechaNacimientoSql)
        }

        obLista = FXCollections.observableArrayList()
        for (i in alumnoService.seleccionarAlumnos()){
            obLista.add(i)
        }
        tablaAlumno.items=obLista //el items de la tabla es el que necesita la conversion de String --> SimpleStringProperty para poder representarlos internamente
    }
    @FXML
    private fun btnEliminarPulsado() {
        val personaSeleccionada = tablaAlumno.selectionModel.selectedItem
        if (personaSeleccionada != null) {
            tablaAlumno.items.remove(personaSeleccionada)
            alumnoService.borrarAlumnado(personaSeleccionada.id)
            tablaAlumno.refresh() //actualiza la tabla, en este caso no se necesita, pero por si acaso
        }
    }
}