package W_Patterns.strategy;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double execute(double a, double b) {
        return strategy.countSquare();
    }
}
