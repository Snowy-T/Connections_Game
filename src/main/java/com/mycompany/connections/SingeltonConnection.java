/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Waleed Muhammad
 */
public class SingeltonConnection {
    
    String url = "jdbc:postgresql://localhost:5432/connections";
    String user = "postgres";
    String psw = "admin";
    
    private Connection connection;
    private static SingeltonConnection datenbankInstanz;
    
    private SingeltonConnection() throws SQLException{
        this.connection = DriverManager.getConnection(url, user, psw);
    }
    
    public static SingeltonConnection getInstanz() throws SQLException{
        if(datenbankInstanz == null || datenbankInstanz.getConnection().isClosed()){
            datenbankInstanz = new SingeltonConnection();
        }
        return datenbankInstanz;
    }

    public Connection getConnection() {
        return connection;
    }
    
}
