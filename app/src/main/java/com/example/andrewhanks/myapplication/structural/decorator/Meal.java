package com.example.andrewhanks.myapplication.structural.decorator;

interface Meal {
    String getContent();

    double price();
}

class FriedChicken implements Meal {
    public String getContent() {
        return "不黑心炸雞";
    }

    public double price() {
        return 49.0;
    }
}

class Hamburger implements Meal {
    public String getContent() {
        return "美味豬肉堡";
    }

    public double price() {
        return 99.0;
    }
}

abstract class SideDish implements Meal {
    protected Meal meal;

    SideDish(Meal meal) {
        this.meal = meal;
    }
}

class SideDishOne extends SideDish {
    SideDishOne(Meal meal) {
        super(meal);
    }

    public String getContent() {
        return meal.getContent() + " | 可樂 | 薯條";
    }

    public double price() {
        return meal.price() + 30.0;
    }
}