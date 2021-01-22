package structural.bridge.bridgePattern2.shape;

import structural.bridge.bridgePattern2.API.DrawAPI;

public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
