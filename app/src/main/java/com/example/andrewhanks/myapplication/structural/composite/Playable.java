package com.example.andrewhanks.myapplication.structural.composite;

import java.util.ArrayList;
import java.util.List;

interface Playable {
    void play();
}

class Frame implements Playable {
    private String image;

    Frame(String image) {
        this.image = image;
    }

    public void play() {
        System.out.println("播放 " + image);
    }
}

class Playlist implements Playable {
    private List<Playable> list = new ArrayList<>();

    public void add(Playable playable) {
        list.add(playable);
    }

    public void play() {
        for (Playable playable : list) {
            playable.play();
        }
    }
}
