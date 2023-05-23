package W_Patterns.abstractFactory;

public class MainFurniture {
    public static void main(String[] args) {
        Factory factory = FactoryProducer.getFactory();
        Furniture furniture = factory.getType("chair");
        furniture.create();
        Furniture furniture1 = factory.getType("sofa");
        furniture1.create();
    }
}
