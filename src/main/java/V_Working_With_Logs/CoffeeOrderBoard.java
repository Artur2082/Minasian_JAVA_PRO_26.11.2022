package V_Working_With_Logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.TreeMap;

public class CoffeeOrderBoard {
    private final TreeMap<Integer, Order> queue;
    private static final Logger logger = LoggerFactory.getLogger(CoffeeOrderBoard.class);

    public static void main(String[] args) {
        TreeMap<Integer, Order> queue = new TreeMap<>();
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard(queue);
        coffeeOrderBoard.add(new Order(1, "Artur"));
        coffeeOrderBoard.add(new Order(7, "Olga"));
        coffeeOrderBoard.add(new Order(2, "Denis"));
        coffeeOrderBoard.add(new Order(6, "John"));
        coffeeOrderBoard.add(new Order(3, "Ann"));
        coffeeOrderBoard.add(new Order(9, "Tony"));
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliverByNumber(3);
        coffeeOrderBoard.draw();
    }

    public CoffeeOrderBoard(TreeMap<Integer, Order> queue) {
        this.queue = queue;
    }

    public void add(Order order) {
        try {
            if (order.getNumberOrder() > 0) {
                queue.put(order.getNumberOrder(), order);
                logger.info("Adding order to queue : {} ", order);
            } else {
                logger.warn("Number of order can't be negative or 0");
            }
        } catch (NullPointerException e) {
            logger.error("Order can't be null : {}", (Object) e.getStackTrace());
        }
    }

    public void deliver() {
        logger.info("Method deliver first order : {} ", queue.remove(queue.firstKey()));
    }

    public void deliverByNumber(Integer num) {
        try {
            logger.info("Reverse queue :" + '\n' + queue.descendingMap());
            if (queue.containsKey(num)) {
                Order order = queue.get(num);
                logger.info("Result of method - deliver by number {},{} ", num, order);
                queue.remove(num);
            } else {
                logger.warn("There is no order number {} ;", num);
            }
        } catch (NullPointerException e) {
            logger.error("Number of order can't be null : {}", (Object) e.getStackTrace());
        }
    }

    public void draw() {
        for (Order order : queue.values()) {
            logger.info(" {} | {} ", order.getNumberOrder(), order.getName());
        }
    }
}
