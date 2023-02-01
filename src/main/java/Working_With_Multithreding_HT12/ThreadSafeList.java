package Working_With_Multithreding_HT12;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeList implements Runnable {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadSafeList(), "thread1");
        Thread thread2 = new Thread(new ThreadSafeList(), "thread2");
        thread1.start();
        thread2.start();
    }
    List<String> list;
    public ThreadSafeList() {
        this.list = new CopyOnWriteArrayList<>();
    }

    @Override
    public void run() {
        System.out.println("Start " + Thread.currentThread().getName());
        list.add("One");
        list.add("Two");
        list.add("Three");
        System.out.println(list);
        System.out.println("Getting index 1 = " + list.get(1));
        list.remove(2);
        System.out.println("list after removing = " + list);
    }
}


