package com.example.andrewhanks.myapplication.creational.singleton;

public class Singleton {

    private static Singleton instance = null;

    private Singleton() {

    }

    synchronized static public Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            System.out.println("Singleton created");
        }

        return instance;
    }
}