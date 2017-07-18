package com.example.andrewhanks.myapplication.structural.bridge;

interface Turtle {
    void move();

    void turn();
}

interface Drawing {
    void drawImage(String image);

    void drawLine();

    void turnImage(String image);

    void rotateImage(String image);
}
