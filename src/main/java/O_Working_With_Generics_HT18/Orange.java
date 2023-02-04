package O_Working_With_Generics_HT18;

public class Orange extends Fruit {
    float weight = 1.5F;

    public Orange() {
        super.weight = this.weight;
    }

    @Override
    public String toString() {
        return "Orange";
    }
}
