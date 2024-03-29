import java.sql.*

class CategoriaDAOImpl : CategoriaDAO {
    private val conexion = ConexionBD()

    override fun insertListCategorias(listaCategorias: ArrayList<Categoria>): ArrayList<Categoria> {
        conexion.conectar()
        var result: Int? = null
        var ps: PreparedStatement? = null
        var query = "INSERT INTO categorias (cod_grupo, descripcion) VALUES (?, ?)"
        var listaNoInsertados = ArrayList<Categoria>()

        ps = conexion.getPreparedStatement(query)

        for (categoria in listaCategorias) {
            try{
                ps?.setInt(1, categoria.codigo)
                ps?.setString(2, categoria.descripcion)
                result = ps?.executeUpdate()
            } catch (e: SQLException) {
                // println(e.message)
                listaNoInsertados.add(categoria)
            }
        }

        ps?.close()
        conexion.desconectar()

        return listaNoInsertados

    }

    override fun getCategoriaByCodigo(codigo: Int): Categoria? {
        conexion.conectar()
        val query = "SELECT * FROM categorias WHERE cod_grupo = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, codigo)
        val rs = ps?.executeQuery()
        var categoria: Categoria? = null
        if (rs?.next() == true) {
            categoria = Categoria(rs.getInt("cod_grupo"), rs.getString("descripcion"))
        }
        ps?.close()
        conexion.desconectar()
        return categoria
    }

    override fun getListCategorias(listaCodigos: ArrayList<Int>) {
        conexion.conectar()
        val query = "SELECT * FROM categorias WHERE cod_grupo = ?"
        val ps = conexion.getPreparedStatement(query)
        for (codigo in listaCodigos) {
            ps?.setInt(1, codigo)
            val rs = ps?.executeQuery()
            var categoria: Categoria? = null
            if (rs?.next() == true) {
                categoria = Categoria(rs.getInt("cod_grupo"), rs.getString("descripcion"))
            }
            println(categoria)
        }

        ps?.close()
        conexion.desconectar()
    }

    override fun getAllCategorias(): List<Categoria> {
        conexion.conectar()
        val query = "SELECT * FROM categorias"
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val categorias = mutableListOf<Categoria>()
        while (rs?.next() == true) {
            val categoria = Categoria(rs.getInt("cod_grupo"), rs.getString("descripcion"))
            categorias.add(categoria)
        }
        st?.close()
        conexion.desconectar()
        return categorias
    }

    override fun insertCategoria(categoria: Categoria): Boolean {
        var result: Int? = null
        var ps: PreparedStatement? = null
        try {
            conexion.conectar()
            val query = "INSERT INTO categorias (cod_grupo, descripcion) VALUES (?, ?)"
            ps = conexion.getPreparedStatement(query)
            ps?.setInt(1, categoria.codigo)
            ps?.setString(2, categoria.descripcion)
            result = ps?.executeUpdate()
        } catch (e: SQLException) {
            println(e.message)
        } finally {
            ps?.close()
            conexion.desconectar()
        }
            return result == 1
    }

    /*override fun insertListCategorias(listaCategorias: ArrayList<Categoria>) {
        var result: Int? = null
        var ps: PreparedStatement? = null
        try {
            conexion.conectar()
            val query = "INSERT INTO categorias (cod_grupo, descripcion) VALUES (?, ?)"
            for(categoria in listaCategorias) {
                ps = conexion.getPreparedStatement(query)
                ps?.setInt(1, categoria.codigo)
                ps?.setString(2, categoria.descripcion)
                if(ps?.executeUpdate() == 1) {
                    println("Se ha añadido la categoría ${categoria.descripcion}.")
                } else {
                    println("No se ha podido anadir la categoria ${categoria.descripcion}.")
                }
            }
        } catch (e: SQLException) {
            println(e.message)
        } finally {
            ps?.close()
            conexion.desconectar()
        }
    }*/

    override fun updateCategoria(categoria: Categoria): Boolean {
        conexion.conectar()
        val query = "UPDATE categorias SET descripcion = ? WHERE cod_grupo = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setString(1, categoria.descripcion)
        ps?.setInt(2, categoria.codigo)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }

    override fun deleteCategoria(codigo: Int): Boolean {
        conexion.conectar()
        val query = "DELETE FROM categorias WHERE cod_grupo = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, codigo)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }
}
