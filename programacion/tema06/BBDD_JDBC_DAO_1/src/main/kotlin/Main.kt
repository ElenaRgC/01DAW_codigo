fun main() {
    val categoriaDAO = CategoriaDAOImpl()

    // Obtener todas las categorias
    val categorias = categoriaDAO.getAllCategorias()
    println("Lista de categorias:")
    /*categorias.forEach { println(it) }*/
    for (categoria in categorias) {
        println(categoria)
    }

    // Obtener una categoria por codigo
    val codigo = 1
    val categoria = categoriaDAO.getCategoriaByCodigo(codigo)
    if (categoria != null) {
        println("Categoria con codigo $codigo:")
        println(categoria)
    } else {
        println("No se encontró la categoria con codigo $codigo")
    }


    // Insertar una nueva categoria
    val nuevaCategoria = Categoria(5, "Helados")
    if (categoriaDAO.insertCategoria(nuevaCategoria)) {
        println("Se insertó correctamente la categoria $nuevaCategoria")
    } else {
        println("No se pudo insertar la categoria $nuevaCategoria")
    }

    // Actualizar una categoria existente
    val categoriaExistente = Categoria(1, "Hogar y electrodomésticos")
    if (categoriaDAO.updateCategoria(categoriaExistente)) {
        println("Se actualizó correctamente la categoria $categoriaExistente")
    } else {
        println("No se pudo actualizar la categoria $categoriaExistente")
    }

    // Eliminar una categoria existente NO ES POSIBLE PUES ES CLAVE EXTTERNA, DARA ERROR
    val codigoAEliminar = 3
    if (categoriaDAO.deleteCategoria(codigoAEliminar)) {
        println("Se eliminó correctamente la categoria con codigo $codigoAEliminar")
    } else {
        println("No se pudo eliminar la categoria con codigo $codigoAEliminar")
    }

    // Recibir varias categorías
    val listaCodigos = arrayListOf(1,4,7)
    categoriaDAO.getListCategorias(listaCodigos)

    // Insertar varias categorías
    val listaCategorias = arrayListOf<Categoria>()
    for (i in 0..3) {
        listaCategorias.add(Categoria(11,"Electrónica"))
        listaCategorias.add(Categoria(12,"Pescado"))
        listaCategorias.add(Categoria(13,"Refrescos"))
    }


}
