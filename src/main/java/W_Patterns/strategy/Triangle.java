package W_Patterns.strategy;

public class Triangle implements Strategy {
    private double sideA;
    private double height;

    public Triangle(double sideA, double height) {
        this.sideA = sideA;
        this.height = height;
    }

    @Override
    public double countSquare() {
        return 0.5 * sideA * height;
    }
}
