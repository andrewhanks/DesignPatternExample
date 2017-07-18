package com.example.andrewhanks.myapplication.structural.composite;

public class CompositeMain {
    public static void start() {
        Frame logo = new Frame("片頭 LOGO");

        Playlist playlist1 = new Playlist();
        playlist1.add(new Frame("Duke 左揮手"));
        playlist1.add(new Frame("Duke 右揮手"));

        Playlist playlist2 = new Playlist();
        playlist2.add(new Frame("Duke 走左腳"));
        playlist2.add(new Frame("Duke 走右腳"));

        Playlist all = new Playlist();
        all.add(logo);
        all.add(playlist1);
        all.add(playlist2);

        all.play();
    }
}
