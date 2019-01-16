package com.example.andrewhanks.myapplication.structural.decorator;

public class Restaurant {

    private void minimumOrder() {
        System.out.println("  一杯飲料");
    }

    //低消是一杯飲料
    public void order() {
        minimumOrder();
    }
}

//商業午餐除了飲料還有沙拉跟主餐
class BusinessLunch extends Restaurant {

    private Restaurant restaurant;

    public BusinessLunch(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    private void salad() {
        System.out.println("  一盤沙拉");
    }

    private void mainMeal() {
        System.out.println("  一份主餐");
    }

    @Override
    public void order() {
        super.order();
        salad();
        mainMeal();
    }
}

//簡餐多了湯品
class SimpleCombo extends BusinessLunch {

    public SimpleCombo(Restaurant restaurant) {
        super(restaurant);
    }

    private void soup() {
        System.out.println("  一份湯品");
    }

    @Override
    public void order() {
        super.order();
        soup();
    }
}

//全餐再多了甜點
class FullCombo extends SimpleCombo {

    public FullCombo(Restaurant restaurant) {
        super(restaurant);
    }

    private void sweet() {
        System.out.println("  一份甜點");
    }

    @Override
    public void order() {
        super.order();
        sweet();
    }
}