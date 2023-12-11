package com.example.e_learn.entitiy;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class User {
    String name;
    String userType;
    String course;
    public User(String name,String userType,String course)
    {
        this.name=name;
        this.userType=userType;
        this.course=course;
    }

    public StringProperty nameProperty() {return new SimpleStringProperty((name));
    }
    public StringProperty userTypeProperty() {return new SimpleStringProperty((userType));}
    public StringProperty courseProperty() {return new SimpleStringProperty((course));}




}
