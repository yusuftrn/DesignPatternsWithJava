package structural.composite.compositeExample3;

import structural.composite.compositeExample3.shapes.Circle;
import structural.composite.compositeExample3.shapes.Drawing;
import structural.composite.compositeExample3.shapes.Shape;
import structural.composite.compositeExample3.shapes.Triangle;

public class Run {

    public static void main(String[] args) {

        Shape triangle = new Triangle();
        Shape triangle2 = new Triangle();
        Shape circle = new Circle();

        Drawing drawingObject = new Drawing();
        drawingObject.add(triangle);
        drawingObject.add(triangle2);
        drawingObject.add(circle);
        System.out.println("");
        drawingObject.draw("Red");
        drawingObject.clear();

        System.out.println("");

        drawingObject.add(triangle);
        drawingObject.add(circle);
        drawingObject.draw("Green");
        drawingObject.clear();
    }
}
/*
Drawing Triangle with color: Red
Drawing Triangle with color: Red
Drawing Circle with color: Red
Clearing all the shapes from drawing

Drawing Triangle with color: Green
Drawing Circle with color: Green
Clearing all the shapes from drawing
 */