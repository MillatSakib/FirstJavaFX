package com.fxlearning.sm.fristjavafxapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        Label text = new Label("Hello Baby, How are you?");
        Button button = new Button("Click Me!");
        button.setOnAction(e->text.setText("Welcome to JavaFX Application!"));
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20,20,20,20));
        root.setSpacing(20);
        root.getChildren().addAll(text, button);
        Scene scene = new Scene(root, 350,300);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}