package W_Patterns.builder;

import W_Patterns.builder.carComponents.CarType;
import W_Patterns.builder.carComponents.Engine;
import W_Patterns.builder.carComponents.GPSNavigator;
import W_Patterns.builder.carComponents.Transmission;

public class Director {
    public void cityCar (Builder builder){
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(4);
        builder.setEngine(new Engine(1.5, 135.567));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setGPSNavigator(new GPSNavigator());
    }
    public void sportsCar(Builder builder){
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0.0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
