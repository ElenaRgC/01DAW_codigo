import java.io.FileWriter
import java.io.PrintWriter // Este es el bueno.

fun main() {
    try {
        val ruta = "./Ejemplo/datos.txt"
        val fw = FileWriter(ruta, false) // true añade, false sobreescribe
        //fw.write("Estoy escrito con el método write.")
        //fw.write("\n")
        val salida = PrintWriter(fw) // meto un objeto FileWriter
        salida.println("Línea 1 a escribir en el fichero.")
        salida.println("Línea 2 a escribir en el fichero.\n")
        salida.flush() //asegurarnos que todos los datos se escriben antes de cerrar el flujo de escritura
        salida.close()
    } catch (e: Exception) {
        println(e.message)
    }

}