package com.example.examen_05_22.Services

import com.example.examen_05_22.Database.viaje.Viaje
import com.example.examen_05_22.Database.viaje.ViajeDAOImpl

class TablaServices {

    companion object {

        var viajeDAOImpl = ViajeDAOImpl()

        fun recibirViajes(): ArrayList<Viaje> {
            return viajeDAOImpl.selectViajes()
        }

    }

}