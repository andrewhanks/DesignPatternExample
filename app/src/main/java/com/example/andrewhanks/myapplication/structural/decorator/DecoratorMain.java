package com.example.andrewhanks.myapplication.structural.decorator;

public class DecoratorMain {
    public static void start() {
        Meal chickenMeal = new SideDishOne(new FriedChicken());
        System.out.println("點了：" + chickenMeal.getContent());
        System.out.println("價格：" + chickenMeal.price());

        Meal portMeal = new SideDishOne(new Hamburger());
        System.out.println("點了：" + portMeal.getContent());
        System.out.println("價格：" + portMeal.price());
    }
}
