module com.example.emociones {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.sql;
    requires mysql.connector.j;


    opens com.example.emociones to javafx.fxml;
    exports com.example.emociones;
}