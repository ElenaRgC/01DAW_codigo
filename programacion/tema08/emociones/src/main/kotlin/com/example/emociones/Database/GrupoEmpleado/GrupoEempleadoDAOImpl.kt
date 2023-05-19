package com.example.emociones.Database.GrupoEmpleado

import com.example.emociones.Database.ConexionBD
import com.example.emociones.Utilities.Const

class GrupoEmpleadoDAOImpl: GrupoEmpleadoDAO {

    override fun selectIDGrupo(IDempleado: Int): Int {
        var IDgrupo = 0

        try {
            ConexionBD.conectar()

            val query = Const.QgrupoEmpleado
            val ps = ConexionBD.getPreparedStatement(query)
            ps?.setInt(1, IDempleado)
            val rs = ps?.executeQuery()
            while (rs?.next() == true) {
                IDgrupo = rs.getInt("ID_grupo")
            }

        } catch (e: Exception) {
            println(e.message)
            //e.printStackTrace()
        } finally {
            ConexionBD.desconectar()
        }

        return IDgrupo
    }

}