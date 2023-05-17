import com.example.emociones.Const
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.FileReader
import java.io.FileWriter

class Fichero {
    companion object {
        fun escribir(linea: String, ruta: String) {
            try {
                val archivo = BufferedWriter(FileWriter(ruta))
                archivo.write(linea)
                archivo.flush()
                archivo.close()
            } catch (e: Exception) {
                println(e.message)
            }
        }

        fun escribir(texto: Array<String>, ruta: String) {
            try {
                val archivo = BufferedWriter(FileWriter(ruta))
                for (linea in texto) {
                    archivo.write(linea)
                    archivo.newLine()
                }
                archivo.flush()
                archivo.close()
            } catch (e: Exception) {
                println(e.message)
            }
        }

        fun leer(rutaArchivo: String): String {
            val contenido = StringBuilder()

            try {
                val archivo = BufferedReader(FileReader(rutaArchivo))
                var linea: String? = archivo.readLine()

                while (linea != null) {
                    contenido.append(linea)
                    contenido.append("\n")
                    linea = archivo.readLine()
                }

                archivo.close()
            } catch (e: Exception) {
                println(e.message)
            }

            return contenido.toString()
        }
    }
}