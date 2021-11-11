package com.example.featherpos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Login extends Application {
    //login screen when you select "Admin" tab
    @Override
    public void start(Stage stage) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Feather.class.getResource("Login.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.setTitle("Admin login");
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception ex ){ex.printStackTrace();}
    }

    public static void main(String[] args) {
        launch(args);
    }

}
