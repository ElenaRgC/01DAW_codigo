import java.sql.*

class CategoriaProductoDAOImpl: CategoriaProductoDAO {

    private val conexion = ConexionBD()

    override fun deleteCategoriaProducto(categoria: Categoria): Boolean {

        conexion.conectar()
        var ps: PreparedStatement? = null
        var result: Int? = null

        val queryProducto = "DELETE FROM productos WHERE cod_cat = ?"
        val queryCategoria = "DELETE FROM categorias WHERE cod_grupo = ?"

        ps = conexion.getPreparedStatement(queryProducto)
        ps?.setInt(1, categoria.codigo)
        result = ps?.executeUpdate()

        ps = conexion.getPreparedStatement(queryCategoria)
        ps?.setInt(1, categoria.codigo)
        result = ps?.executeUpdate()

        ps?.close()
        conexion.desconectar()

        return result == 1
    }

    override fun deleteCategoriaProducto(codigo: Int): Boolean {
        conexion.conectar()
        var ps: PreparedStatement? = null
        var result: Int? = null

        val queryProducto = "DELETE FROM productos WHERE cod_cat = ?"
        val queryCategoria = "DELETE FROM categorias WHERE cod_grupo = ?"

        ps = conexion.getPreparedStatement(queryProducto)
        ps?.setInt(1, codigo)
        result = ps?.executeUpdate()



        ps = conexion.getPreparedStatement(queryCategoria)
        ps?.setInt(1, codigo)
        result = ps?.executeUpdate()

        ps?.close()
        conexion.desconectar()

        return result == 1
    }


}