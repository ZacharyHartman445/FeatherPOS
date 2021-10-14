module com.example.featherpos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.featherpos to javafx.fxml;
    exports com.example.featherpos;
}