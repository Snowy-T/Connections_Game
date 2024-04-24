package com.mycompany.connections;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserLogin {

    private User user;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    public UserLogin(User user){
        this.user = user;
        loginUser();
    }

    public boolean loginUser(){
        String username = user.getNickname();
        String pass = user.getPsw();

        try{
            preparedStatement = SingeltonConnection.getInstanz().getConnection().prepareStatement("SELECT * FROM userdata WHERE username = ? AND password = ?");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, pass);

            resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                System.out.println(user.getNickname() + " has been logged in successfully!");
                return true;
            }else{
                System.out.println("Invalid username or password!");
            }
        }catch(Exception e){
            e.printStackTrace();
    }
        return false;
    }
}
