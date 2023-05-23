package com.example.examen_05_22.Controllers

import com.example.examen_05_22.Utilities.Fun
import com.example.examen_05_22.Database.viaje.Viaje
import javafx.beans.property.SimpleObjectProperty
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.fxml.FXML
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView

class TablaController {

    @FXML
    private lateinit var tbViaje: TableView<Viaje>

    @FXML
    private lateinit var colUsuario: TableColumn<Viaje, String>

    @FXML
    private lateinit var colDestino: TableColumn<Viaje, String>

    @FXML
    private lateinit var colFecha: TableColumn<Viaje, String>

    @FXML
    private lateinit var colPagado: TableColumn<Viaje, Boolean>

    private lateinit var viajes: ObservableList<Viaje>

    fun initialize() {
        colUsuario.setCellValueFactory { cellData ->
            SimpleObjectProperty(cellData.value.usuario)
        }
        colDestino.setCellValueFactory { cellData ->
            SimpleObjectProperty(cellData.value.destino)
        }
        colFecha.setCellValueFactory { cellData ->
            SimpleObjectProperty(cellData.value.fecha_viaje)
        }
        colPagado.setCellValueFactory { cellData ->
            SimpleObjectProperty(cellData.value.pagado)
        }

        viajes = FXCollections.observableArrayList()
        tbViaje.items = viajes
    }

    @FXML
    fun volver() {
        Fun.cerrarVentana(tbViaje)
    }

    fun obtenerDatosTabla(viajes: ArrayList<Viaje>) {
        for (viaje in viajes) {
            this.viajes.add(viaje)
        }
    }

}