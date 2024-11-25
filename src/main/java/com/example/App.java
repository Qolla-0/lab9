package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello JavaFX with Maven!");

        Button btnHello = new Button();
        btnHello.setText("Say 'Hello World'");
        btnHello.setOnAction(event -> System.out.println("Hello World!"));

        TextField textField = new TextField();
        textField.setPromptText("Enter your text here");

        Button btnDisplayText = new Button();
        btnDisplayText.setText("Display Text");
        btnDisplayText.setOnAction(event -> {
            String inputText = textField.getText();
            System.out.println("Entered Text: " + inputText);
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(btnHello, textField, btnDisplayText);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
