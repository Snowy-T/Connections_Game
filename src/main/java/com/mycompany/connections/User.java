package com.mycompany.connections;

public class User {

    private String nickname;
    private String psw;
    private int nrOfGamesWon = 0;
    private int nrOfGamesPlayed= 0;

    public User(String username, String password) {
        this.nickname = username;
        this.psw = password;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPsw() {
        return psw;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public int getNrOfGamesWon() {
        return nrOfGamesWon;
    }

    public void setNrOfGamesWon(int nrOfGamesWon) {
        this.nrOfGamesWon = nrOfGamesWon;
    }

    public int getNrOfGamesPlayed() {
        return nrOfGamesPlayed;
    }

    public void setNrOfGamesPlayed(int nrOfGamesPlayed) {
        this.nrOfGamesPlayed = nrOfGamesPlayed;
    }
}
