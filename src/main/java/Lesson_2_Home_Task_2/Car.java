package Lesson_2_Home_Task_2;

public class Car {
    public static void main(String[] args) {
        Car engine = new Car();
        engine.start();
    }
    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }
    private void startElectricity(){
        System.out.println("Run starter");
    }
    private void startCommand(){
        System.out.println("Run engine rotation");
    }
    private void startFuelSystem(){
        System.out.println("Ignition fuel in engine");
    }
}

