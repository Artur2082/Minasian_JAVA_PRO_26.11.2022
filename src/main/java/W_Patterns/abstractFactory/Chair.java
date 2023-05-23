package W_Patterns.abstractFactory;

public class Chair implements Furniture {
    @Override
    public void create() {
        System.out.println("Created chair !");
    }
}
