package L_Working_With_Colections_TreeMap_HT15;


import java.util.Objects;

public class Order {
    private Integer numberOrder;
    private String name;

    public Order(Integer numberOrder, String name) {
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
        Order order = (Order) o;
        return numberOrder.equals(order.numberOrder) && name.equals(order.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOrder, name);
    }
}
