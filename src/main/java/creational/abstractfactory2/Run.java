package creational.abstractfactory2;

import creational.abstractfactory2.colors.Color;
import creational.abstractfactory2.engine.AbstractFactory;
import creational.abstractfactory2.engine.FactoryProducer;
import creational.abstractfactory2.shapes.Shape;

public class Run {

    public static void main(String[] args){

        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape shape = shapeFactory.getShape("square");
        shape.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color color = colorFactory.getColor("blue");
        color.fill();

    }
}
