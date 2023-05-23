package W_Patterns.factory;

public class Bed implements Furn{
    @Override
    public void create() {
        System.out.println("Created bed !");
    }
}
