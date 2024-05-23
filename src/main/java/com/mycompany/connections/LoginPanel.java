/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.connections;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 *
 * @author Waleed Muhammad
 */
public class LoginPanel extends JPanel implements ActionListener {

    JLabel lbl_username, lbl_password;
    JTextField txt_username;
    JPasswordField txt_password;
    JButton btn_register,btn_login;
    UserRegister userRegister;
    User user;

    public LoginPanel(){
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        lbl_username = new JLabel("Username");
        lbl_username.setFont(new Font("Sanserif", 0, 30));
        lbl_username.setBounds(377, 250, 202, 35);
        this.add(lbl_username);

        txt_username = new JTextField();
        txt_username.setFont(new Font("Sanserif", 0, 30));
        txt_username.setBounds(377, 285, 250, 35);
        this.add(txt_username);

        lbl_password = new JLabel("Password");
        lbl_password.setFont(new Font("Sanserif", 0, 30));
        lbl_password.setBounds(377, 340, 202, 35);
        this.add(lbl_password);

        txt_password = new JPasswordField();
        txt_password.setFont(new Font("Sanserif", 0, 30));
        txt_password.setBounds(377, 375, 250, 35);
        this.add(txt_password);

        btn_register = new JButton("Register");
        btn_register.setFont(new Font("Sanserif", 0, 30));
        btn_register.setBounds(637, 450, 200, 35);
        this.add(btn_register);

        btn_login = new JButton("Login");
        btn_login.setFont(new Font("Sanserif", 0, 30));
        btn_login.setBounds(637, 495, 200, 35);
        this.add(btn_login);

        btn_register.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn_register){
            if(txt_username.getText().equals("") || txt_password.getText().equals("")){
                System.out.println("Please fill all fields!");
            }else{
                String username = txt_username.getText().trim();
                String pass = "";

                for(char c : txt_password.getPassword()){
                    pass += c;
                }

                user = new User(username, pass);
                userRegister = new UserRegister(user);

                txt_username.setText("");
                txt_password.setText("");
            }
        }

    }
}
