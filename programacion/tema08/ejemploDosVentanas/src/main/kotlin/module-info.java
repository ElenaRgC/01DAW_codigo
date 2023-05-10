module com.example.ejemplodosventanas {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.ejemplodosventanas to javafx.fxml;
    exports com.example.ejemplodosventanas;
}