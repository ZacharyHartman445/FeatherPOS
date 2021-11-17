package com.example.featherpos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Feather extends Application {
    public Statement statement;
    @Override
    public void start(Stage stage) throws IOException, ClassNotFoundException {
        try {
            initializeDB();
            FXMLLoader fxmlLoader = new FXMLLoader(Feather.class.getResource("/com.example.featherpos/FeatherPOS.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 700, 500);
            stage.setTitle("Feather (Light Weight Point of Sale)");
            stage.setScene(scene);
            stage.show();

            FeatherController controller = fxmlLoader.getController();


        }
        catch (ClassNotFoundException ex){ex.printStackTrace();}
    }

    public void initializeDB() throws ClassNotFoundException {
        try {
            //load jdbc driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //establish a connection
            Connection connection = DriverManager.getConnection
                ("jdbc:mysql://localhost/FeatherPOS", "root", "");
            System.out.println("database connected");
            //prep statement
            statement = connection.createStatement();
        }
        catch (SQLException ex) {ex.printStackTrace();}
    }

    public static void main(String[] args) {
        launch();
    }
} //end initializeDB