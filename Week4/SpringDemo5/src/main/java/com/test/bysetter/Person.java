package com.test.bysetter;

import java.util.Collection;
import java.util.Map;

/**
 * Created by joschinc on 11/22/16.
 */
public class Person{
    private String name;
    private Map<Integer,Car> car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, Car> getCar() {
        return car;
    }

    public void setCar(Map<Integer,Car> car) {
        this.car = car;
    }

    public String printCar(){
        String result = "";
        Collection<Car> values = car.values();
        for(Car car: values){
            result += car.toString() + " ";
        }
        return result;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + printCar() +
                '}';
    }
}
