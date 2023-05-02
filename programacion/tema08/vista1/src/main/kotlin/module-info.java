module com.example.vista1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.vista1 to javafx.fxml;
    exports com.example.vista1;
}