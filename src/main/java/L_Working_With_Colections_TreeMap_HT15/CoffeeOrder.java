package L_Working_With_Colections_TreeMap_HT15;

import java.util.*;

public class CoffeeOrder {
    private TreeMap<Integer, OrderClass> queue;

    public CoffeeOrder(TreeMap<Integer, OrderClass> queue) {
        this.queue = queue;
    }

    public void add(OrderClass order) {
        queue.put(order.getNumberOrder(), order);
    }

    public void deliver() {
        System.out.println("First " + queue.remove(queue.firstKey()));
    }

    public void deliverByNumber(Integer num) {
        System.out.println("Reverse queue :" + '\n' + queue.descendingMap());
        if (queue.containsKey(num)) {
            OrderClass order = queue.get(num);
            queue.remove(num);
            System.out.println("Delivering number " + num + " - " + order);
        } else {
            System.out.println("There is no order number " + num + ";");
        }
    }

    public void draw() {
        for (OrderClass order : queue.values()) {
            System.out.println(order.getNumberOrder() + " | " + order.getName());
        }
    }
}
