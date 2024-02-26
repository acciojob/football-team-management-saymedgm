package com.driver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Player> {
    private List<T> players;

    public Team() {
        this.players = new ArrayList<T>();
    }

    public void addPlayer(T player) {
        players.add(player);
    }

    public List<T> getPlayers() {
        return players;
    }

    public void removePlayer(String playerName) {
        Iterator<T> iterator = players.iterator();
        while (iterator.hasNext()) {
            T player = iterator.next();
            if (player.getPlayerName().equalsIgnoreCase(playerName)) {
                iterator.remove();
                System.out.println("Player removed successfully.");
                return;
            }
        }
        System.out.println("Player not found.");
    }

    public void displayPlayers() {
        if (players.isEmpty()) {
            System.out.println("No players in the team.");
        } else {
            System.out.println("Players in the team:");
            for (T player : players) {
                System.out.println(player);
            }
        }
    }
}