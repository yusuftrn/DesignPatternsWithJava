package structural.bridge.bridgePattern3.Vehicles;

import structural.bridge.bridgePattern3.Implementation.Gear;

public abstract class Vehicle {

    Gear gear;

    public Vehicle(Gear gear){
        this.gear = gear;
    }

    public abstract void addGear();

}
