package structural.composite.compositeExample3.shapes;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

    private List<Shape> shapeList = new ArrayList<>();

    public void add(Shape shape){
        shapeList.add(shape);
    }

    public void remove(Shape shape){
        shapeList.remove(shape);
    }

    public void clear(){
        System.out.println("Clearing all the shapes from drawing");
        this.shapeList.clear();
    }

    @Override
    public void draw(String fillColor) {
        for(Shape shape : shapeList){
            shape.draw(fillColor);
        }
    }
}
