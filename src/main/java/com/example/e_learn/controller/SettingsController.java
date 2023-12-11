package com.example.e_learn.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static com.example.e_learn.HelloApplication.reroute;

public class SettingsController {

    @FXML
    private Button back4;

    @FXML
    void back(ActionEvent event) {
        reroute(event,"homepage.fxml","Home");

    }

}
