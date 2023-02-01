package Working_With_Multithreding_HT11;

import java.util.Arrays;

public class ValueCalculator {
    public static void main(String[] args) throws InterruptedException {
        arrayMethod();
    }
    private static int sizeArray = 20000000;
    private static float[] array = new float[sizeArray];
    private static int halfArray = sizeArray / 2;
    private static float[] arr1 = new float[halfArray];
    private static float[] arr2 = new float[halfArray];

    public static void arrayMethod() throws InterruptedException {
        long start = System.currentTimeMillis();
        Arrays.fill(array, 1);
        System.arraycopy(array, 0, arr1, 0, halfArray);
        System.arraycopy(array, halfArray, arr2, 0, halfArray);
        Thread thread = new Thread(new MyThread(arr1, "Arr1"));
        thread.start();
        thread.join();
        Thread thread1 = new Thread(new MyThread(arr2, "Arr2"));
        thread1.start();
        thread1.join();
        System.arraycopy(arr1, 0, array, 0, halfArray);
        System.arraycopy(arr2, 0, array, halfArray, halfArray);
        System.out.println(String.format("%s = %d ms", " Execution time ", (System.currentTimeMillis() - start)));
    }
}
