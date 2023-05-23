package com.example.examen_05_22.Database.viaje

import com.example.emociones.Database.ConexionBD
import com.example.examen_05_22.Utilities.Alerts
import com.example.examen_05_22.Utilities.Const
import com.example.examen_05_22.Utilities.Fun

class ViajeDAOImpl: ViajeDAO {

    override fun selectViajes(): ArrayList<Viaje> {
        var viajes = ArrayList<Viaje>()

        try {
            ConexionBD.conectar()

            val query = Const.QselectViaje
            val ps = ConexionBD.getPreparedStatement(query)
            val rs = ps?.executeQuery()
            while (rs?.next() == true) {
                viajes.add(
                    Viaje(
                        rs.getInt("id"),
                        rs.getString("usuario"),
                        rs.getString("destino"),
                        Fun.convertirFechaArray(rs.getDate("fecha_viaje")),
                        rs.getBoolean("pagado")
                    )
                )
            }

        } catch (e: Exception) {
            val errorMessage = e.message ?: "Error desconocido"
            Alerts.showErrorMessage("Se ha producido un error",errorMessage)
        } finally {
            ConexionBD.desconectar()
        }

        return viajes
    }

}