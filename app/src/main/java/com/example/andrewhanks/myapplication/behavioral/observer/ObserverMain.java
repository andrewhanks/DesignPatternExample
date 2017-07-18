package com.example.andrewhanks.myapplication.behavioral.observer;

public class ObserverMain {

    public static void start() {
        ClientQueue queue = new ClientQueue();
        queue.addClientListener(new ClientLogger());
        Client c1 = new Client("127.0.0.1", "caterpillar");
        Client c2 = new Client("192.168.0.2", "justin");
        queue.add(c1);
        queue.add(c2);
        queue.remove(c1);
        queue.remove(c2);
    }
}
