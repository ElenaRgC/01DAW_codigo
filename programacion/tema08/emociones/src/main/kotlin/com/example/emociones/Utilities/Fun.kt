package com.example.emociones.Utilities

import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.scene.Node
import javafx.stage.Stage
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.math.pow
import kotlin.math.roundToInt

class Fun {
    companion object {
        fun convertirFechaArray(fecha: Date): String {
            val formato = SimpleDateFormat("dd/MM/yyyy")
            val fechaString = formato.format(fecha)

            return fechaString
        }

        fun convertirFechaArray(fecha: LocalDate): String {
            val formato = DateTimeFormatter.ofPattern("dd/MM/yyyy")
            val fechaString = formato.format(fecha)

            return fechaString
        }

        fun convertirFechaDate (fecha: String): Date {
            val formato = SimpleDateFormat("dd/MM/yyyy")
            return formato.parse(fecha)
        }

        fun redondearDouble(numero: Double, decimales: Int): Double {
            val factor = 10.0.pow(decimales)
            return (numero * factor).roundToInt() / factor
        }


        fun convertirAObservableList(lista: ArrayList<String>): ObservableList<String> {
            return FXCollections.observableArrayList(lista)
        }

        fun fechaHoyString(): String {
            return convertirFechaArray(LocalDate.now())
        }

        fun cerrarVentana(elemento: Node) {
            val stage = elemento.scene.window as Stage
            stage.close()
        }
    }


}