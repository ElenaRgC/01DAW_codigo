package com.example.examen_05_22.Database.usuario

import com.example.emociones.Database.ConexionBD
import com.example.examen_05_22.Utilities.Alerts
import com.example.examen_05_22.Utilities.Const
import com.example.examen_05_22.Utilities.Fun
import java.sql.PreparedStatement

class UsuarioDAOImpl: UsuarioDAO {

    override fun selectUsuarios(): ArrayList<Usuario> {
        var usuarios = ArrayList<Usuario>()

        try {
            ConexionBD.conectar()

            val query = Const.QselectUsuario
            val ps = ConexionBD.getPreparedStatement(query)
            val rs = ps?.executeQuery()
            while (rs?.next() == true) {
                usuarios.add(
                    Usuario(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        Fun.convertirFechaArray(rs.getDate("fecha_nacimiento")),
                    )
                )
            }

        } catch (e: Exception) {
            val errorMessage = e.message ?: "Error desconocido"
            Alerts.showErrorMessage("Se ha producido un error",errorMessage)
        } finally {
            ConexionBD.desconectar()
        }

        return usuarios
    }

    override fun insertarUsuarios(usuarios: ArrayList<Usuario>): Boolean {
        ConexionBD.conectar()
        var result: Int? = null
        var ps: PreparedStatement? = null
        val query = Const.QinsertarUsuario

        ps = ConexionBD.getPreparedStatement(query)

        for (usuario in usuarios) {
            try {
                ps?.setInt(1, usuario.ID)
                ps?.setString(2, usuario.nombre)

                var fecha = java.sql.Date(Fun.convertirFechaDate(usuario.fecha_nacimiento).time)

                ps?.setDate(3, fecha)

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