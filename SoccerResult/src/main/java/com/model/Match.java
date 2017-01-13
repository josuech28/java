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
    private final int homeTeam;
    private final int awayTeam;
    private final int homeLeague;
    private final int awayLeague;


    public Match(int idMatch, String homePlayer, String awayPlayer, int golHomePlayer, int golAwayPlayer, int homeTeam, int awayTeam,int homeLeague, int awayLeague) {
        this.idMatch = idMatch;
        this.homePlayer = homePlayer;
        this.awayPlayer = awayPlayer;
        this.golHomePlayer = golHomePlayer;
        this.goalAwayPlayer = golAwayPlayer;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeLeague = homeLeague;
        this.awayLeague = awayLeague;
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


    public int getHomeTeam() {
        return homeTeam;
    }

    public int getAwayTeam() {
        return awayTeam;
    }

    public int getHomeLeague() {
        return homeLeague;
    }

    public int getAwayLeague() {
        return awayLeague;
    }

    @Override
    public String toString() {
        return "Match{" +
                "idMatch=" + idMatch +
                ", homePlayer='" + homePlayer + '\'' +
                ", awayPlayer='" + awayPlayer + '\'' +
                ", golHomePlayer=" + golHomePlayer +
                ", goalAwayPlayer=" + goalAwayPlayer +
                ", homeTeam=" + homeTeam +
                ", awayTeam=" + awayTeam +
                ", homeLeague=" + homeLeague +
                ", awayLeague=" + awayLeague +
                '}';
    }

    public int compareTo(Match o) {
        return 0;
    }
}
