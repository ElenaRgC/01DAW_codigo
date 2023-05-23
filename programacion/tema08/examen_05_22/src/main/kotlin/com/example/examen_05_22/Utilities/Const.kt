package com.example.examen_05_22.Utilities


class Const {
    companion object {
        // Base de Datos
        val BDurl = "jdbc:mysql://localhost/viajes22"
        val BDuser = "kotlin"
        val BDpassword = ""
        val BDforname = "com.mysql.cj.jdbc.Driver"

        // Queries
        val QselectUsuario = "SELECT * FROM usuario"
        val QinsertarUsuario = "INSERT INTO usuario (id, nombre, fecha_nacimiento) " +
                                        "VALUES (?,?,?);"
        val QselectNombresCiudad = "SELECT ciudad FROM ciudades"
        val QinsertarCiudad ="INSERT INTO ciudades (ciudad) VALUES (?)"

        val QselectDestino = "SELECT * FROM destinos"

        val QselectViaje = "SELECT viaje.id, usuario.nombre AS usuario, destinos.nombre AS destino, viaje.fecha_viaje, pagado FROM viaje " +
                                "JOIN usuario ON usuario.id = viaje.id_usuario " +
                                "JOIN destinos ON destinos.id = viaje.id_destino"

        // Rutas
        var RUTAprincipal = "/com/example/examen_05_22/principal-view.fxml"
        var RUTAtabla = "/com/example/examen_05_22/tabla-view.fxml"
        var RUTAinsertar = "/com/example/examen_05_22/insertar-view.fxml"

        // Ficheros
        val FICusuarioInsertar = "files/"
        val FICusuarioLeer = "files/usuario.txt"

        val FICciudad = "Files/ciudades.txt"

    }
}