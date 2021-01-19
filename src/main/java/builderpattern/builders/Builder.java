package builderpattern.builders;

import builderpattern.cars.CarType;
import builderpattern.components.Engine;
import builderpattern.components.GPSNavigator;
import builderpattern.components.Transmission;
import builderpattern.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
