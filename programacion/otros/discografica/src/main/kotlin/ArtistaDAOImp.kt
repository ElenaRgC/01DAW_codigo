import java.sql.*

class ArtistaDAOImp: ArtistaDAO {

    override val conexion: ConexionBD = ConexionBD()

    override fun selectAllArtists(): Boolean {
        var result = false
        var st: Statement? = null
        var rs: ResultSet? = null

        try {
            conexion.conectar()
            val query = "SELECT * FROM artista"
            st = conexion.getStatement()
            rs = st?.executeQuery(query)
            val listaArtistas = ArrayList<Artista>()

            while (rs?.next() == true) {
                val artista = Artista(
                    rs.getInt("cod"),
                    rs.getString("nombre_artistico"),
                    rs.getString("apellido"),
                    rs.getString("nombre")
                )
                listaArtistas.add(artista)
                println(listaArtistas.last())
            }

            result = true

        } catch (e: Exception) {
            println(e.message)
        } finally {
            st?.close()
            conexion.desconectar()
        }

        return result
    }

    override fun selectArtist(cod: Int): Boolean {
        var result = false
        var st: Statement? = null
        var rs: ResultSet? = null

        try {
            conexion.conectar()
            val query = "SELECT * FROM artista WHERE cod = $cod"
            st = conexion.getStatement()
            rs = st?.executeQuery(query)

            while (rs?.next() == true) {
                val artista = Artista(
                    rs.getInt("cod"),
                    rs.getString("nombre_artistico"),
                    rs.getString("apellido"),
                    rs.getString("nombre")
                )

                println(artista)
            }

            result = true

        } catch (e: Exception) {
            println(e.message)

        } finally {
            st?.close()
            conexion.desconectar()
        }

        return result
    }

    override fun insertArtist(cod: Int, nombre_artistico: String, apellido: String, nombre: String): Boolean {
        var result: Int? = null
        var ps: PreparedStatement? = null

        try {
            conexion.conectar()
            val query = "INSERT INTO artista (cod, nombre_artistico, apellido, nombre) VALUES (?, ?, ?, ?)"
            ps = conexion.getPreparedStatement(query)
            ps?.setInt(1, cod)
            ps?.setString(2, nombre_artistico)
            ps?.setString(3, apellido)
            ps?.setString(4, nombre)
            result = ps?.executeUpdate()

            println("Se ha insertado correctamente a $nombre_artistico con el código $cod.")

        } catch (e: Exception) {
            println(e.message)
            println("No se ha podido insertar al artista con el código $cod.")
        } finally {
            ps?.close()
            conexion.desconectar()
        }

        return result == 1
    }

    override fun insertArtist(artista: Artista): Boolean {
        var result: Int? = null
        var ps: PreparedStatement? = null

        try {
            conexion.conectar()
            val query = "INSERT INTO artista (cod, nombre_artistico, apellido, nombre) VALUES (?, ?, ?, ?)"
            ps = conexion.getPreparedStatement(query)
            ps?.setInt(1, artista.cod)
            ps?.setString(2, artista.nombre_artistico)
            ps?.setString(3, artista.apellido)
            ps?.setString(4, artista.nombre)
            result = ps?.executeUpdate()

            println("Se ha insertado correctamente a ${artista.nombre_artistico} con el código ${artista.cod}.")

        } catch (e: Exception) {
            println(e.message)
            println("No se ha podido insertar al artista con el código ${artista.cod}.")

        } finally {
            ps?.close()
            conexion.desconectar()
        }

        return result == 1
    }

    override fun insertArtists(artistas: ArrayList<Artista>): ArrayList<Artista> {
        conexion.conectar()
        var ps: PreparedStatement? = null
        val query = "INSERT INTO artista (cod, nombre_artistico, apellido, nombre) VALUES (?, ?, ?, ?)"
        ps = conexion.getPreparedStatement(query)
        var listaNoInsertados = ArrayList<Artista>()

        for (artista in artistas) {
            try {
                ps?.setInt(1, artista.cod)
                ps?.setString(2, artista.nombre_artistico)
                ps?.setString(3, artista.apellido)
                ps?.setString(4, artista.nombre)
                ps?.executeUpdate()
            } catch (e: Exception) {
                println("No se ha podido insertar al artista con el código ${artista.cod}")
                listaNoInsertados.add(artista)
            }
        }

        ps?.close()
        conexion.desconectar()

        return listaNoInsertados
    }

    override fun updateArtist(campo: String, antiguoValor: String, nuevoValor: String): Boolean {
        var result = false
        var ps: PreparedStatement? = null
        var query = ""

        try {
            conexion.conectar()

            when (campo) {
                "nombre_artistico", "apellido", "nombre" -> {
                    query = "UPDATE artista SET $campo = ? WHERE $campo LIKE ?"
                    ps = conexion.connection.prepareStatement(query)
                    ps.setString(1, nuevoValor)
                    ps.setString(2, antiguoValor)
                    ps.executeUpdate()
                    result = true
                }

                "cod" -> {
                    query = "UPDATE artista SET $campo = ? WHERE $campo = ?"
                    ps = conexion.connection.prepareStatement(query)
                    ps.setInt(1, nuevoValor.toInt())
                    ps.setInt(2, antiguoValor.toInt())
                    ps.executeUpdate()
                    result = true
                }

                else -> result = false
            }

            println("Se ha modificado correctamente el campo $campo.")

        } catch (e: Exception) {
            println(e.message)
            println("No se ha podido modificar el campo $campo.")
        } finally {
            ps?.close()
            conexion.desconectar()
        }

        return result
    }


    override fun updateArtistName(antiguoNombre: String, nuevoNombre: String): Boolean {
        var result: Int? = null
        var ps: PreparedStatement? = null
        var query = "UPDATE artista SET nombre = ? WHERE nombre LIKE ?"

        try {
            conexion.conectar()

            ps = conexion.getPreparedStatement(query)
            ps?.setString(1,nuevoNombre)
            ps?.setString(2, antiguoNombre)

            result = ps?.executeUpdate()

            println("Se ha actualizado correctamente el nombre.")

        } catch (e: Exception) {
            println(e.message)
            println("No se ha podido actualizar el nombre.")

        } finally {
            ps?.close()
            conexion.desconectar()
        }

        return result == 1
    }

    override fun deleteArtist(cod: Int): Boolean {
        var result = false
        var ps: PreparedStatement? = null
        val query = "DELETE FROM artista WHERE cod = ?"

        try {
            conexion.conectar()

            ps = conexion.connection.prepareStatement(query)
            ps.setInt(1, cod)

            result = true

            println("Se ha eliminado correctamente al artista con código $cod.")
        } catch (e: Exception) {
            println(e.message)
            println("No ha sido posible eliminar al artista con código $cod.")
        } finally {
            ps?.close()
            conexion.desconectar()
        }

        return result
    }

}