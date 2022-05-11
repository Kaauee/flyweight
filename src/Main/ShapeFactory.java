package Main;

import Formas.Rectangle;
import Formas.Circle;
import Formas.*;
import java.util.HashMap;

public class ShapeFactory {

    private static final HashMap circleMap = new HashMap();
    private static final HashMap squareMap = new HashMap();

    // Tem que ter as duas variaveis globais pois apenas 1 não consegue trocar de instanciação de objeto
    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Criando circulo da cor: " + color);
        }
        return circle;

    }

    public static Shape getRectangle(String color) {
        Rectangle rectangle = (Rectangle) squareMap.get(color);

        if (rectangle == null) {
            rectangle = new Rectangle(color);
            squareMap.put(color, rectangle);
            System.out.println("Criando retangulo da cor: " + color);
        }
        return rectangle;
    }

}
