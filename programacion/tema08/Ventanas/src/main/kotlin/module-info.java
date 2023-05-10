module com.example.ventanas {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.ventanas to javafx.fxml;
    exports com.example.ventanas;
}