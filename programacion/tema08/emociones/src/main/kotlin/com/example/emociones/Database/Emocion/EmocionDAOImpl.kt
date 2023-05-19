package com.example.emociones.Database.Emocion

import com.example.emociones.Database.ConexionBD
import com.example.emociones.Utilities.Alerts
import com.example.emociones.Utilities.Const

class EmocionDAOImpl: EmocionDAO {

    override fun SelectNueveEmociones(): ArrayList<Emocion> {
        var emociones = ArrayList<Emocion>()

        try {
            ConexionBD.conectar()

            val query = Const.QnueveEmociones
            val ps = ConexionBD.getPreparedStatement(query)
            val rs = ps?.executeQuery()
            while (rs?.next() == true) {
                emociones.add(
                    Emocion(
                    rs.getInt("ID"),
                    rs.getString("nombre"),
                    rs.getString("descripcion"),
                )
                )
            }

        } catch (e: Exception) {
            val errorMessage = e.message ?: "Error desconocido"
            Alerts.showErrorMessage("Se ha producido un error",errorMessage)
        } finally {
            ConexionBD.desconectar()
        }

        return emociones
    }

}