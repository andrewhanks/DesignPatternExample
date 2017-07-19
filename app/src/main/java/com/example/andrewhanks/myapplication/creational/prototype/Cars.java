package com.example.andrewhanks.myapplication.creational.prototype;

import java.util.HashMap;
import java.util.Map;

class Wheel implements Cloneable {
    // 也許還有一些複雜的設定
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Car implements Cloneable {
    // 也許還有一些複雜的設定
    private Wheel[] wheels = {new Wheel(), new Wheel(), new Wheel(), new Wheel()};

    protected Object clone() throws CloneNotSupportedException {
        Car copy = (Car) super.clone();
        copy.wheels = this.wheels.clone();
        for (int i = 0; i < this.wheels.length; i++) {
            copy.wheels[i] = (Wheel) this.wheels[i].clone();
        }
        return copy;
    }
    // 也許還有別的方法
}

class Cars {
    private Map<String, Car> prototypes = new HashMap<>();

    void addPrototype(String brand, Car prototype) {
        prototypes.put(brand, prototype);
    }

    Car getPrototype(String brand) throws CloneNotSupportedException {
        return (Car) prototypes.get(brand).clone();
    }
}