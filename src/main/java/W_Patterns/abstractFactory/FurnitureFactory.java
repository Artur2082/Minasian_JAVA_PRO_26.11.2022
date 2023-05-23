package W_Patterns.abstractFactory;

public class FurnitureFactory extends Factory {
    @Override
    Furniture getType(String type) {
        if(type.equalsIgnoreCase("Chair")){
            return new Chair();
        } else if (type.equalsIgnoreCase("Sofa")) {
            return new Sofa();
        }
        return null;
    }
}
