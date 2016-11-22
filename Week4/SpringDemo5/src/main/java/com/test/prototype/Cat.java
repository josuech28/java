package com.test.prototype;

import com.test.singleton.Animal;

/**
 * Created by joschinc on 11/22/16.
 */
public class Cat implements Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("I am " + this.getName() + " and I am running");
    }

    @Override
    public void eat() {
        System.out.println("I am " + this.getName() + " I am eating");
    }

    @Override
    public void sleep() {
        System.out.println("I am " + this.getName() + " I am sleeping");
    }

    public void miau(){
        System.out.println("Miiauuu");
    }
}
