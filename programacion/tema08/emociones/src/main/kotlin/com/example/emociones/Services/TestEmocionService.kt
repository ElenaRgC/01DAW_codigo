package com.example.emociones.Services

import com.example.emociones.Database.Emocion.Emocion
import com.example.emociones.Database.Emocion.EmocionDAOImpl
import com.example.emociones.Database.Empleado.Empleado
import com.example.emociones.Database.TestEmociones.TestEmociones
import com.example.emociones.Database.TestEmociones.TestEmocionesDAOImpl
import com.example.emociones.Utilities.Fun

class TestEmocionService {

    companion object {
        fun devolverEmociones(): ArrayList<Emocion> {

            val emocionDAO = EmocionDAOImpl()

            return emocionDAO.SelectNueveEmociones()

        }

        fun insertarEmociones(empleado: Empleado, ID_emocion: ArrayList<Int>) {

            val testEmociones = TestEmocionesDAOImpl()

            for (ID in ID_emocion) {

                var test = TestEmociones(empleado.ID, ID, Fun.fechaHoyString())

                testEmociones.insertarTestEmociones(test)

            }

        }
    }



}