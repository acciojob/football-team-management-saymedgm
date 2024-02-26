package com.driver;

public class Player {
    private String playerName;
    private int jerseyNumber;

    public Player(String playerName, int jerseyNumber) {
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    @Override
    public String toString() {
        return "Player [Name: " + playerName + ", Jersey Number: " + jerseyNumber + "]";
    }
}