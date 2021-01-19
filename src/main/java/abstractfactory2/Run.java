package abstractfactory2;

import abstractfactory2.colors.Color;
import abstractfactory2.engine.AbstractFactory;
import abstractfactory2.engine.FactoryProducer;
import abstractfactory2.shapes.Shape;

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
