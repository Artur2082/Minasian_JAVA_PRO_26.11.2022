package W_Patterns.factory;

public class MainFurn {
    public static void main(String[] args) {
        FactoryFurn factoryFurn = new FactoryFurn();
        Furn furn = factoryFurn.furniture("table");
        furn.create();
        Furn furn1 = factoryFurn.furniture("bed");
        furn1.create();
    }
}
