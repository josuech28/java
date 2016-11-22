package com.test;

/**
 * Created by joschinc on 11/21/16.
 */
public class Player {
    private String name;
    private String position;

    public Player(String name, String position){
        this.name = name;
        this.position = position;
    }

    public Player(){

    }
    public String getName(){
        return this.name;
    }

    public String getPosition(){
        return this.position;
    }
    public void displayInfo(){
        System.out.println("Data of PLAYER:\n Name: " + this.getName() + "\n Position: " + this.getPosition());
    }
}
