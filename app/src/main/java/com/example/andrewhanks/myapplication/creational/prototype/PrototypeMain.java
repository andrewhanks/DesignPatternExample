package com.example.andrewhanks.myapplication.creational.prototype;

public class PrototypeMain {
    public static void start() {
        Car bmw = new Car();
        // 作一些 BMW 複雜的初始、設定、有的沒的
        Car benz = new Car();
        // 作一些 BENZ 複雜的初始、設定、有的沒的
        Cars cars = new Cars();
        cars.addPrototype("BMW", bmw);
        cars.addPrototype("BENS", benz);
        // 取得 BMW 原型複製
        try {
            Car bmwPrototype = cars.getPrototype("BMW");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
