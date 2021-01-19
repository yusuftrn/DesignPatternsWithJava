package abstractfactory2.engine;

import abstractfactory2.colors.Blue;
import abstractfactory2.colors.Color;
import abstractfactory2.colors.Green;
import abstractfactory2.colors.Red;
import abstractfactory2.shapes.Shape;

public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if(color.equalsIgnoreCase("red")){
            return new Red();
        }
        else if(color.equalsIgnoreCase("blue")){
            return new Blue();
        }
        else if(color.equalsIgnoreCase("green")){
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
