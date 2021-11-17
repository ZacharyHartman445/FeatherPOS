module com.example.featherpos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;
    requires mysql.connector.java;


    opens com.example.featherpos to javafx.fxml;
    exports com.example.featherpos;
    exports com.example.featherpos.ObjectPak;
    opens com.example.featherpos.ObjectPak to javafx.fxml;
}