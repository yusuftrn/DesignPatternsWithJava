package structural.decorator.decoratorExample2.decorators;

import structural.decorator.decoratorExample2.shapes.Shape;

public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
