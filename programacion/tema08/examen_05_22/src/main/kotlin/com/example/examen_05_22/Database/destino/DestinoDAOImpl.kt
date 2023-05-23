package com.example.examen_05_22.Database.destino

import com.example.emociones.Database.ConexionBD
import com.example.examen_05_22.Utilities.Alerts
import com.example.examen_05_22.Utilities.Const

class DestinoDAOImpl: DestinoDAO {

    override fun selectDestinos(): ArrayList<Destino> {
        var destinos = ArrayList<Destino>()

        try {
            ConexionBD.conectar()

            val query = Const.QselectDestino
            val ps = ConexionBD.getPreparedStatement(query)
            val rs = ps?.executeQuery()
            while (rs?.next() == true) {
                destinos.add(
                    Destino(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt("precio"),
                        rs.getBoolean("disponible"),
                        rs.getInt("duracion")
                    )
                )
            }

        } catch (e: Exception) {
            val errorMessage = e.message ?: "Error desconocido"
            Alerts.showErrorMessage("Se ha producido un error",errorMessage)
        } finally {
            ConexionBD.desconectar()
        }

        return destinos
    }

}