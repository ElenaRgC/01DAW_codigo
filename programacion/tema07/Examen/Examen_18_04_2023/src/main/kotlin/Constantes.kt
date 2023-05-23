import java.nio.file.Path

class Constantes {
    companion object {

        // BASE DE DATOS
        var url = "jdbc:mysql://localhost/examen2"
        var user = "kotlin" // Se me rompió XAMPP y estoy usando MAMP, para el que requería crear un usuario
        var password = ""
        val forname="com.mysql.cj.jdbc.Driver"

        // TAREAS

        var Fuerza = 1 // Las tareas de fuerza son de tipo 1

        // BBDD

        var queryGuerreras = "SELECT * FROM guerreras WHERE id BETWEEN ? AND ?"
        var queryGuerreras1 = "SELECT * FROM guerreras WHERE ID >= ? AND ID <= ?;"
        var queryGuerreras2 = "SELECT * FROM guerreras;"

        // Ficheros
        var stringRuta = "ganadoras.txt"
        var ruta =  Path.of(stringRuta)
    }
}