package Main;

import Formas.Rectangle;
import Formas.Circle;

public class main {

    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black", "Purple"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {

            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();

            Rectangle rectangle = (Rectangle) ShapeFactory.getRectangle(getRandomColor());
            rectangle.setX(getRandomX());
            rectangle.setY(getRandomY());
            rectangle.draw();
            System.out.println("-/-/-/-/-/-/-/-/-/-");
        }

    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }

}
