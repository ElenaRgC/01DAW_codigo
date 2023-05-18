package com.example.emociones.Utilities

import com.example.emociones.Database.Empleado.Empleado
import java.text.DecimalFormat
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

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

        fun redondearDouble(numero: Double, decimales: Int): Double {
            val patron = "#.${"0".repeat(decimales)}"
            val decimalFormat = DecimalFormat(patron)
            return decimalFormat.format(numero).toDouble()
        }

    }


}