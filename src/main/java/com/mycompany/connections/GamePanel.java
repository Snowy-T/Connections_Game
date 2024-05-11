/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.connections;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.sql.SQLOutput;
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
    RoundedButtonUI btn_newGame;
    JLabel lbl_info, lbl_remainingTries;
    ArrayList<JToggleButton> btnList = new ArrayList<JToggleButton>();
    ArrayList<JToggleButton> correctBtns = new ArrayList<JToggleButton>();
    ArrayList<Color> colors = new ArrayList<Color>(){{
        add(new Color(0xba81c5));
        add(new Color(0xb0c4ef));
        add(new Color(0xa0c35a));
        add(new Color(0xf9df6d));
    }};
    ArrayList<JToggleButton> orderedBtns = new ArrayList<JToggleButton>();
    GetWordsWithCategory getWordsWithCategory = new GetWordsWithCategory();
    Random random = new Random();

    int remainingTries = 4;
    int buttonCounter = 0;
    int buttonX = 185;
    int buttonY = 70;
    int buttonWidth = 150;
    int buttonHeight = 80;
    String username;
    boolean won = false;

    public GamePanel(String username){
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        this.username = username;

        lbl_info = new JLabel("Create four groups of four!");
        lbl_info.setFont(new Font("Sanserif", Font.PLAIN, 16));
        lbl_info.setBounds(399, 22, 202, 22);
        this.add(lbl_info);

        instantiateButtons();
        btnList.addAll(Arrays.asList(btn_word11, btn_word12, btn_word13, btn_word14, btn_word21, btn_word22, btn_word23, btn_word24, btn_word31, btn_word32, btn_word33, btn_word34, btn_word41, btn_word42, btn_word43, btn_word44));
        createButtons();

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

        btn_newGame = new RoundedButtonUI("New Game");
        btn_newGame.setForeground(Color.WHITE);
        btn_newGame.setBackground(Color.BLACK);
        btn_newGame.setFont(new Font("Sanserif", Font.BOLD, 16));
        btn_newGame.setBounds(400, 560, 200, 40);
        this.add(btn_newGame);

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
        btn_newGame.addActionListener(this);
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

        if(!isAnyBtnSelected()){
            btn_deselect.setEnabled(false);
        }else {
            btn_deselect.setEnabled(true);
            if (e.getSource() == btn_deselect) {
                buttonCounter = 0;
                unsetAllButtons();
            }//end of if btn_deselect
        }

        if(buttonCounter < 4){
            btn_submit.setEnabled(false);
        }else {
            btn_submit.setEnabled(true);

            if(e.getSource() == btn_submit) {

                if (remainingTries <= 0) {
                    remainingTries = 0;
                } else if (!checkIfWordsAreInSameCategory()) {
                    remainingTries--;
                    if (remainingTries == 0) {
                        unsetAllButtons();
                        EndScreenFrame endScreenFrame = new EndScreenFrame(username, won);
                    }
                } else if (correctBtns.size() == 16) {
                    this.won = true;
                    disableAllButtons();
                    System.out.println("You won!");
                    System.out.println("isWon: " + won);
                    EndScreenFrame endScreenFrame = new EndScreenFrame(username, won);
                }
                lbl_remainingTries.setText("Remaining Tries: " + remainingTries);
            }
        }//end of if btn_submit

        if(e.getSource() == btn_newGame){
            //TODO: Implement the logic for the new game
            System.out.println("New Game");
        }//end of if btn_newGame

        if(buttonCounter > 4){
            buttonCounter = 4;
        }else if(buttonCounter < 0){
            buttonCounter = 0;
        }//end of if(buttonCounter)
    }//end of actionPerformed

    public void instantiateButtons(){
        btn_word11 = new JToggleButton();
        btn_word12 = new JToggleButton();
        btn_word13 = new JToggleButton();
        btn_word14 = new JToggleButton();
        btn_word21 = new JToggleButton();
        btn_word22 = new JToggleButton();
        btn_word23 = new JToggleButton();
        btn_word24 = new JToggleButton();
        btn_word31 = new JToggleButton();
        btn_word32 = new JToggleButton();
        btn_word33 = new JToggleButton();
        btn_word34 = new JToggleButton();
        btn_word41 = new JToggleButton();
        btn_word42 = new JToggleButton();
        btn_word43 = new JToggleButton();
        btn_word44 = new JToggleButton();
    }//end of instantiateButtons

    public void createButtons(){
        int tempCounter = 0;

        for(JToggleButton button : btnList){

            button.setUI(new CustomToggleButtonUI(new Color(0x5a594e), new Color(0xefefe6)));
            button.setFont(new Font("Sanserif", Font.BOLD, 20));
            button.setBounds(buttonX, buttonY, buttonWidth, buttonHeight);
            button.setBorder(new RoundBorder(16));
            this.add(button);

            tempCounter++;

            buttonX += 160;

            if(tempCounter > 3){
                buttonX = 185;
                buttonY += 90;
                tempCounter = 0;
            }
        }
    }//end of createButtons

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
            if(!checkIfButtonsAreCorrect(button)){
                listOfWords.add(button.getText());
            }
        }

        for(JToggleButton button : btnList){
            if(!checkIfButtonsAreCorrect(button)){
                int randomIndex = random.nextInt(listOfWords.size());
                String word = listOfWords.get(randomIndex);
                button.setText(word);
                listOfWords.remove(randomIndex);
            }
        }
    }//end of shuffleWords

    public boolean checkIfWordsAreInSameCategory(){
        ArrayList<Word> words = getWordsWithCategory.getAllWords();
        ArrayList<Word> wordListToCheck = new ArrayList<Word>();
        ArrayList<JToggleButton> slctdBtns = new ArrayList<JToggleButton>();
        int counterOfMatches = 0;

        //if button is selected, check which word is selected and add it to the wordListToCheck
        for(JToggleButton button : btnList){
            for(Word word : words){
                if(button.isSelected()){
                    if(button.getText().equalsIgnoreCase(word.getValue())){
                        wordListToCheck.add(word);
                    }
                    if(!ifSelectedListHasDuplicates(button, slctdBtns)){
                        slctdBtns.add(button);
                    }
                }
            }//end of for loop
        }//end of for loop

        if(wordListToCheck.size() == 4) {

            for (Word word : wordListToCheck) {
                String category = word.getCategory();
                String categoryToCheck = wordListToCheck.get(0).getCategory();

                if (category.equalsIgnoreCase(categoryToCheck)) {
                    counterOfMatches++;
                }
            }//end of for loop

            if (counterOfMatches == 4) {

                for (JToggleButton button : slctdBtns) {

                    button.setSelected(false);
                    button.setEnabled(false);

                    if(!ifCorrectListHasDuplicates(button)){
                        correctBtns.add(button);
                    }

                    moveBtns();
                    colourTheCorrectBtns();

                    buttonCounter = 0;

                }
                buttonCounter = 0;
                System.out.println("All words are in the same category!");
                return true;
            }
        }
        System.out.println("Words are not in the same category!");
        return false;
    }//end of checkIfWordsAreInSameCategory

    public boolean ifSelectedListHasDuplicates(JToggleButton btn, ArrayList<JToggleButton> selectedBtns){
        for(JToggleButton button : selectedBtns){
            if(button == btn){
                return true;
            }
        }
        return false;
    }//end of ifCorrectListHasDuplicates

    public boolean ifCorrectListHasDuplicates(JToggleButton btn){
        for(JToggleButton button : correctBtns){
            if(button == btn){
                return true;
            }
        }
        return false;
    }//end of ifCorrectListHasDuplicates

    public void moveBtns(){
        int xpos = 0;
        int ypos = 0;
        int indexBtnList = 0;
        int indexCorrectBtnList = 0;

        for(int i = 0; i < btnList.size(); i++){
            JToggleButton button = btnList.get(i);

            for(JToggleButton correctButton : correctBtns){
                if(!checkIfButtonsAreCorrect(button) && !isBtnOrdered(correctButton)){
                    xpos = button.getX();
                    ypos = button.getY();

                    button.setBounds(correctButton.getX(), correctButton.getY(), buttonWidth, buttonHeight);
                    correctButton.setBounds(xpos, ypos, buttonWidth, buttonHeight);

                    orderedBtns.add(correctButton);

                    indexBtnList = btnList.indexOf(button);
                    indexCorrectBtnList = btnList.indexOf(correctButton);
                    btnList.set(indexBtnList, correctButton);
                    btnList.set(indexCorrectBtnList, button);
                    i = btnList.size();
                }
            }

            if(!isBtnOrdered(button) && orderedBtns.size() == btnList.size()-1){ //last button wont get added so doing it manually
                orderedBtns.add(button);
            }
        }
    }//end of moveBtns

    public boolean isBtnOrdered(JToggleButton button){
        for(JToggleButton btn : orderedBtns){
            if(button == btn){
                return true;
            }
        }
        return false;
    }//end of isBtnOrdered

    public void colourTheCorrectBtns(){
        int sizeOforderedBtn = orderedBtns.size();
        int index = colors.size()-1;
        boolean updateIOnces = false;

        for(int i = 0; i < orderedBtns.size(); i++){

            JToggleButton button = orderedBtns.get(i);

            if(sizeOforderedBtn <= 4 ){
                button.setUI(new CustomToggleButtonUI(new Color(0x5a594e), colors.get(index)));

            } else if (sizeOforderedBtn > 4 && sizeOforderedBtn <= 8){

                if(!updateIOnces) {
                    i = 4;
                    updateIOnces = true;
                }
                methodForColourTheCorrectBtns(button, index, i, 4);
                sizeOforderedBtn = orderedBtns.size();

            } else if (sizeOforderedBtn > 8 && sizeOforderedBtn <= 12){

                if(!updateIOnces) {
                    i = 8;
                    updateIOnces = true;
                }
                methodForColourTheCorrectBtns(button, index, i, 3);
                sizeOforderedBtn = orderedBtns.size();

            } else if (sizeOforderedBtn > 12){

                if(!updateIOnces) {
                    i = 12;
                    updateIOnces = true;
                }

                methodForColourTheCorrectBtns(button, index, i, 2);
                sizeOforderedBtn = orderedBtns.size();
            }
        }
    }//end of colourTheCorrectBtns

    public void methodForColourTheCorrectBtns(JToggleButton button, int index, int i, int colourIndex){
        button = orderedBtns.get(i);
        if(colors.size() >= colourIndex){
            colors.remove(index);
        }
        index = colors.size()-1;
        button.setUI(new CustomToggleButtonUI(new Color(0x5a594e), colors.get(index)));
    }//end of methodForColourTheCorrectBtns

    public void lowerOrHigherBtnCounter(JToggleButton button){
        if(button.isSelected()){
            buttonCounter++;
        }else{
            buttonCounter--;
            makeUnSelectedBtnsSelectable();
        }
    }//end of lowerOrHigherBtnCounter

    public void makeUnSelectedBtnsSelectable(){
        for(JToggleButton button : btnList){
            if(!button.isSelected() && !checkIfButtonsAreCorrect(button)){
                button.setEnabled(true);
            }
        }
    }//end of makeUnSelectedBtnsSelectable

    public void unsetAllButtons(){
        for(JToggleButton button : btnList){
            if(!checkIfButtonsAreCorrect(button)){
                button.setSelected(false);
                button.setEnabled(true);
            }
        }
    }//end of unsetAllButtons

    public void disableAllButtons(){
        for(JToggleButton button : btnList){
            button.setEnabled(false);
        }

        btn_submit.setEnabled(false);
        btn_deselect.setEnabled(false);
        btn_shuffle.setEnabled(false);
    }//end of disableAllButtons

    public boolean checkIfButtonsAreCorrect(JToggleButton button){
        for(JToggleButton btn : correctBtns){
            if(btn == button){
                return true;
            }
        }
        return false;
    }//end of checkIfButtonsAreCorrect

    public boolean isAnyBtnSelected(){
        for(JToggleButton button : btnList){
            if(button.isSelected()){
                return true;
            }
        }
        return false;
    }//end of isAnyBtnSelected

    public boolean isWon() {
        return won;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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


