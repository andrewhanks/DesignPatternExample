package com.example.andrewhanks.myapplication.structural.decorator;

public class DecoratorMain {
    public static void start() {
        Restaurant restaurant = new Restaurant();

        SimpleCombo simpleCombo = new SimpleCombo(restaurant);

        System.out.println("簡餐：");
        simpleCombo.order();

        BusinessLunch businessLunch = new BusinessLunch(restaurant);
        System.out.println("商業午餐：");
        businessLunch.order();

        FullCombo fullCombo = new FullCombo(restaurant);
        System.out.println("全餐：");
        fullCombo.order();
    }
}
