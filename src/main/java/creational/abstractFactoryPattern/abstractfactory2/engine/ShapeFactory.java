package creational.abstractFactoryPattern.abstractfactory2.engine;

import creational.abstractFactoryPattern.abstractfactory2.colors.Color;
import creational.abstractFactoryPattern.abstractfactory2.shapes.Circle;
import creational.abstractFactoryPattern.abstractfactory2.shapes.Rectangle;
import creational.abstractFactoryPattern.abstractfactory2.shapes.Shape;
import creational.abstractFactoryPattern.abstractfactory2.shapes.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("circle")){
            return new Circle();
        }
        else if(shape.equalsIgnoreCase("square")){
            return new Square();
        }
        else if(shape.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
