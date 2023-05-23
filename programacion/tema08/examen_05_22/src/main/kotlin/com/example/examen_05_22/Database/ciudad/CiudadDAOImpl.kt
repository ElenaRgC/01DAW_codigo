package com.example.examen_05_22.Database.ciudad

import com.example.emociones.Database.ConexionBD
import com.example.examen_05_22.Utilities.Alerts
import com.example.examen_05_22.Utilities.Const
import java.sql.PreparedStatement

class CiudadDAOImpl : CiudadDAO {

    override fun selectNombreCiudades(): ArrayList<String> {

        var nombres = ArrayList<String>()

        try {
            ConexionBD.conectar()

            val query = Const.QselectNombresCiudad
            val ps = ConexionBD.getPreparedStatement(query)
            val rs = ps?.executeQuery()
            while (rs?.next() == true) {
                nombres.add(rs.getString("ciudad"))
            }

        } catch (e: Exception) {
            val errorMessage = e.message ?: "Error desconocido"
            Alerts.showErrorMessage("Se ha producido un error", errorMessage)
        } finally {
            ConexionBD.desconectar()
        }

        return nombres
    }

    override fun insertarCiudades(ciudades: ArrayList<String>): Boolean {
        ConexionBD.conectar()
        var result: Int? = null
        var ps: PreparedStatement? = null
        val query = Const.QinsertarCiudad

        ps = ConexionBD.getPreparedStatement(query)

        for (ciudad in ciudades) {
            try {
                ps?.setString(1, ciudad)

                result = ps?.executeUpdate()
            } catch (e: Exception) {
                val errorMessage = e.message ?: "Error desconocido"
                Alerts.showErrorMessage("Se ha producido un error.", errorMessage)
            }
        }

        ps?.close()
        ConexionBD.desconectar()

        return result == 1
    }

}