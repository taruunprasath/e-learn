module com.example.e_learn {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.e_learn to javafx.fxml;
    exports com.example.e_learn;
    exports com.example.e_learn.controller;
    opens com.example.e_learn.controller to javafx.fxml;
}