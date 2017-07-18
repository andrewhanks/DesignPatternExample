package com.example.andrewhanks.myapplication.behavioral.template;

class ConsoleGame extends GuessGame {

    private int guessNumber = 0;

    ConsoleGame() {
        welcome = "歡迎";
        prompt = "輸入";
        correct = "猜中了";
        bigger = "你猜的比較大";
        smaller = "你猜的比較小";
    }

    protected void message(String msg) {
        System.out.println(msg);
    }

    protected int guess() {
        System.out.println("guess number is " + guessNumber);
        return guessNumber++;
    }
}