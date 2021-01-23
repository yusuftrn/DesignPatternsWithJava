package structural.decorator.decoratorExample2;

import structural.decorator.decoratorExample2.decorators.BlueShapeDecorator;
import structural.decorator.decoratorExample2.decorators.RedShapeDecorator;
import structural.decorator.decoratorExample2.shapes.Circle;
import structural.decorator.decoratorExample2.shapes.Rectangle;
import structural.decorator.decoratorExample2.shapes.Shape;

public class Run {

    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape blueCircle = new BlueShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        Shape blueRectangle = new BlueShapeDecorator(new Rectangle());

        System.out.println("\nCircle with normal border");
        circle.draw();

        System.out.println("\nCircles with colored borders");
        redCircle.draw();
        blueCircle.draw();

        System.out.println("\nRectangles with colored borders");
        redRectangle.draw();
        blueRectangle.draw();
    }
}
