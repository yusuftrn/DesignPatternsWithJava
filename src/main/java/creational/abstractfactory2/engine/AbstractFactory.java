package creational.abstractfactory2.engine;

import creational.abstractfactory2.colors.Color;
import creational.abstractfactory2.shapes.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
