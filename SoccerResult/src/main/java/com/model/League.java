package com.model;

/**
 * Created by joschinc on 12/29/16.
 */
public final class League {
    private final int idLeague;
    private final String name;
    private final String description;

    public League(int idLeague, String name, String description) {
        this.idLeague = idLeague;
        this.name = name;
        this.description = description;
    }

    public int getIdLeague() {
        return idLeague;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name;
    }
}
