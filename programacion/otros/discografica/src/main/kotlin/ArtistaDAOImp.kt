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
                    rs.getString("nombre"))
                listaArtistas.add(artista)
                // println(listaArtistas.last())
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
                    rs.getString("nombre"))

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

        } catch(e: Exception) {
            println(e.message)
        } finally {
            ps?.close()
            conexion.desconectar()
        }

        return result == 1
    }

    /*
    override fun insertarLista(c:ArrayList<Autores>):ArrayList<Autores>{
        conexion.conectar()
        var result:Int?=null
        var ps: PreparedStatement? = null
        var listaNoInsertados = ArrayList<Autores>()

        val query = Constantes.autores_sql_insert
        ps = conexion.getPreparedStatement(query)
        for (i in c){
            try {
                ps?.setInt(1, i.id)
                ps?.setString(2, i.nombre)
                ps?.setString(3, i.nacionalidad)
                result = ps?.executeUpdate()
            }catch (e:Exception){
                //println("no Se puede insertar ${i.codigo}")
                listaNoInsertados.add(i)
            }
        }
        ps?.close()
        conexion.desconectar()
        return listaNoInsertados
    }
     */
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

        } catch(e: Exception) {
            println(e.message)
        } finally {
            ps?.close()
            conexion.desconectar()
        }

        return result == 1
    }

    override fun insertArtists(artistas: ArrayList<Artista>): ArrayList<Artista> {
        TODO("Not yet implemented")
    }

    override fun updateArtist(cod: Int, campo: String, nuevoValor: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun updateArtistName(cod: Int, nuevoNombre: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun deleteArtist(cod: Int): Boolean {
        TODO("Not yet implemented")
    }
}