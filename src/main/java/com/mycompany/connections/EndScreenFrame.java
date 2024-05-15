package com.mycompany.connections;

import javax.swing.*;
import java.util.ArrayList;

public class EndScreenFrame extends JFrame{

    EndScreenPanel endpanel;

    public EndScreenFrame(String username, boolean isWon, ArrayList<JToggleButton> orderedBtn, ArrayList<Word> words){

        this.setSize(350, 400);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        endpanel = new EndScreenPanel(username, isWon, orderedBtn, words);

        endpanel.setBounds(0, 0, 350, 400);
        this.add(endpanel);
        this.setVisible(true);
    }

}
