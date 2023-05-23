package com.example.examen_05_22.Services

import com.example.examen_05_22.Utilities.Alerts
import com.example.examen_05_22.Utilities.Const
import com.example.examen_05_22.Utilities.Fichero
import com.example.examen_05_22.Database.ciudad.CiudadDAOImpl
import com.example.examen_05_22.Database.usuario.UsuarioDAOImpl

class PrincipalServices {

    companion object {
        var usuarioDAOImpl = UsuarioDAOImpl()
        var ciudadDAOImpl = CiudadDAOImpl()

        fun anadirUsuariosAlFichero(nombre_fichero: String) {
            var ruta = Const.FICusuarioInsertar + nombre_fichero + ".txt"

            try {
                var usuarios = usuarioDAOImpl.selectUsuarios()

                    Fichero.escribirUsuarios(usuarios, ruta)

                Alerts.showInfoMessage("Actualización del fichero", "Los datos se han guardado correctamente.")

            } catch (e: Exception) {
                val errorMessage = e.message ?: "Error desconocido"
                Alerts.showErrorMessage("Se ha producido un error.", errorMessage)
            }

        }

        fun anadirUsuariosABBDD() {

            try {
                var usuarios = Fichero.leerUsuario(Const.FICusuarioLeer)
                usuarioDAOImpl.insertarUsuarios(usuarios)

                Alerts.showInfoMessage("Actualización de la Base de Datos", "Los datos se han guardado correctamente.")

            } catch (e: Exception) {
                val errorMessage = e.message ?: "Error desconocido"
                Alerts.showErrorMessage("Se ha producido un error.", errorMessage)
            }

        }

        fun anadirCiudadesAFichero() {

            try {
                var ciudades = ciudadDAOImpl.selectNombreCiudades()
                Fichero.escribirTexto(ciudades, Const.FICciudad)

                Alerts.showInfoMessage("Actualización del fichero", "Los datos se han guardado correctamente.")

            } catch (e: Exception) {
                val errorMessage = e.message ?: "Error desconocido"
                Alerts.showErrorMessage("Se ha producido un error", errorMessage)
            }

        }

        fun anadirCiudadesABBDD() {


            try {
                var ciudades = Fichero.leerTexto(Const.FICciudad)
                ciudadDAOImpl.insertarCiudades(ciudades)
                Alerts.showInfoMessage("Actualización de la Base de Datos", "Los datos se han guardado correctamente.")

            } catch (e: Exception) {
                val errorMessage = e.message ?: "Error desconocido"
                Alerts.showErrorMessage("Se ha producido un error.", errorMessage)
            }

        }

    }
}