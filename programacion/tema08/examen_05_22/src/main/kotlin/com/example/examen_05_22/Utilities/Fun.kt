package com.example.examen_05_22.Utilities

import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.scene.Node
import javafx.stage.Stage
import java.text.SimpleDateFormat
import java.util.*

class Fun {
    companion object {
        fun convertirFechaArray(fecha: Date): String {
            val formato = SimpleDateFormat("dd/MM/yyyy")
            val fechaString = formato.format(fecha)

            return fechaString
        }

        fun convertirFechaDate (fecha: String): Date {
            val formato = SimpleDateFormat("dd/MM/yyyy")
            return formato.parse(fecha)
        }


        fun cerrarVentana(elemento: Node) {
            val stage = elemento.scene.window as Stage
            stage.close()
        }
    }


}