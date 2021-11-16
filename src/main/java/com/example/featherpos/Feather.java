package com.example.featherpos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Feather extends Application {
    @Override
    public void start(Stage stage) throws IOException, ClassNotFoundException {
        FXMLLoader fxmlLoader = new FXMLLoader(Feather.class.getResource("FeatherPOS.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
        stage.setTitle("Feather (Light Weight Point of Sale)");
        stage.setScene(scene);
        stage.show();

        FeatherController controller = fxmlLoader.getController();

        initializeDB();
    }

    public void initializeDB() throws ClassNotFoundException {
        try {
            //load jdbc driver
            Class.forName("com.mysql.jdbc.Driver");

            //establish a connection
            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost/FeatherPOS");
        }
        catch (SQLException ex) {ex.printStackTrace();}
    }

    public static void main(String[] args) {
        launch();
    }
} //end initializeDB