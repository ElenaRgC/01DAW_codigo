package com.example.examen_05_22.Utilities

import com.example.examen_05_22.Database.usuario.Usuario
import java.io.*

class Fichero {
    companion object {

        fun escribirTexto(texto: ArrayList<String>, ruta: String) {
            val archivo = BufferedWriter(FileWriter(ruta, true))
            for (linea in texto) {
                archivo.write(linea)
                archivo.newLine()
            }
                archivo.flush()
                archivo.close()
        }

        fun leerTexto(rutaArchivo: String): ArrayList<String> {
            var texto = ArrayList<String>()

            val archivo = BufferedReader(FileReader(rutaArchivo))
            var linea: String? = archivo.readLine()

            while (linea != null) {
                texto.add(linea)
                linea = archivo.readLine()
            }

            archivo.close()


            return texto
        }

        fun escribirUsuarios(usuarios: ArrayList<Usuario>, ruta: String) {
            val file = File(ruta)
            val outputStream = ObjectOutputStream(file.outputStream())

            for (usuario in usuarios) {
                outputStream.writeObject(usuario)
            }
            outputStream.close()

        }

        fun leerUsuario(ruta: String): ArrayList<Usuario> {
            var usuarios = ArrayList<Usuario>()
            var usuario: Usuario? = null

            val file = File(ruta)
            val inputStream = ObjectInputStream(file.inputStream())
            usuario = inputStream.readObject() as Usuario

            while (usuario != null) {
                usuarios.add(usuario)
                usuario = inputStream.readObject() as Usuario

            }

            inputStream.close()

            return usuarios
        }

    }

}
