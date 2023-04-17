import java.io.*

class Funciones {
    companion object {
        fun menuSeleccion(): Int {
            var respuesta = 0

            println("Que desea hacer?")
            println("Introduzca el número o la palabra resaltada en mayúsuclas.")
            println(
                "1. ANADIR una peli. \n" +
                        "2. BORRAR una peli. \n" +
                        "3. MOSTRAR todas. \n" +
                        "4. SALIR del programa. \n"
            )

            var entradaUsuario = readln().trim().lowercase()

            when (entradaUsuario) {
                "anadir", "1" -> respuesta = 1
                "borrar", "2" -> respuesta = 2
                "mostrar", "3" -> respuesta = 3
                "salir", "4" -> respuesta = 4
            }

            return respuesta
        }

        fun ejecutarSeleccion(seleccion: Int, rutaArchivo: String) {

            when (seleccion) {
                1 -> anadirPelicula(rutaArchivo)
                2 -> borrarPelicula(rutaArchivo)
                3 -> mostrarPeliculas(rutaArchivo)
                4 -> println("Saliendo del programa.")
            }
        }

        fun anadirPelicula(rutaArchivo: String) {
            var pelicula = recogerDatosPelicula()
            //println(pelicula)

            var os: ObjectOutputStream? = null

            try {
                var fs = FileOutputStream(rutaArchivo, true)
                os = ObjectOutputStream(fs)
                os.writeObject(pelicula)

            } catch (e: FileNotFoundException) {
                e.printStackTrace()

            } catch (e: IOException) {
                e.printStackTrace()

            } finally {
                os?.flush()
                os?.close()
            }

        }

        /*
        fun anadirPelicula(rutaArchivo: String) {
    val pelicula = recogerDatosPelicula()
    val peliculas = mutableListOf<Pelicula>()

    // Leer objetos existentes del archivo
    try {
        val fis = FileInputStream(rutaArchivo)
        val ois = ObjectInputStream(fis)

        var quedanPelis = true
        while (quedanPelis) {
            try {
                val pelicula = ois.readObject() as Pelicula
                peliculas.add(pelicula)
            } catch (e: EOFException) {
                quedanPelis = false
            }
        }
        ois.close()
    } catch (e: FileNotFoundException) {
        // El archivo no existe, no hay objetos para leer
    } catch (e: IOException) {
        e.printStackTrace()
    } catch (e: ClassNotFoundException) {
        e.printStackTrace()
    }

    // Agregar nuevo objeto a la lista
    peliculas.add(pelicula)

    // Escribir todos los objetos en el archivo nuevamente
    try {
        val fos = FileOutputStream(rutaArchivo)
        val os = ObjectOutputStream(fos)

        for (peli in peliculas) {
            os.writeObject(peli)
        }

        os.close()
    } catch (e: FileNotFoundException) {
        e.printStackTrace()
    } catch (e: IOException) {
        e.printStackTrace()
    }
}
         */

        fun borrarPelicula(rutaArchivo: String) {
            val archivoOriginal = File(rutaArchivo)
            val archivoTemporal = File("temp.dat")

            println("Indica el titulo de la pelicula que desea eliminar.")
            var titulo = readln()

            val inputStream = ObjectInputStream(archivoOriginal.inputStream())
            val outputStream = ObjectOutputStream(archivoTemporal.outputStream())

            try {
                while (true) {
                    val pelicula = inputStream.readObject() as Pelicula
                    if (pelicula.titulo != titulo) {
                        outputStream.writeObject(pelicula)
                    }
                }
            } catch (e: EOFException) {
                // Se llegó al final del archivo, no hay más objetos que leer.
            }

            inputStream.close()
            outputStream.close()

            archivoOriginal.delete()
            archivoTemporal.renameTo(archivoOriginal)

            println("Película $titulo borrado correctamente.")
        }

        fun mostrarPeliculas(rutaArchivo: String) {
            var fis = FileInputStream(rutaArchivo)
            //var listaPelis = ArrayList<Pelicula>()
            var quedanPelis = true

            try{
                var ois = ObjectInputStream(fis)

                while (quedanPelis) {
                    try {
                        var pelicula = ois.readObject()
                        println(pelicula)

                    } catch (e: EOFException) {
                        quedanPelis = false
                    }
                }

                ois.close()

            }catch(e: FileNotFoundException){
                e.printStackTrace()

            }catch(e: IOException){
                e.printStackTrace()

            }catch(e:ClassNotFoundException){
                e.printStackTrace()
            }

        }


        fun borrarArchivo(rutaArchivo: String) {
            val archivo = File(rutaArchivo)
            archivo.delete()

            println("Archivo $archivo borrado correctamente.")
        }

        fun recogerDatosPelicula(): Pelicula {
            var pelicula = Pelicula()

            println("Indica el titulo.")
            pelicula.titulo = readln()

            println("Indica el director.")
            pelicula.director = readln()

            do {
                println("Indica la duracion en minutos.")

                try {
                    pelicula.duracion = readln().toInt()
                } catch (e: Exception){
                    println("Debe introducir un número entero mayor que cero.")
                }

            } while (pelicula.duracion <= 0)

            do {
                println("Indica el ano de lanzamiento.")

                try {
                    pelicula.anoLanzamiento = readln().toInt()
                } catch (e: Exception){
                    println("Debe introducir un número entero mayor que cero.")
                }

            } while (pelicula.anoLanzamiento <= 0)

            return pelicula
        }
    }
}