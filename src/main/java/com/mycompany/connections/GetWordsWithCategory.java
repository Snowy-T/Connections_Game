package com.mycompany.connections;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

public class GetWordsWithCategory {

    ArrayList<Word> wordsOfFirstCategory = new ArrayList<>();
    ArrayList<Word> wordsOfSecondCategory = new ArrayList<>();
    ArrayList<Word> wordsOfThirdCategory = new ArrayList<>();
    ArrayList<Word> wordsOfFourthCategory = new ArrayList<>();
    ArrayList<Word> allWords = new ArrayList<>();
    Statement statement;
    ResultSet resultSet;
    Random random;
    String category1, category2, category3, category4;
    int selectRandomCategory;
    String randomCategory;
    String idOfFirstCategory = "";
    String idOfSecondCategory = "";
    String idOfThirdCategory = "";
    String idOfFourthCategory = "";

    public GetWordsWithCategory() {
        random = new Random();
        selectRandomCategory = random.nextInt(20) + 1;
        randomCategory = String.valueOf(selectRandomCategory);
        asignWordsToCategory();

    }

    public void asignWordsToCategory() {
        try {
            statement = SingeltonConnection.getInstanz().getConnection().createStatement();
            resultSet = statement.executeQuery("SELECT w.wname,c.cname,c.cid FROM word w " +
                    "INNER JOIN category c ON w.cid = c.cid");

            while(resultSet.next()) {
                String word = resultSet.getString("wname");
                String category = resultSet.getString("cid");

                if(wordsOfFirstCategory.size() <= 3 && category.equals(randomCategory)){
                    category1 = resultSet.getString("cname");
                    Word word1 = new Word(word, category1);
                    wordsOfFirstCategory.add(word1);
                    allWords.add(word1);
                    idOfFirstCategory= randomCategory;
                    if(wordsOfFirstCategory.size() > 3){
                        selectRandomCategory = random.nextInt(20) + 1;
                        if(selectRandomCategory == Integer.parseInt(idOfFirstCategory)){
                            selectRandomCategory = random.nextInt(20) + 1;
                        }
                        randomCategory = String.valueOf(selectRandomCategory);
                        asignWordsToCategory();
                    }
                }

                if(wordsOfFirstCategory.size() > 3 && wordsOfSecondCategory.size() <= 3 && category.equals(randomCategory) && !category.equals(idOfFirstCategory)) {
                    category2 = resultSet.getString("cname");
                    Word word2 = new Word(word, category2);
                    wordsOfSecondCategory.add(word2);
                    allWords.add(word2);
                    idOfSecondCategory = randomCategory;
                    if(wordsOfSecondCategory.size() > 3) {
                        selectRandomCategory = random.nextInt(20) + 1;
                        if(selectRandomCategory == Integer.parseInt(idOfFirstCategory) || selectRandomCategory == Integer.parseInt(idOfSecondCategory)){
                            selectRandomCategory = random.nextInt(20) + 1;
                        }
                        randomCategory = String.valueOf(selectRandomCategory);
                        asignWordsToCategory();
                    }
                }

                if(wordsOfFirstCategory.size() > 3 && wordsOfSecondCategory.size() > 3 && wordsOfThirdCategory.size() <= 3 && category.equals(randomCategory) && !category.equals(idOfFirstCategory) && !category.equals(idOfSecondCategory)) {
                    category3 = resultSet.getString("cname");
                    Word word3 = new Word(word, category3);
                    wordsOfThirdCategory.add(word3);
                    allWords.add(word3);
                    idOfThirdCategory = randomCategory;
                    if(wordsOfThirdCategory.size() > 3) {
                        selectRandomCategory = random.nextInt(20) + 1;
                        if(selectRandomCategory == Integer.parseInt(idOfFirstCategory) || selectRandomCategory == Integer.parseInt(idOfSecondCategory) || selectRandomCategory == Integer.parseInt(idOfThirdCategory)){
                            selectRandomCategory = random.nextInt(20) + 1;
                        }
                        randomCategory = String.valueOf(selectRandomCategory);
                        asignWordsToCategory();
                    }
                }

                if(wordsOfFirstCategory.size() > 3 && wordsOfSecondCategory.size() > 3 && wordsOfThirdCategory.size() > 3 && wordsOfFourthCategory.size() <= 3 && category.equals(randomCategory) && !category.equals(idOfFirstCategory) && !category.equals(idOfSecondCategory) && !category.equals(idOfThirdCategory)) {
                    category4 = resultSet.getString("cname");
                    Word word4 = new Word(word, category4);
                    wordsOfFourthCategory.add(word4);
                    allWords.add(word4);
                    idOfFourthCategory = randomCategory;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String checkIfWordsAreInSameCategory(String word) {
        String category = "";
        try {
            System.out.println("Word: " + word);
            String sqlWord = "SELECT c.cname FROM word w " +
                    "INNER JOIN category c ON w.cid = c.cid " +
                    "WHERE w.wname = '" + word+ "'";

            statement = SingeltonConnection.getInstanz().getConnection().createStatement();
            resultSet = statement.executeQuery(sqlWord);

            while(resultSet.next()) {
                category = resultSet.getString("cname");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return category;
    }

    public ArrayList<Word> getWordsOfFirstCategory() {
        return wordsOfFirstCategory;
    }

    public ArrayList<Word> getWordsOfSecondCategory() {
        return wordsOfSecondCategory;
    }

    public ArrayList<Word> getWordsOfThirdCategory() {
        return wordsOfThirdCategory;
    }

    public ArrayList<Word> getWordsOfFourthCategory() {
        return wordsOfFourthCategory;
    }

    public String getCategory1() {
        return category1;
    }

    public String getCategory2() {
        return category2;
    }

    public String getCategory3() {
        return category3;
    }

    public String getCategory4() {
        return category4;
    }
}
