package com.jsystems.models;

public class Person {
    public long id;
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        if (age <=0){
            throw new IllegalArgumentException("Invalid age: " + age);
        }
    }
}
