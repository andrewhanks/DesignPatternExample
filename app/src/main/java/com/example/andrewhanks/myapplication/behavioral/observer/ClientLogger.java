package com.example.andrewhanks.myapplication.behavioral.observer;

public class ClientLogger implements ClientListener {

    public void clientAdded(ClientEvent event) {
        System.out.println(event.ip + " added...");
    }

    public void clientRemoved(ClientEvent event) {
        System.out.println(event.ip + " removed...");
    }
}
