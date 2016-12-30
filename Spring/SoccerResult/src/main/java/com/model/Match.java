package com.model;

/**
 * Created by joschinc on 12/29/16.
 */
public final class Match implements Comparable<Match>{
    private final int idMatch;
    private final String homePlayer;
    private final String awayPlayer;
    private final int golHomePlayer;
    private final int goalAwayPlayer;


    public Match(int idMatch, String homePlayer, String awayPlayer, int golHomePlayer, int golAwayPlayer) {
        this.idMatch = idMatch;
        this.homePlayer = homePlayer;
        this.awayPlayer = awayPlayer;
        this.golHomePlayer = golHomePlayer;
        this.goalAwayPlayer = golAwayPlayer;
    }

    public int getIdMatch() {
        return idMatch;
    }

    public String getHomePlayer() {
        return homePlayer;
    }

    public String getAwayPlayer() {
        return awayPlayer;
    }

    public int getGolHomePlayer() {
        return golHomePlayer;
    }

    public int getGoalAwayPlayer() {
        return goalAwayPlayer;
    }

    @Override
    public String toString() {
        return "Match{" +
                "idMatch=" + idMatch +
                ", homePlayer=" + homePlayer +
                ", awayPlayer=" + awayPlayer +
                ", golHomePlayer=" + golHomePlayer +
                ", goalAwayPlayer=" + goalAwayPlayer +
                '}';
    }

    public int compareTo(Match o) {
        return 0;
    }
}
