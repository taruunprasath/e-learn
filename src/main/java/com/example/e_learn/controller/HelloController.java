package com.example.e_learn.controller;

import com.example.e_learn.database.Database;
import com.example.e_learn.entitiy.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.Objects;

import static com.example.e_learn.HelloApplication.reroute;

public class HelloController {

    @FXML
    private PasswordField passText;

    @FXML
    private TextField userText;


    @FXML
    private Hyperlink sign1;

    @FXML
    void login(ActionEvent event) {
        String username = userText.getText().toString();
        String password = passText.getText().toString();
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        if(isValidLogin(username,password)){
            reroute(event,"homepage.fxml","Home");
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Invalid Login");
        }

    }

    private boolean isValidLogin(String username,String password){
        return Objects.equals(Database.getByUsername(username), new Login(username,password));
    }

    @FXML
    void sign(ActionEvent event) {

        reroute(event,"signup.fxml","Signup");

    }

}
