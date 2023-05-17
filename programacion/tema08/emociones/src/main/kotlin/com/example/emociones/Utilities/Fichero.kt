package com.example.emociones.Utilities

import java.io.*

class Fichero {
    companion object {
        fun escribirTexto(linea: String, ruta: String) {
            try {
                val archivo = BufferedWriter(FileWriter(ruta))
                archivo.write(linea)
                archivo.flush()
                archivo.close()
            } catch (e: Exception) {
                println(e.message)
            }
        }

        fun escribirTexto(texto: Array<String>, ruta: String) {
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

        fun leerTexto(rutaArchivo: String): String {
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

    // Recuerda añadir la clase Serializable
    fun escribirObjeto(objeto: Any, ruta: String) {
        val file = File(ruta)
        val outputStream = ObjectOutputStream(file.outputStream())

        outputStream.writeObject(objeto)
        outputStream.close()
    }

    // Modificar según el objeto que vayamos a leer
    fun leerObjeto(ruta: String): Any {
        val file = File(ruta)
        val inputStream = ObjectInputStream(file.inputStream())

        val objeto = inputStream.readObject() as Any
        inputStream.close()

        return objeto
    }


}