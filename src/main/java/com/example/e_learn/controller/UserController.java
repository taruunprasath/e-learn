package com.example.e_learn.controller;

import com.example.e_learn.database.Database;
import com.example.e_learn.entitiy.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.util.List;

import static com.example.e_learn.HelloApplication.reroute;

public class UserController {

    @FXML
    private TableColumn<User, String> CourseColumn;

    @FXML
    private TableColumn<User, String> NameColumn;

    @FXML
    private TableColumn<User, String> UserColumn;


    @FXML
    private Button back1;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDelete;

    @FXML
    private TextField course;

    @FXML
    private TextField name;

    @FXML
    private TableView<User> table;

    @FXML
    private TextField usertype;

    @FXML
    void Add(ActionEvent event) {
        String name = this.name.getText();
        String usertype = this.usertype.getText();
        String course = this.course.getText();
        Database.insertUser(name, usertype, course);
        initialize();

    }

    @FXML
    void Delete(ActionEvent event) {
        String name = this.name.getText();
        String usertype = this.usertype.getText();
        String course = this.course.getText();
        Database.deleteUser(name, usertype, course);
        initialize();

    }

    @FXML
    void back(ActionEvent event) {
        reroute(event,"homepage.fxml","Home");

    }

    public void initialize() {
        List<User> userList = Database.getAllUsers();

        ObservableList<User> observableList = FXCollections.observableArrayList(userList);

        NameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        UserColumn.setCellValueFactory(cellData -> cellData.getValue().userTypeProperty());
        CourseColumn.setCellValueFactory(cellData -> cellData.getValue().courseProperty());

        table.setItems(observableList);


    }

}
