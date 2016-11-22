package com.test.playerteam;

/**
 * Created by joschinc on 11/21/16.
 */
public class Team {
    private String name;
    private String country;



    public Team(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + this.getName() + '\'' +
                ", country='" + this.getCountry() + '\'' +
                '}';
    }
}
