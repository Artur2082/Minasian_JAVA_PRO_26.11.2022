package V_Working_With_Logs;

import java.util.Objects;

public class Order {
    private final Integer number;
    private final String name;

    public Order(Integer number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return " Order {" +
                " number = " + number +
                ", name ='" + name + '\'' + '}' + '\n';
    }

    public Integer getNumberOrder() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return number.equals(order.number) && name.equals(order.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }
}
