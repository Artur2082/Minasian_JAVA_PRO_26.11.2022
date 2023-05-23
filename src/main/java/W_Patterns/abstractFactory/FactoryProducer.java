package W_Patterns.abstractFactory;

public class FactoryProducer {
    public static Factory getFactory (){
            return new FurnitureFactory();
    }
}
