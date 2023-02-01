package H_Working_With_Multithreding_HT11;

public class MyThread extends Thread {
    private float[] array;
    private String nameArray;

    public MyThread(float[] array, String nameArray) {
        this.array = array;
        this.nameArray = nameArray;
    }

    @Override
    public void run() {
        System.out.println(" Running thread - " + nameArray);
        for (int j = 0; j < array.length; j++) {
            array[j] = (float) (array[j] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
        }
    }
}
