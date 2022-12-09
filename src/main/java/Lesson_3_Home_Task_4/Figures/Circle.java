package Lesson_3_Home_Task_4.Figures;

public class Circle implements Figure {
    private int radius;
    private final double pi = 3.14;
    private static double squareCircle;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        squareCircle = pi * Math.pow(radius, 2);
        return squareCircle;
    }
}
