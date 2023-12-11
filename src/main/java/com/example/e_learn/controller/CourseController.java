package com.example.e_learn.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import static com.example.e_learn.HelloApplication.reroute;

public class CourseController {

    @FXML
    private Button buy1;

    @FXML
    private Button buy2;

    @FXML
    private Button buy3;

    @FXML
    private Button buy4;

    @FXML
    private Button buy5;

    @FXML
    private Button buy6;

    @FXML
    void add1(ActionEvent event) {
        System.out.println("Course1 Added");

    }

    @FXML
    void add2(ActionEvent event) {
        System.out.println("Course2 Added");

    }

    @FXML
    void add3(ActionEvent event) {
        System.out.println("Course3 Added");

    }

    @FXML
    void add4(ActionEvent event) {
        System.out.println("Course4 Added");

    }

    @FXML
    void add5(ActionEvent event) {
        System.out.println("Course5 Added");

    }

    @FXML
    void add6(ActionEvent event) {
        System.out.println("Course6 Added");

    }
    @FXML
    void back(ActionEvent event) {
        reroute(event,"homepage.fxml","Home");

    }

}
