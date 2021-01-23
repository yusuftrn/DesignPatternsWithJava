package structural.bridge.bridgePattern3.Vehicles;

import structural.bridge.bridgePattern3.Implementation.Gear;

public class Truck extends Vehicle {

    public Truck(Gear gear){
        super(gear);
        //initialize various other Truck components to make the car
    }

    @Override
    public void addGear() {
        System.out.print("Truck handles: ");
        gear.handleGear();
    }
}
