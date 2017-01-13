package com.model;

/**
 * Created by joschinc on 12/29/16.
 */
public final class Team {
    private final int idTeam;
    private final String name;
    private  int idLigue;

    public Team(int idTeam, String name, int idLigue) {
        this.idTeam = idTeam;
        this.name = name;
        this.idLigue = idLigue;
    }

    public int getIdTeam() {
        return idTeam;
    }

    public String getName() {
        return name;
    }

    public int getLigue() {
        return idLigue;
    }

    @Override
    public String toString() {
        return name;
    }
}
