package W_Patterns.builder;

import W_Patterns.builder.carComponents.CarType;
import W_Patterns.builder.carComponents.Engine;
import W_Patterns.builder.carComponents.GPSNavigator;
import W_Patterns.builder.carComponents.Transmission;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
