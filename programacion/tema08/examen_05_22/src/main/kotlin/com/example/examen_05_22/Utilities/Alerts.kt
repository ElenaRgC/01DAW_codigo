package com.example.examen_05_22.Utilities
import javafx.scene.control.Alert
import javafx.scene.control.TextInputDialog


class Alerts {
    companion object {
        fun showErrorMessage(title: String, message: String) {
            var alert = Alert(Alert.AlertType.ERROR)
            alert.title = title
            alert.contentText = message
            alert.showAndWait()
        }

        fun showInfoMessage(title: String, message: String) {
            var alert = Alert(Alert.AlertType.INFORMATION)
            alert.title = title
            alert.contentText = message
            alert.showAndWait()
        }

        fun showInputDialogUsuario(title: String, contentText: String): String {
            var usuario = ""
            val dialog = TextInputDialog()
            dialog.headerText = title
            dialog.contentText = contentText
            val window = dialog.showAndWait()
            if (window.isPresent) {
                try {
                    usuario = dialog.editor.text

                    if (usuario.trim() == "") {
                        throw java.lang.Exception("El nombre del fichero no puede estar en blanco.")
                    }

                } catch (e: Exception) {
                    val errorMessage = e.message ?: "Error desconocido"
                    showErrorMessage("Se ha producido un error.", errorMessage)
                }
            }
            return usuario
        }
    }

}