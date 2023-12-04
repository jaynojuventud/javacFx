package com.example.demo_fx_1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label welcomeTextBox;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hi, Welcome to JavaFX Application!");
    }

}