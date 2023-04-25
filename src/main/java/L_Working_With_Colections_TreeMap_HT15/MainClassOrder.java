package L_Working_With_Colections_TreeMap_HT15;


import java.util.TreeMap;

public class MainClassOrder {

    public static void main(String[] args) {
        TreeMap<Integer, OrderClass> queue = new TreeMap<>();
        CoffeeOrder coffeeOrder = new CoffeeOrder(queue);
        coffeeOrder.add(new OrderClass(1,"Artur"));
        coffeeOrder.add(new OrderClass(7,"Olga"));
        coffeeOrder.add(new OrderClass(2, "Denis"));
        coffeeOrder.add(new OrderClass(6, "John"));
        coffeeOrder.add(new OrderClass(3,"Ann"));
        coffeeOrder.add(new OrderClass(9,"Tony"));
        System.out.println("Printing all added orders :" + '\n' + queue);
        coffeeOrder.deliver();
        coffeeOrder.deliverByNumber(3) ;
        coffeeOrder.draw();
    }
}
