package L_Working_With_Colections_TreeMap_HT15;
import java.util.Objects;

public class OrderClass {
    private final Integer numberOrder;
    private final String name;

    public OrderClass(Integer numberOrder, String name) {
        this.numberOrder = numberOrder;
        this.name = name;
    }

    @Override
    public String toString() {
        return " Order {" +
                " number = " + numberOrder +
                ", name ='" + name + '\'' + '}' + '\n';
    }

    public Integer getNumberOrder() {
        return numberOrder;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderClass order = (OrderClass) o;
        return numberOrder.equals(order.numberOrder) && name.equals(order.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOrder, name);
    }
}
