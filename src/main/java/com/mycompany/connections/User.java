package com.mycompany.connections;

public class User {

    private String username;
    private String password;
    private int nrOfGamesWon;

    public User(String username, String password, int nrOfGamesWon) {
        this.username = username;
        this.password = password;
        this.nrOfGamesWon = nrOfGamesWon;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNrOfGamesWon() {
        return nrOfGamesWon;
    }

    public void setNrOfGamesWon(int nrOfGamesWon) {
        this.nrOfGamesWon = nrOfGamesWon;
    }
}
