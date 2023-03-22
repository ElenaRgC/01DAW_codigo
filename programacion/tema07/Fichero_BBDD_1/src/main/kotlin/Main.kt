import Autores.* // Importa los archivos dentro de la carpeta Autores

fun main(args: Array<String>) {
    val AutoresDAO = AutoresDAOImpl()
    val AutoresFichero= AutoresFichero()


    // Ejemplo de sacar de BBDD a fichero
    /*var c = AutoresDAO.todosLosAutores()
    AutoresFichero.insertar(c,Constantes.ficheroAutores,false)
    println("Control por la salida Estandar")
    for (i in c!!) {
        println(i)
    }*/

    //ejemplo de insertar de fichero a bbdd
    AutoresDAO.insertarLista(AutoresFichero.recuperar(Constantes.ficheroAutores))

}