package com.test.playerteam;

/**
 * Created by joschinc on 11/21/16.
 */
public class PlayerSoccer {
    private String name;
    private String position;
    private Team team;

    public PlayerSoccer(String name, String position, Team team){
        this.name = name;
        this.position = position;
        this.team = team;
    }


    public String getName(){
        return this.name;
    }

    public String getPosition(){
        return this.position;
    }
    public void displayInfo(){
        System.out.println("Data of PLAYER:\n Name: " + this.getName() + "\n Position: " + this.getPosition() + "\nTeam Info: \n" + this.team.toString());
    }
}
