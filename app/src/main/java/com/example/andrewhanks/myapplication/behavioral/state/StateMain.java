package com.example.andrewhanks.myapplication.behavioral.state;

public class StateMain {
    public static void start() {
        TrafficLight trafficLight = new TrafficLight();
        while (true) {
            trafficLight.change();
        }
    }
}
