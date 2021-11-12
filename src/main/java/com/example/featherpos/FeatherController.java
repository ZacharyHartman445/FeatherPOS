package com.example.featherpos;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FeatherController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void getController(){

    }
}