package com.example.emociones.Services

import com.example.emociones.Database.Empleado.Empleado
import com.example.emociones.Database.Empleado.EmpleadoDAOImpl
import com.example.emociones.Utilities.Const
import com.example.emociones.Utilities.Fun
import java.time.LocalDate

class PrincipalService {

    companion object {
        private fun sonMismoEmpleado(empleado1: Empleado, empleado2: Empleado): Boolean {
            var sonMismo = false

            if (empleado1.ID == empleado2.ID && empleado1.nombre == empleado2.nombre &&
                empleado1.fecha_nac == empleado2.fecha_nac) {
                sonMismo = true
            }

            return sonMismo
        }

        fun comprobarUsuario(ID: Int, nombre: String, apellido: String, fecha: LocalDate): Boolean {
            val empleadoDAO = EmpleadoDAOImpl()

            val empleado1 = Empleado(
                ID,
                nombre,
                apellido,
                Fun.convertirFechaArray(fecha))

            var empleado2 = empleadoDAO.selectEmpleado(ID)

            if (sonMismoEmpleado(empleado1, empleado2)) {
                Const.usuario = empleado2
            }

            return sonMismoEmpleado(empleado1, empleado2)
        }
    }

}