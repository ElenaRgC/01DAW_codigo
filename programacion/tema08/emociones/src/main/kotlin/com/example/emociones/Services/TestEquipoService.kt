package com.example.emociones.Services

import com.example.emociones.Database.Empleado.Empleado
import com.example.emociones.Database.Empleado.EmpleadoDAOImpl
import com.example.emociones.Database.GrupoEmpleado.GrupoEmpleadoDAOImpl

class TestEquipoService {
    companion object {
        fun obtenerNombresCompaneros(IDempleado: Int): ArrayList<String> {
            var companeros = obtenerCompaneros(IDempleado)

            var nombres = ArrayList<String>()
            for (companero in companeros) {
                nombres.add(companero.nombre)
            }
            return nombres
        }

        fun obtenerCompaneros(IDempleado: Int): ArrayList<Empleado> {
            val DAOEmpleado = EmpleadoDAOImpl()
            val DAOGrupoEmpl = GrupoEmpleadoDAOImpl()
            val IDequipo = DAOGrupoEmpl.selectIDGrupo(IDempleado)
            val companeros = DAOEmpleado.selectEmpleadosEquipo(IDequipo)

            var i = 0
            while (i < companeros.size) {
                val empleado = companeros[i]
                if (empleado.ID == IDempleado) {
                    companeros.removeAt(i)
                } else {
                    i++
                }
            }

            return companeros
        }
    }
}