package com.test.constructor.collection.object.list.hashmap;

/**
 * Created by joschinc on 11/22/16.
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User: " + this.name;
    }
}
