package creational.builderpattern.builders;

import creational.builderpattern.cars.CarType;
import creational.builderpattern.components.Engine;
import creational.builderpattern.components.GPSNavigator;
import creational.builderpattern.components.Transmission;
import creational.builderpattern.components.TripComputer;

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
