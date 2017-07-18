package com.example.andrewhanks.myapplication.structural.bridge;

class JavaDrawing implements Drawing {
    public void drawImage(String image) {
        System.out.println("Java 2D 畫 " + image);
    }

    public void drawLine() {
        System.out.println("Java 2D 畫線 ");
    }

    public void turnImage(String image) {
        System.out.println("Java 2D 轉 " + image);
    }

    public void rotateImage(String image) {
        System.out.println("Java 2D 翻 " + image);
    }
}

class Duke implements Turtle {
    private String image = "Duke";
    private Drawing drawing;

    Duke(Drawing drawing) {
        this.drawing = drawing;
    }

    public void move() {
        System.out.println("計算出目的地位置");
        drawing.drawImage(image);
        drawing.drawLine();
    }

    public void turn() {
        drawing.rotateImage(image);
        drawing.drawImage(image);
    }
}

public class BridgeMain {
    public static void start() {
        Turtle turtle = new Duke(new JavaDrawing());
        turtle.move();
        turtle.turn();
    }
}
