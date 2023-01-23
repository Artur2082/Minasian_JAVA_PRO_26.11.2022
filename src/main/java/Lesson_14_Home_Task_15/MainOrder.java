package Lesson_14_Home_Task_15;


import java.util.TreeMap;

public class MainOrder {

    public static void main(String[] args) {
        TreeMap<Integer, Order> queue = new TreeMap<>();
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard(queue);
        coffeeOrderBoard.add(new Order(1,"Artur"));
        coffeeOrderBoard.add(new Order(7,"Olga"));
        coffeeOrderBoard.add(new Order(2, "Denis"));
        coffeeOrderBoard.add(new Order(6, "John"));
        coffeeOrderBoard.add(new Order(3,"Ann"));
        coffeeOrderBoard.add(new Order(9,"Tony"));
        System.out.println("Printing all added orders :" + '\n' + queue);
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliverByNumber(3);
        coffeeOrderBoard.draw();
    }
}
