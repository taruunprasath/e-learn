package com.example.e_learn.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


import static com.example.e_learn.HelloApplication.reroute;

public class HomepageController {
    @FXML
    private Button assignment;

    @FXML
    private Button course;

    @FXML
    private Button settings;

    @FXML
    private Button user;

    @FXML
    private Button reports;

    @FXML
    private Button exit;

    public HomepageController() {
    }

    @FXML
    void Assignment(ActionEvent event5) {
        reroute(event5,"assignment.fxml","Assignment");

    }

    @FXML
    void Course(ActionEvent event4) {
        reroute(event4, "course.fxml", "Course");

    }

    @FXML
    void Settings(ActionEvent event2) {
        reroute(event2,"settings.fxml","Settings");

    }

    @FXML
    void User(ActionEvent event1) {
        reroute(event1,"user.fxml","User'");

    }
    @FXML
    void report(ActionEvent event) {
        reroute(event,"reports.fxml","Reports");

    }

    @FXML
    void exit(ActionEvent event) {
        reroute(event,"hello-view.fxml","E-learn");
    }
}
