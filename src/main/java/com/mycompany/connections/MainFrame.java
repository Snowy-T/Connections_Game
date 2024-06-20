/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.connections;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 *
 * @author Waleed Muhammad
 */
public class MainFrame extends JFrame implements ActionListener, KeyListener {

    LoginPanel loginPanel;
    GamePanel gamePanel;
    User user;
    UserLogin userLogin;
    ImageIcon imageIcon;

    String username;

    public MainFrame(){
        this.setTitle("Connections");
        this.setSize(1016, 700);
        imageIcon = new ImageIcon("logo.png");
        this.setIconImage(imageIcon.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        loginPanel = new LoginPanel();
        loginPanel.setBounds(0, 0, 1016, 700);
        this.add(loginPanel);

        gamePanel = new GamePanel(username);
        gamePanel.setBounds(0, 0, 1016, 700);
        this.add(gamePanel);
        gamePanel.setVisible(false);

        loginPanel.btn_login.addActionListener(this);
        loginPanel.btn_login.addKeyListener(this);
        loginPanel.txt_username.addKeyListener(this);
        loginPanel.txt_password.addKeyListener(this);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loginPanel.btn_login){
            if(loginPanel.txt_username.getText().equals("") || loginPanel.txt_password.getText().equals("")){
                System.out.println("Please fill all fields!");
            }else{
                String username = loginPanel.txt_username.getText().trim();
                String pass = "";

                for(char c : loginPanel.txt_password.getPassword()){
                    pass += c;
                }

                user = new User(username, pass);
                userLogin = new UserLogin(user);

                this.username = user.getNickname();

                gamePanel.setUsername(username);

                gamePanel.setVisible(false);

                if(userLogin.loginUser()){
                    System.out.println("Login successful!");
                    loginPanel.setVisible(false);
                    gamePanel.setVisible(true);

                    loginPanel.txt_username.setText("");
                    loginPanel.txt_password.setText("");
                }else{
                    System.out.println("User doesn't exit or invalid input!");
                }
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            if(loginPanel.txt_username.getText().equals("") || loginPanel.txt_password.getText().equals("")){
                System.out.println("Please fill all fields!");
            }else{
                String username = loginPanel.txt_username.getText().trim();
                String pass = "";
                for(char c : loginPanel.txt_password.getPassword()){
                    pass += c;
                }

                user = new User(username, pass);
                userLogin = new UserLogin(user);

                this.username = user.getNickname();

                gamePanel.setUsername(username);

                gamePanel.setVisible(false);

                if(userLogin.loginUser()){
                    System.out.println("Login successful!");
                    loginPanel.setVisible(false);
                    gamePanel.setVisible(true);

                    loginPanel.txt_username.setText("");
                    loginPanel.txt_password.setText("");
                }else{
                    System.out.println("User doesn't exit or invalid input!");
                }
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
