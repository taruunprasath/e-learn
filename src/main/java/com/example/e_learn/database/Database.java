package com.example.e_learn.database;

import com.example.e_learn.entitiy.Login;
import com.example.e_learn.entitiy.Table;
import com.example.e_learn.entitiy.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/javafx";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Mysql@1234";

    public static void insertUser(String name, String user_type, String course) {
        String sql = "INSERT INTO user (name, user_type, course) VALUES (?, ?, ?)";


        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, user_type);
            preparedStatement.setString(3, course);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions appropriately in your application
        }
    }

    public static void deleteUser(String name, String user_type, String course) {
        String sql = "DELETE FROM user WHERE name=? and user_type=? and course=?";


        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, user_type);
            preparedStatement.setString(3, course);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions appropriately in your application
        }
    }

    public static List<User> getAllUsers() {
        String sql = "SELECT * FROM user";
        List<User> users = new ArrayList<>();


        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            ResultSet result = preparedStatement.executeQuery();

            while (result.next()) {
                users.add(
                        new User(result.getString("name"),
                                result.getString("user_type"),
                                result.getString("course")
                        )
                );
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions appropriately in your application
        }
        return users;
    }

    public static List<Table> getAllTable() {
        String sql1 = "SELECT * FROM report";
        List<Table> table = new ArrayList<>();


        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql1)) {
            ResultSet result1 = preparedStatement.executeQuery();

            while (result1.next()) {
                table.add(
                        new Table(result1.getString("name"),
                                result1.getString("course"),
                                result1.getString("grade")
                        )
                );
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions appropriately in your application
        }


        return table;
    }

    public static Login getByUsername(String username) {
        String sql3 = "SELECT * FROM login WHERE username=?";


        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql3)) {

            preparedStatement.setString(1, username);
            ResultSet resultSet3= preparedStatement.executeQuery();

            if(resultSet3.next()){
                return new Login(resultSet3.getString("username"),
                resultSet3.getString("password"));
            }

        }
        catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions appropriately in your application
        }
        return null;
    }

    public static void insertValue(String username,String password) {
        String sql4 = "INSERT INTO login (username,password) VALUES (?,?)";


        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql4)) {

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions appropriately in your application
        }
    }


}







