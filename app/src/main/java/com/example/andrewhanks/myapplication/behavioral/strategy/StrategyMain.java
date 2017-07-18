package com.example.andrewhanks.myapplication.behavioral.strategy;

import java.io.IOException;

public class StrategyMain {
    public static void start() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Server server = new Server(9999, new EchoService());
                    server.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
