package com.mycompany.connections;

import java.sql.Statement;

public class UserRegister {

    private User user;
    Statement statement;

    public UserRegister(User user) {
        this.user = user;
        registerUser();
    }

    public void registerUser() {
        try {
            statement = SingeltonConnection.getInstanz().getConnection().createStatement();
            statement.executeUpdate("INSERT INTO userdata (username, password) VALUES ('" + user.getUsername() + "', '" + user.getPassword() + "')");

            System.out.println(user + " has been registered successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
