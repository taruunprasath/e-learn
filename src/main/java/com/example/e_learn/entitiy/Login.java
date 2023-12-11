package com.example.e_learn.entitiy;

import java.util.Objects;

public class Login {
    String username;
    String password;

    public Login(String username,String password){
        this.username=username;
        this.password=password;

    }
    @Override
    public boolean equals(Object o){
        if(this == o)
        {
            return true;
        }
        if(o == null || getClass() != o.getClass()){
            return false;
        }
        Login login = (Login) o;

        return Objects.equals(username,login.username)&&
        Objects.equals(password, login.password);
    }
    @Override
    public int hashCode(){ return Objects.hash(username,password);}

}
