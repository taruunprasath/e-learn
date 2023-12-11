package com.example.e_learn.entitiy;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Table {
    String name;
    String course;
    String grade;

    public Table(String name, String course, String grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public StringProperty nameProperty() {
        return new SimpleStringProperty((name));
    }

    public StringProperty gradeProperty() {
        return new SimpleStringProperty((grade));
    }

    public StringProperty courseProperty() {
        return new SimpleStringProperty((course));
    }
}

