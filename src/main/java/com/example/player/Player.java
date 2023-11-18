package com.example.player;

class Player {
    int playerId;
    String playerName;
    int jersyNumber;
    String role;

    public Player(int playerId, String playerName, int jersyNumber, String role) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.jersyNumber = jersyNumber;
        this.role = role;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getJersyNumber() {
        return jersyNumber;
    }

    public void setJersyNumber(int jersyNumber) {
        this.jersyNumber = jersyNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
