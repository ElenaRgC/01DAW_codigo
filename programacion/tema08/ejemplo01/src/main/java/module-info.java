module com.example.ejemplo01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejemplo01 to javafx.fxml;
    exports com.example.ejemplo01;
}