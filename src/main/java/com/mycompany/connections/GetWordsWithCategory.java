package com.mycompany.connections;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

public class GetWordsWithCategory {

    ArrayList<String> wordsOfFirstCategory = new ArrayList<>();
    ArrayList<String> wordsOfSecondCategory = new ArrayList<>();
    ArrayList<String> wordsOfThirdCategory = new ArrayList<>();
    ArrayList<String> wordsOfFourthCategory = new ArrayList<>();
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

        //TODO: Delete after testing
        System.out.println("Category 1: " + category1);
        for (String word : wordsOfFirstCategory) {
            System.out.println(word);
        }
        System.out.println("-------------------");
        System.out.println("Category 2: " + category2);
        for (String word : wordsOfSecondCategory) {
            System.out.println(word);
        }
        System.out.println("-------------------");
        System.out.println("Category 3: " + category3);
        for (String word : wordsOfThirdCategory) {
            System.out.println(word);
        }
        System.out.println("-------------------");
        System.out.println("Category 4: " + category4);
        for (String word : wordsOfFourthCategory) {
            System.out.println(word);
        }
    }

    public void asignWordsToCategory() {
        try {
            statement = SingeltonConnection.getInstanz().getConnection().createStatement();
            resultSet = statement.executeQuery("SELECT w.word,c.category,c.cid FROM words w " +
                                                    "INNER JOIN category c ON w.cid = c.cid");

            while(resultSet.next()) {
                String word = resultSet.getString("word");
                String category = resultSet.getString("cid");

                if(wordsOfFirstCategory.size() <= 3 && category.equals(randomCategory)){
                    wordsOfFirstCategory.add(word);
                    category1 = resultSet.getString("cname");
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
                    wordsOfSecondCategory.add(word);
                    category2 = resultSet.getString("cname");
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
                    wordsOfThirdCategory.add(word);
                    category3 = resultSet.getString("cname");
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
                    wordsOfFourthCategory.add(word);
                    category4 = resultSet.getString("cname");
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
            String sqlWord = "SELECT c.category FROM words w " +
                         "INNER JOIN category c ON w.cid = c.cid " +
                         "WHERE w.name = '" + word+ "'";

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

    public ArrayList<String> getWordsOfFirstCategory() {
        return wordsOfFirstCategory;
    }

    public ArrayList<String> getWordsOfSecondCategory() {
        return wordsOfSecondCategory;
    }

    public ArrayList<String> getWordsOfThirdCategory() {
        return wordsOfThirdCategory;
    }

    public ArrayList<String> getWordsOfFourthCategory() {
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
