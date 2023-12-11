package com.example.e_learn.controller;

import com.example.e_learn.database.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import static com.example.e_learn.HelloApplication.reroute;


public class SignupController {

        @FXML
        private PasswordField passText1;

        @FXML
        private Button signup;

        @FXML
        private TextField userText1;

        @FXML
        private Hyperlink login;

        @FXML
        void signin(ActionEvent event) {

            System.out.println("Username added successfully");
            System.out.println("Password added successfully");
            String username= userText1.getText();
            String password= passText1.getText();
            Database.insertValue(username,password);
        }

            @FXML
            void log(ActionEvent event) {
            reroute(event,"hello-view.fxml","E-learn");

            }

    }

