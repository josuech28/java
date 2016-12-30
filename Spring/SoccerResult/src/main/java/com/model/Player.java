package com.model;

/**
 * Created by joschinc on 12/29/16.
 */
public final class Player {
    private final String idPlayer;
    private final int matchPlayed;
    private final int matchWon;
    private final int matchLost;
    private final int matchTied;
    private final int goalFavor;
    private final int goalAgainst;

    public Player(String idPlayer, int matchPlayed, int matchWon, int matchLost, int matchTied, int goalFavor, int goalAgainst) {
        this.idPlayer = idPlayer;
        this.matchPlayed = matchPlayed;
        this.matchWon = matchWon;
        this.matchLost = matchLost;
        this.matchTied = matchTied;
        this.goalFavor = goalFavor;
        this.goalAgainst = goalAgainst;
    }

    public String getIdPlayer() {
        return idPlayer;
    }

    public int getMatchPlayed() {
        return matchPlayed;
    }

    public int getMatchWon() {
        return matchWon;
    }

    public int getMatchLost() {
        return matchLost;
    }

    public int getMatchTied() {
        return matchTied;
    }

    public int getGoalFavor() {
        return goalFavor;
    }

    public int getGoalAgainst() {
        return goalAgainst;
    }

    @Override
    public String toString() {
        return "Player{" +
                "idPlayer='" + idPlayer + '\'' +
                ", matchWon=" + matchWon +
                ", matchLost=" + matchLost +
                ", matchTied=" + matchTied +
                ", goalFavor=" + goalFavor +
                ", goalAgainst=" + goalAgainst +
                '}';
    }
}
