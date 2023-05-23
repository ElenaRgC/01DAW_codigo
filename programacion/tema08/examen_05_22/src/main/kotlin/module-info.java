module com.example.examen_05_22 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.sql;


    opens com.example.examen_05_22 to javafx.fxml;
    exports com.example.examen_05_22;
    opens com.example.examen_05_22.Controllers to javafx.fxml;
    exports com.example.examen_05_22.Controllers;

}