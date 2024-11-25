package com.example;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;

public class AppController {

    @FXML
    private JFXButton stylishButton1;

    @FXML
    private JFXButton stylishButton2;

    @FXML
    public void initialize() {
        stylishButton1.setOnAction(event -> System.out.println("Stylish Button 1 Clicked!"));
        stylishButton2.setOnAction(event -> System.out.println("Stylish Button 2 Clicked!"));
    }
}
