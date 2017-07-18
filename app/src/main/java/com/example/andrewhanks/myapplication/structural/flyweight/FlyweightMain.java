package com.example.andrewhanks.myapplication.structural.flyweight;

public class FlyweightMain {
    public static void start() {
        Font font1 = FontFactory.create("細明體", Style.BOLD, 12);
        Font font2 = FontFactory.create("細明體", Style.BOLD, 12);
        Font font3 = FontFactory.create("標楷體", Style.PLAIN, 14);
        
        System.out.println("font1 equals font2 ? " + String.valueOf(font1 == font2));
        System.out.println("font2 equals font3 ? " + String.valueOf(font2 == font3));
    }
}
