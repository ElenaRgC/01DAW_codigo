package com.example.emociones.Database.Empleado

import com.example.emociones.Database.ConexionBD
import com.example.emociones.Utilities.Fun
import java.sql.PreparedStatement

class EmpleadoDAOImpl: EmpleadoDAO {
    constructor()

    override fun sonMismoEmpleado(empleado1: Empleado, empleado2: Empleado): Boolean {
        var sonMismo = false

            if (empleado1.ID == empleado2.ID && empleado1.nombre == empleado2.nombre &&
                empleado1.fecha_nac == empleado2.fecha_nac) {
                sonMismo = true
            }

        return sonMismo
    }

    override fun selectEmpleado(ID: Int): Empleado {

        var empleado = Empleado()

        try {
            ConexionBD.conectar()

            val query = "SELECT * FROM empleado WHERE ID = ?"
            val ps = ConexionBD.getPreparedStatement(query)
            ps?.setInt(1, ID)
            val rs = ps?.executeQuery()
            while (rs?.next() == true) {
                empleado = Empleado(
                    rs.getInt("ID"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    Fun.convertirFechaArray(rs.getDate("fecha_nac")),
                    rs.getInt("ID_jefe")
                )
            }

        } catch (e: Exception) {
            println(e.message)
            //e.printStackTrace()
        } finally {
            ConexionBD.desconectar()
        }

        return empleado
    }
}