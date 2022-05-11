package Formas;

import Formas.Shape;

public class Rectangle implements Shape {

    private int x, y;
    private String color;

    public Rectangle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle: [Color: " + color + ", x : " + x
                + ", y : " + y + "]");
    }

}
