package com.example.e_learn.controller;

import com.example.e_learn.database.Database;
import com.example.e_learn.entitiy.Table;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.List;

import static com.example.e_learn.HelloApplication.reroute;

public class ReportsController {

    @FXML
    private Button back3;

    @FXML
    private TableColumn<Table, String> course;

    @FXML
    private TableColumn<Table, String> grade;

    @FXML
    private TableColumn<Table, String> name;

    @FXML
    private TableView<Table> table2;

    @FXML
    void back(ActionEvent event) {

        reroute(event, "homepage.fxml", "Home");

    }

    public void initialize() {
        List<Table> tableList = Database.getAllTable();

        ObservableList<Table> observableList = FXCollections.observableArrayList(tableList);

        name.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        course.setCellValueFactory(cellData -> cellData.getValue().courseProperty());
        grade.setCellValueFactory(cellData -> cellData.getValue().gradeProperty());

        table2.setItems(observableList);

    }
}
