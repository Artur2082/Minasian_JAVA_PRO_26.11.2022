package Lesson_11_Home_Task_12;

public class MainPetrolStation {
    private static final int SIZE = 3;

    public static void main(String[] args) throws InterruptedException {
        PetrolAmount amount = new PetrolAmount(500);
        Thread[] thread = new Thread[SIZE];
        thread[0] = new Thread(new PetrolStation(amount, 50), "Car 1 - ");
        thread[1] = new Thread(new PetrolStation(amount, 60), "Car 2 - ");
        thread[2] = new Thread(new PetrolStation(amount, 70), "Car 3 - ");
        for (int i = 0; i < SIZE; i++) {
            thread[i].start();
        }
    }
}
