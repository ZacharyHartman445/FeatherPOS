module com.example.featherpos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.featherpos to javafx.fxml;
    exports com.example.featherpos;
    exports com.example.featherpos.ObjectPak;
    opens com.example.featherpos.ObjectPak to javafx.fxml;
}