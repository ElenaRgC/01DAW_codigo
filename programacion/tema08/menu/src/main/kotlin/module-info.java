module com.example.menu {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.menu to javafx.fxml;
    exports com.example.menu;
}