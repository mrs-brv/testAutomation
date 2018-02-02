package com.jsystems.models;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable{
    public String imie;
    public String nazwisko;
    public List<Device> device;


    @Override
    public String toString() {
        return "User{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", device=" + device +
                '}';
    }
}
