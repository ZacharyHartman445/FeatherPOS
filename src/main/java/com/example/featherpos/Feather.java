package com.example.featherpos;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
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
                //initializeDB();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource
                        ("/FeatherPOS.fxml"));
                //Parent fxmlLoader = FXMLLoader.load(getClass().getResource
                //        ("/FeatherPOS.fxml"));
                //Scene scene = new Scene(fxmlLoader, 700, 500);
                Scene scene = new Scene(fxmlLoader.load());
                FeatherController controller = fxmlLoader.getController();
                stage.setTitle("Feather (Light Weight Point of Sale)");
                stage.setScene(scene);
                stage.show();


            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    public void initializeDB() throws ClassNotFoundException {
        try {
            //load jdbc driver
            Class.forName("com.mysql.jdbc.Driver");

            //establish a connection
            Connection connection = DriverManager.getConnection
                    //("jdbc:mysql://http://localhost:8080/phpmyadmin/index.php?route=/database/structure&server=1&db=FeatherPOS");
                ("jdbc:mysql://localhost/FeatherPOS");
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