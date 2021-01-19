package abstractfactory2.engine;

import abstractfactory2.colors.Color;
import abstractfactory2.shapes.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
