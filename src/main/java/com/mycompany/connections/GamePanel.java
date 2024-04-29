/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.connections;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.AbstractBorder;

/**
 *
 * @author Waleed Muhammad
 */
public class GamePanel extends JPanel implements ActionListener{

    JToggleButton btn_word11, btn_word12, btn_word13, btn_word14, btn_word21, btn_word22, btn_word23, btn_word24, btn_word31, btn_word32, btn_word33, btn_word34, btn_word41, btn_word42, btn_word43, btn_word44;
    JButton btn_submit, btn_deselect, btn_shuffle;
    JLabel lbl_info, lbl_remainingTries;
    ArrayList<JToggleButton> btnList = new ArrayList<JToggleButton>();
    GetWordsWithCategory getWordsWithCategory = new GetWordsWithCategory();
    Random random = new Random();

    String word11 = "test", word12, word13, word14, word21, word22, word23, word24, word31, word32, word33, word34, word41, word42, word43, word44;
    int remainingTries = 4;
    int buttonCounter = 0;

    public GamePanel(){
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        lbl_info = new JLabel("Create four groups of four!");
        lbl_info.setFont(new Font("Sanserif", Font.PLAIN, 16));
        lbl_info.setBounds(399, 22, 202, 22);
        this.add(lbl_info);

        btn_word11 = new JToggleButton();
        btn_word11.setUI(new CustomToggleButtonUI(new Color(0x5a594e), new Color(0xefefe6)));
        btn_word11.setFont(new Font("Sanserif", Font.BOLD, 20));
        btn_word11.setBounds(185, 70, 150, 80);
        btn_word11.setBorder(new RoundBorder(16));
        this.add(btn_word11);

        btn_word12 = new JToggleButton();
        btn_word12.setUI(new CustomToggleButtonUI(new Color(0x5a594e), new Color(0xefefe6)));
        btn_word12.setFont(new Font("Sanserif", Font.BOLD, 20));
        btn_word12.setBounds(345, 70, 150, 80);
        btn_word12.setBorder(new RoundBorder(16));
        this.add(btn_word12);

        btn_word13 = new JToggleButton(word13);
        btn_word13.setFont(new Font("Sanserif", Font.BOLD, 20));
        btn_word13.setBounds(505, 70, 150, 80);
        btn_word13.setBorder(new RoundBorder(16));
        this.add(btn_word13);

        btn_word14 = new JToggleButton(word14);
        btn_word14.setFont(new Font("Sanserif", Font.BOLD, 20));
        btn_word14.setBounds(665, 70, 150, 80);
        btn_word14.setBackground(new Color(0xefefe6));
        btn_word14.setBorder(new RoundBorder(16));
        this.add(btn_word14);

        btn_word21 = new JToggleButton(word21);
        btn_word21.setFont(new Font("Sanserif", Font.BOLD, 20));
        btn_word21.setBounds(185, 160, 150, 80);
        btn_word21.setBackground(new Color(0xefefe6));
        btn_word21.setBorder(new RoundBorder(16));
        this.add(btn_word21);

        btn_word22 = new JToggleButton(word22);
        btn_word22.setFont(new Font("Sanserif", Font.BOLD, 20));
        btn_word22.setBounds(345, 160, 150, 80);
        btn_word22.setBackground(new Color(0xefefe6));
        btn_word22.setBorder(new RoundBorder(16));
        this.add(btn_word22);

        btn_word23 = new JToggleButton(word23);
        btn_word23.setFont(new Font("Sanserif", Font.BOLD, 20));
        btn_word23.setBounds(505, 160, 150, 80);
        btn_word23.setBackground(new Color(0xefefe6));
        btn_word23.setBorder(new RoundBorder(16));
        this.add(btn_word23);

        btn_word24 = new JToggleButton(word24);
        btn_word24.setFont(new Font("Sanserif", Font.BOLD, 20));
        btn_word24.setBounds(665, 160, 150, 80);
        btn_word24.setBackground(new Color(0xefefe6));
        btn_word24.setBorder(new RoundBorder(16));
        this.add(btn_word24);

        btn_word31 = new JToggleButton(word31);
        btn_word31.setFont(new Font("Sanserif", Font.BOLD, 20));
        btn_word31.setBounds(185, 250, 150, 80);
        btn_word31.setBackground(new Color(0xefefe6));
        btn_word31.setBorder(new RoundBorder(16));
        this.add(btn_word31);

        btn_word32 = new JToggleButton();
        btn_word32.setUI(new CustomToggleButtonUI(new Color(0x5a594e), new Color(0xefefe6)));
        btn_word32.setFont(new Font("Sanserif", Font.BOLD, 20));
        btn_word32.setBounds(345, 250, 150, 80);
        btn_word32.setBorder(new RoundBorder(16));
        this.add(btn_word32);

        btn_word33 = new JToggleButton();
        btn_word33.setUI(new CustomToggleButtonUI(new Color(0x5a594e), new Color(0xefefe6)));
        btn_word33.setFont(new Font("Sanserif", Font.BOLD, 20));
        btn_word33.setBounds(505, 250, 150, 80);
        btn_word33.setBorder(new RoundBorder(16));
        this.add(btn_word33);

        btn_word34 = new JToggleButton();
        btn_word34.setUI(new CustomToggleButtonUI(new Color(0x5a594e), new Color(0xefefe6)));
        btn_word34.setFont(new Font("Sanserif", Font.BOLD, 20));
        btn_word34.setBounds(665, 250, 150, 80);
        btn_word34.setBorder(new RoundBorder(16));
        this.add(btn_word34);

        btn_word41 = new JToggleButton();
        btn_word41.setUI(new CustomToggleButtonUI(new Color(0x5a594e), new Color(0xefefe6)));
        btn_word41.setFont(new Font("Sanserif", Font.BOLD, 20));
        btn_word41.setBounds(185, 340, 150, 80);
        btn_word41.setBackground(new Color(0xefefe6));
        btn_word41.setBorder(new RoundBorder(16));
        this.add(btn_word41);

        btn_word42 = new JToggleButton();
        btn_word42.setUI(new CustomToggleButtonUI(new Color(0x5a594e), new Color(0xefefe6)));
        btn_word42.setFont(new Font("Sanserif", Font.BOLD, 20));
        btn_word42.setBounds(345, 340, 150, 80);
        btn_word42.setBorder(new RoundBorder(16));
        this.add(btn_word42);

        btn_word43 = new JToggleButton();
        btn_word43.setUI(new CustomToggleButtonUI(new Color(0x5a594e), new Color(0xefefe6)));
        btn_word43.setFont(new Font("Sanserif", Font.BOLD, 20));
        btn_word43.setBounds(505, 340, 150, 80);
        btn_word43.setBorder(new RoundBorder(16));
        this.add(btn_word43);

        btn_word44 = new JToggleButton();
        btn_word44.setUI(new CustomToggleButtonUI(new Color(0x5a594e), new Color(0xefefe6)));
        btn_word44.setFont(new Font("Sanserif", Font.BOLD, 20));
        btn_word44.setBounds(665, 340, 150, 80);
        btn_word44.setBorder(new RoundBorder(16));
        this.add(btn_word44);

        lbl_remainingTries = new JLabel("Remaining Tries: " + remainingTries);
        lbl_remainingTries.setFont(new Font("Sanserif", Font.PLAIN, 14));
        lbl_remainingTries.setBounds(441, 446, 200, 20);
        this.add(lbl_remainingTries);

        btn_shuffle = new JButton("Shuffle");
        btn_shuffle.setFont(new Font("Sanserif", Font.BOLD, 16));
        btn_shuffle.setBounds(265, 496, 150, 40);
        btn_shuffle.setBackground(Color.WHITE);
        btn_shuffle.setBorder(new RoundBorder(40));
        this.add(btn_shuffle);

        btn_deselect = new JButton("Deselect");
        btn_deselect.setFont(new Font("Sanserif", Font.BOLD, 16));
        btn_deselect.setBounds(425, 496, 150, 40);
        btn_deselect.setBackground(Color.WHITE);
        btn_deselect.setBorder(new RoundBorder(40));
        this.add(btn_deselect);

        btn_submit = new JButton("Submit");
        btn_submit.setFont(new Font("Sanserif", Font.BOLD, 16));
        btn_submit.setBounds(585, 496, 150, 40);
        btn_submit.setBackground(Color.WHITE);
        btn_submit.setBorder(new RoundBorder(40));
        this.add(btn_submit);

        btnList.addAll(Arrays.asList(btn_word11, btn_word12, btn_word13, btn_word14, btn_word21, btn_word22, btn_word23, btn_word24, btn_word31, btn_word32, btn_word33, btn_word34, btn_word41, btn_word42, btn_word43, btn_word44));
        assignWordToBtn(getWordsWithCategory.getAllWords());

        btn_word11.addActionListener(this);
        btn_word12.addActionListener(this);
        btn_word13.addActionListener(this);
        btn_word14.addActionListener(this);
        btn_word21.addActionListener(this);
        btn_word22.addActionListener(this);
        btn_word23.addActionListener(this);
        btn_word24.addActionListener(this);
        btn_word31.addActionListener(this);
        btn_word32.addActionListener(this);
        btn_word33.addActionListener(this);
        btn_word34.addActionListener(this);
        btn_word41.addActionListener(this);
        btn_word42.addActionListener(this);
        btn_word43.addActionListener(this);
        btn_word44.addActionListener(this);
        btn_shuffle.addActionListener(this);
        btn_deselect.addActionListener(this);
        btn_submit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btn_word11){
            lowerOrHigherBtnCounter(btn_word11);

            if(buttonCounter > 4){
                btn_word11.setSelected(false);
                btn_word11.setEnabled(false);
            }
        }//end of if btn_word11

        if(e.getSource() == btn_word12){
            lowerOrHigherBtnCounter(btn_word12);

            if(buttonCounter > 4){
                btn_word12.setSelected(false);
                btn_word12.setEnabled(false);
            }
        }//end of if btn_word12

        if(e.getSource() == btn_word13){
            lowerOrHigherBtnCounter(btn_word13);

            if(buttonCounter > 4){
                btn_word13.setSelected(false);
                btn_word13.setEnabled(false);
            }
        }//end of if btn_word13

        if(e.getSource() == btn_word14){
            lowerOrHigherBtnCounter(btn_word14);

            if(buttonCounter > 4){
                btn_word14.setSelected(false);
                btn_word14.setEnabled(false);
            }
        }//end of if btn_word14

        if(e.getSource() == btn_word21){
            lowerOrHigherBtnCounter(btn_word21);

            if(buttonCounter > 4){
                btn_word21.setSelected(false);
                btn_word21.setEnabled(false);
            }
        }//end of if btn_word21

        if(e.getSource() == btn_word22){
            lowerOrHigherBtnCounter(btn_word22);

            if(buttonCounter > 4){
                btn_word22.setSelected(false);
                btn_word22.setEnabled(false);
            }
        }//end of if btn_word22

        if(e.getSource() == btn_word23){
            lowerOrHigherBtnCounter(btn_word23);

            if(buttonCounter > 4){
                btn_word23.setSelected(false);
                btn_word23.setEnabled(false);
            }
        }//end of if btn_word23

        if(e.getSource() == btn_word24){
            lowerOrHigherBtnCounter(btn_word24);

            if(buttonCounter > 4){
                btn_word24.setSelected(false);
                btn_word24.setEnabled(false);
            }
        }//end of if btn_word24

        if(e.getSource() == btn_word31){
            lowerOrHigherBtnCounter(btn_word31);

            if(buttonCounter > 4){
                btn_word31.setSelected(false);
                btn_word31.setEnabled(false);
            }
        }//end of if btn_word31

        if(e.getSource() == btn_word32){
            lowerOrHigherBtnCounter(btn_word32);

            if(buttonCounter > 4){
                btn_word32.setSelected(false);
                btn_word32.setEnabled(false);
            }
        }//end of if btn_word32

        if(e.getSource() == btn_word33){
            lowerOrHigherBtnCounter(btn_word33);

            if(buttonCounter > 4){
                btn_word33.setSelected(false);
                btn_word33.setEnabled(false);
            }
        }//end of if btn_word33

        if(e.getSource() == btn_word34){
            lowerOrHigherBtnCounter(btn_word34);

            if(buttonCounter > 4){
                btn_word34.setSelected(false);
                btn_word34.setEnabled(false);
            }
        }//end of if btn_word34

        if(e.getSource() == btn_word41){
            lowerOrHigherBtnCounter(btn_word41);

            if(buttonCounter > 4){
                btn_word41.setSelected(false);
                btn_word41.setEnabled(false);
            }
        }//end of if btn_word41

        if(e.getSource() == btn_word42){
            lowerOrHigherBtnCounter(btn_word42);

            if(buttonCounter > 4){
                btn_word42.setSelected(false);
                btn_word42.setEnabled(false);
            }
        }//end of if btn_word42

        if(e.getSource() == btn_word43){
            lowerOrHigherBtnCounter(btn_word43);

            if(buttonCounter > 4){
                btn_word43.setSelected(false);
                btn_word43.setEnabled(false);
            }
        }//end of if btn_word43

        if(e.getSource() == btn_word44){
            lowerOrHigherBtnCounter(btn_word44);

            if(buttonCounter > 4){
                btn_word44.setSelected(false);
                btn_word44.setEnabled(false);
            }
        }//end of if btn_word44

        if(e.getSource() == btn_shuffle){
            shuffleWords();
        }//end of if btn_shuffle

        if(e.getSource() == btn_deselect){
            buttonCounter = 0;
            unsetAllButtons();
        }//end of if btn_deselect

        //TODO: Implement the logic for the game
        if(e.getSource() == btn_submit){
            if(remainingTries <= 0){
                remainingTries = 0;
            }else {
                remainingTries--;
            }
            lbl_remainingTries.setText("Remaining Tries: " + remainingTries);
        }//end of if btn_submit

        if(buttonCounter > 4){
            buttonCounter = 4;
        }else if(buttonCounter < 0){
            buttonCounter = 0;
        }//end of if(buttonCounter)
    }

    public void assignWordToBtn(ArrayList<Word> words){
        ArrayList<String> listOfWords = new ArrayList<String>();

        for(Word word : words){
            listOfWords.add(word.getValue());
        }

        int randomIndex = random.nextInt(listOfWords.size());
        String word = listOfWords.get(randomIndex);

        for(JToggleButton button : btnList){

            for(int i = 0; i < btnList.size(); i++) {
                String tempWord = btnList.get(i).getText().trim();
                if(tempWord.equalsIgnoreCase(word)){
                    while(tempWord.equalsIgnoreCase(word)){
                        randomIndex = random.nextInt(listOfWords.size());
                        word = listOfWords.get(randomIndex);
                    }
                    i=-1;
                }
            }
            button.setText(word);
            randomIndex = random.nextInt(words.size());
            word = listOfWords.get(randomIndex);
        }

    }//end of assignWordToBtn

    public void shuffleWords(){
        ArrayList<String> listOfWords = new ArrayList<String>();

        for(JToggleButton button : btnList){
            listOfWords.add(button.getText());
        }

        for(JToggleButton button : btnList){
            int randomIndex = random.nextInt(listOfWords.size());
            String word = listOfWords.get(randomIndex);
            button.setText(word);
            listOfWords.remove(randomIndex);
        }
    }

    public void lowerOrHigherBtnCounter(JToggleButton button){
        if(button.isSelected()){
            buttonCounter++;
        }else{
            buttonCounter--;
            makeUnSelectedBtnsSelectable();
        }
    }

    public void makeUnSelectedBtnsSelectable(){
        for(JToggleButton button : btnList){
            if(!button.isSelected()){
                button.setEnabled(true);
            }
        }
    }

    public void unsetAllButtons(){
        for(JToggleButton button : btnList){
            button.setSelected(false);
            button.setEnabled(true);
        }
    }

    static class RoundBorder extends AbstractBorder {
        private int radius;

        public RoundBorder(int radius) {
            this.radius = radius;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setColor(c.getForeground());
            g2d.draw(new RoundRectangle2D.Double(x, y, width - 1, height - 1, radius, radius));
            g2d.dispose();
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius, this.radius, this.radius, this.radius);
        }

        @Override
        public Insets getBorderInsets(Component c, Insets insets) {
            insets.left = insets.top = insets.right = insets.bottom = this.radius;
            return insets;
        }
    }
}


