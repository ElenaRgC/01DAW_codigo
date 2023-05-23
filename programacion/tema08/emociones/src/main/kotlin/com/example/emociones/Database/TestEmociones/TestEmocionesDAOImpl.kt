package com.example.emociones.Database.TestEmociones

import com.example.emociones.Database.ConexionBD
import com.example.emociones.Utilities.Alerts
import com.example.emociones.Utilities.Const
import com.example.emociones.Utilities.Fun
import java.sql.PreparedStatement
import java.time.LocalDate

class TestEmocionesDAOImpl: TestEmocionesDAO {

    override fun insertarTestEmociones(test: TestEmociones): Boolean {
        ConexionBD.conectar()
        var result: Int? = null
        var ps: PreparedStatement? = null
        val query = Const.QinsertarEmociones

        ps = ConexionBD.getPreparedStatement(query)

        try {
            ps?.setInt(1, test.ID_empleado)
            ps?.setInt(2, test.ID_emocion)

            var fecha = java.sql.Date(Fun.convertirFechaDate(test.fecha).time)

            ps?.setDate(3, fecha)

            result = ps?.executeUpdate()
        } catch (e: Exception) {
            val errorMessage = e.message ?: "Error desconocido"
            Alerts.showErrorMessage("Se ha producido un error.", errorMessage)
        }

        ps?.close()
        ConexionBD.desconectar()

        return result == 1
    }

}