package creational.builderPattern.builderpattern.builders;

import creational.builderPattern.builderpattern.cars.CarType;
import creational.builderPattern.builderpattern.components.Engine;
import creational.builderPattern.builderpattern.components.GPSNavigator;
import creational.builderPattern.builderpattern.components.Transmission;
import creational.builderPattern.builderpattern.components.TripComputer;

// The builder interface specifies methods for creating the
// different parts of the product objects.
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
