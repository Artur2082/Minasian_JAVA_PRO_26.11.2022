package Lesson_14_Home_Task_15;


public class Order implements Comparable<Order>{
    private Integer numberOrder;
    private String name;

    public Order(Integer numberOrder, String name) {
        this.numberOrder = numberOrder;
        this.name = name;
    }

    @Override
    public String toString() {
        return " Order {" +
                "number = " + numberOrder +
                ", name ='" + name + '\'' + '}' + '\n';
    }

    public Integer getNumberOrder() {
        return numberOrder;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Order o) {
        return this.numberOrder - o.getNumberOrder();
    }
}
