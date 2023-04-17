fun main() { // Elena Rodríguez Calderón

    //var pelicula1 = Pelicula("Titulo1", "Director1", 1, 2001)
    //var pelicula2 = Pelicula("Titulo2", "Director2", 2, 2002)

    var respuesta = 0

    do {

        do {
            respuesta = Funciones.menuSeleccion()
        } while (respuesta !in (1..4))

        Funciones.ejecutarSeleccion(respuesta, "./src/main/kotlin/pelis.ser")

    } while (respuesta != 4)

    // Funciones.borrarArchivo("./src/main/kotlin/pelis.ser")

}