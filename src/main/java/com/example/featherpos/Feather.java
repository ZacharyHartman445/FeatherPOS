package com.example.featherpos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Feather extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Feather.class.getResource("FeatherPOS.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
        stage.setTitle("Feather (Light Weight Point of Sale)");
        stage.setScene(scene);
        stage.show();

        FeatherController controller = fxmlLoader.getController();
    }

    public void addMenuItem() {

    }

    public void addItem() {

    }

    public static void main(String[] args) {
        launch();
    }
}