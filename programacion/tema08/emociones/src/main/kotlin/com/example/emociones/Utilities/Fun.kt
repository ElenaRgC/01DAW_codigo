package com.example.emociones.Utilities

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
    }


}