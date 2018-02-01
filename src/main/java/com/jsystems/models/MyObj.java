package com.jsystems.models;

public class MyObj {
    public String name;
    public String surname;

    public MyObj(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public MyObj(){

    }
    @Override
    public String toString() {
        return "MyObj{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
