package com.example.andrewhanks.myapplication.structural.proxy;

public class ProxyMain {
    public static void start() {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
