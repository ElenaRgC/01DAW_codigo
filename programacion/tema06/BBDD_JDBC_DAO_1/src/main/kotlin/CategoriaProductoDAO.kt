interface CategoriaProductoDAO {

    fun deleteCategoriaProducto(categoria: Categoria): Boolean
    fun deleteCategoriaProducto(codigo: Int): Boolean

}