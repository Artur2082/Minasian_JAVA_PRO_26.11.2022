package W_Patterns.builder;

import W_Patterns.builder.carComponents.Car;

public class MainCars {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.cityCar(carBuilder);
        Car car = carBuilder.result();
        System.out.println("Car built:\n" + car.getCarType());
        director.cityCar(manualBuilder);
        Manual carManual = manualBuilder.result();
        System.out.println("\nCar manual built:\n" + carManual.print());

        director.sportsCar(carBuilder);
        Car car1 = carBuilder.result();
        System.out.println("Car built:\n" + car1.getCarType());
        director.sportsCar(manualBuilder);
        Manual carManual1 = manualBuilder.result();
        System.out.println("\nCar manual built:\n" + carManual1.print());
    }
}
