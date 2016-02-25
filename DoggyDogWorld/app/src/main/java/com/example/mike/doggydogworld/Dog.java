package com.example.mike.doggydogworld;

import android.util.Log;

/**
 * Created by Mike on 1/29/2015.
 */
public class Dog {
    private String name;
    private int age;
    private int numberOfLegs = 4;
    private String breed;

    public Dog(){
        Log.d("Dog", "Constructing...");
    }

    public Dog(String dogName){
        this.name = dogName;
    }

    public void bark(){
        String bark = name + " barked";
        Log.d("Dog", bark);
    }

    public void barkAt(String victim){
        String bark = name + " barked at " + victim;
        Log.d("Dog", bark);
    }
}
