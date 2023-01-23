package Lesson_14_Home_Task_15;

import java.util.*;

public class CoffeeOrderBoard {
    private TreeMap<Integer, Order> queue;

    public CoffeeOrderBoard(TreeMap<Integer, Order> queue) {
        this.queue = queue;
    }

    public void add(Order order) {
        queue.put(order.getNumberOrder(), order);
    }

    public void deliver() {
        Order order = queue.get(queue.firstKey());
        queue.remove(queue.firstKey());
        System.out.println("First " + order);
    }

    public void deliverByNumber(Integer num) {
        if (queue.containsKey(num)) {
            Order order = queue.get(num);
            queue.remove(num);
            System.out.println("Delivering number " + num + " - " + order);
        } else {
            System.out.println("There is no order number " + num + ";");
        }
    }

    public void draw() {
        for (Order order : queue.values()) {
            System.out.println(order.getNumberOrder() + "|" + order.getName());
        }
    }
}
