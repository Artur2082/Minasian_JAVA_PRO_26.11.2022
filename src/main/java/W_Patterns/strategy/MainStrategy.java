package W_Patterns.strategy;

public class MainStrategy {
    public static void main(String[] args) {
        Context context = new Context();
        double a = 2.6;
        double b = 5.8;
        context.setStrategy(new Rectangle(a, b));
        double result1 = context.execute(a, b);
        System.out.println("Rectangle square = " + result1);
        context.setStrategy(new Triangle(a, b));
        double result2 = context.execute(a, b);
        System.out.println("Triangle square = " + result2);
    }
}
