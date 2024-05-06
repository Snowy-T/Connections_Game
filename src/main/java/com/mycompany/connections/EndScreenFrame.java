package com.mycompany.connections;

import javax.swing.*;

public class EndScreenFrame extends JFrame{

    EndScreenPanel endpanel;

    public EndScreenFrame(String username){

        this.setSize(350, 400);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        endpanel = new EndScreenPanel(username);

        System.out.println("EndScreenFrame: " + username);
        endpanel.setBounds(0, 0, 350, 400);
        this.add(endpanel);
        this.setVisible(true);
    }

}
