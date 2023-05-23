package W_Patterns.builder;

import W_Patterns.builder.carComponents.CarType;
import W_Patterns.builder.carComponents.Engine;
import W_Patterns.builder.carComponents.GPSNavigator;
import W_Patterns.builder.carComponents.Transmission;

public class CarManualBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual result() {
        return new Manual(type, seats, engine, transmission, gpsNavigator);
    }
}
