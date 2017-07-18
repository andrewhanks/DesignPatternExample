package com.example.andrewhanks.myapplication.behavioral.chainofresponsibility;

public class ChainOfResponsibilityMain {

    public static void start() {
        Handler handler = new SymbolHandler(
                new CharacterHandler(
                        new DigitHandler(null)));
        handler.handle('A');
        handler.handle('1');
    }
}
