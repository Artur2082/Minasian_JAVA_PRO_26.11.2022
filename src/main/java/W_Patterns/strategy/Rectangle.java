package W_Patterns.strategy;

public class Rectangle implements Strategy {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double countSquare() {
        return sideA * sideB;
    }
}
