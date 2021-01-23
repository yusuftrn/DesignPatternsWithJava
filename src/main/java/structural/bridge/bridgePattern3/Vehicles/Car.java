package structural.bridge.bridgePattern3.Vehicles;

import structural.bridge.bridgePattern3.Implementation.Gear;

public class Car extends Vehicle {

    public Car(Gear gear){
        super(gear);
        //initialize various other Car components to make the car
    }

    @Override
    public void addGear() {
        System.out.print("Car handles: ");
        gear.handleGear();
    }
}
