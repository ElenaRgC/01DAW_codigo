module com.example.tablas {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.tablas to javafx.fxml;
    exports com.example.tablas;
}