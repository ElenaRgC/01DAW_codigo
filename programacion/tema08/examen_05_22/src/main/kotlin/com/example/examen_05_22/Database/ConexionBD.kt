package com.example.emociones.Database

import com.example.examen_05_22.Utilities.Const
import java.sql.*


class ConexionBD {

    companion object {
        var url = Const.BDurl
        var user = Const.BDuser
        var password = Const.BDpassword
        var conn: Connection? = null

        fun conectar() {
            try {
                Class.forName(Const.BDforname)
                conn = DriverManager.getConnection(url, user, password)
            } catch (e: SQLException) {
                e.printStackTrace()
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
            }
        }

        fun desconectar() {
            try {
                conn?.close()
            } catch (e: SQLException) {
                e.printStackTrace()
            }
        }

        fun getStatement(): Statement? {
            return conn?.createStatement()
        }

        fun getPreparedStatement(sql: String): PreparedStatement? {
            return conn?.prepareStatement(sql)
        }
    }
}