package com.mycompany.connections;

import java.sql.PreparedStatement;
import java.sql.Statement;

public class UserRegister {

    private User user;
    PreparedStatement preparedStatement;

    public UserRegister(User user) {
        this.user = user;
        registerUser();
    }

    public void registerUser() {
        try {
            String sql = "INSERT INTO userdata VALUES (?,?)";

            preparedStatement = SingeltonConnection.getInstanz().getConnection().prepareStatement(sql);

            preparedStatement.setString(1,user.getNickname());
            preparedStatement.setString(2,user.getPsw());

            preparedStatement.executeQuery();

            System.out.println(user.getNickname() + " has been registered successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
