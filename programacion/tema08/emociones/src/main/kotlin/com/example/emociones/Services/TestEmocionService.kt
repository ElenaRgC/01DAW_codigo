package com.example.emociones.Services

import com.example.emociones.Database.Emocion.Emocion
import com.example.emociones.Database.Emocion.EmocionDAOImpl

class TestEmocionService {

    companion object {
        fun devolverEmociones(): ArrayList<Emocion> {

            val emocionDAO = EmocionDAOImpl()

            return emocionDAO.SelectNueveEmociones()

        }
    }



}