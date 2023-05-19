package com.example.emociones.Database.Empleado

import com.example.emociones.Database.ConexionBD
import com.example.emociones.Utilities.Const
import com.example.emociones.Utilities.Fun
import java.sql.PreparedStatement

class EmpleadoDAOImpl: EmpleadoDAO {
    constructor()

    override fun selectEmpleado(IDempleado: Int): Empleado {

        var empleado = Empleado()

        try {
            ConexionBD.conectar()

            val query = "SELECT * FROM empleado WHERE ID = ?"
            val ps = ConexionBD.getPreparedStatement(query)
            ps?.setInt(1, IDempleado)
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

    override fun selectEmpleadosEquipo(IDgrupo: Int): ArrayList<Empleado> {
        var empleados = ArrayList<Empleado>()

        try {
            ConexionBD.conectar()

            val query = Const.QempleadosEquipo
            val ps = ConexionBD.getPreparedStatement(query)
            ps?.setInt(1, IDgrupo)
            val rs = ps?.executeQuery()
            while (rs?.next() == true) {
                empleados.add(Empleado(
                    rs.getInt("ID"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    Fun.convertirFechaArray(rs.getDate("fecha_nac")),
                    rs.getInt("ID_jefe")
                )
                )
            }

        } catch (e: Exception) {
            println(e.message)
            //e.printStackTrace()
        } finally {
            ConexionBD.desconectar()
        }

        return empleados
    }

}