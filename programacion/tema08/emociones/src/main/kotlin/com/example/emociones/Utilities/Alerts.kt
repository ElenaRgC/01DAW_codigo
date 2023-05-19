package com.example.emociones.Utilities
import javafx.scene.control.Alert
import javafx.stage.Stage


class Alerts {
    companion object {
        fun showErrorMessage(title: String, message: String) {
            var alert = Alert(Alert.AlertType.ERROR)
            alert.title = title
            alert.contentText = message
            alert.showAndWait()
        }
        fun showConfirmMessage(title: String, message: String) {
            var alert = Alert(Alert.AlertType.CONFIRMATION)
            alert.title = title
            alert.contentText = message
            alert.showAndWait()
        }
    }


}