package com.model;

/**
 * Created by joschinc on 12/16/16.
 */
public class Student {
    private final int age;
    private final String name;
    private final int id;

    public Student(int age, String name, int id){
        this.age = age;
        this.name = name;
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (getAge() != student.getAge()) return false;
        if (getId() != student.getId()) return false;
        return getName().equals(student.getName());

    }

    @Override
    public int hashCode() {
        int result = getAge();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getId();
        return result;
    }
}
