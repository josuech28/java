package com.exercise;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;

/**
 * Created by joschinc on 11/17/16.
 */
public final class Employee {
    private int id;
    private String name;
    private int[] reports;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
        this.reports = new int[10];
        addReports();
    }
    public Employee(){
    }

    private void addReports(){
        for(int i = 0; i < 10; i++){
            this.reports[i] = i + 1;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", reports=" + Arrays.toString(reports) +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        this.reports = null;
        System.out.println("Object Destroyed");
    }
}
