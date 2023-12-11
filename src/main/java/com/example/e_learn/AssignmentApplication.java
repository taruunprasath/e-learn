package com.example.e_learn;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AssignmentApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("assignment.fxml"));
        fxmlLoader.setController(new AssignmentApplication()); // Set the controller instance
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Assignment");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
