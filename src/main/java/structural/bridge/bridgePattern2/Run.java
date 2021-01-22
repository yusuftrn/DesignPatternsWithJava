package structural.bridge.bridgePattern2;

import structural.bridge.bridgePattern2.API.GreenCircle;
import structural.bridge.bridgePattern2.API.RedCircle;
import structural.bridge.bridgePattern2.shape.Circle;
import structural.bridge.bridgePattern2.shape.Shape;

public class Run {

    public static void main(String[] args){
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(25, 25, 8, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
/*OUTPUT:
Drawing Circle [color: red, radius: 10, x: 100, 100]
Drawing Circle[color: green, radius: 8, x: 25, 25]
 */