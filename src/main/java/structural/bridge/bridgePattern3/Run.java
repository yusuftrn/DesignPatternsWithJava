package structural.bridge.bridgePattern3;

import structural.bridge.bridgePattern3.Implementation.AutoGear;
import structural.bridge.bridgePattern3.Implementation.Gear;
import structural.bridge.bridgePattern3.Implementation.ManualGear;
import structural.bridge.bridgePattern3.Vehicles.Car;
import structural.bridge.bridgePattern3.Vehicles.Truck;
import structural.bridge.bridgePattern3.Vehicles.Vehicle;

public class Run {

    public static void main(String[] args){

        Gear gear = new ManualGear();
        Vehicle vehicle = new Car(gear);
        vehicle.addGear();

        gear = new AutoGear();
        vehicle = new Car(gear);
        vehicle.addGear();

        gear = new ManualGear();
        vehicle = new Truck(gear);
        vehicle.addGear();

        gear = new AutoGear();
        vehicle = new Truck(gear);
        vehicle.addGear();
    }
}

/*
Car handles: Manual Gear
Car handles: Auto Gear
Truck handles: Manual Gear
Truck handles: Auto Gear
 */