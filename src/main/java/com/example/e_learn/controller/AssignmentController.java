package com.example.e_learn.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static com.example.e_learn.HelloApplication.reroute;

public class AssignmentController {

    @FXML
    private Button back3;

    @FXML
    private Button go1;

    @FXML
    private Button go2;

    @FXML
    private Button go3;

    @FXML
    void add1(ActionEvent event1) {
        System.out.println("Assignment1 Entered Successfully");

    }

    @FXML
    void add2(ActionEvent event2) {
        System.out.println("Assignment2 Entered Successfully");

    }

    @FXML
    void add3(ActionEvent event3) {
        System.out.println("Assignment3 Entered Successfully");

    }

    @FXML
    void back(ActionEvent event4) {
        reroute(event4,"homepage.fxml","Home");

    }

}
