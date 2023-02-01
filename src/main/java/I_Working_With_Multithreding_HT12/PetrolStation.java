package I_Working_With_Multithreding_HT12;

public class PetrolStation implements Runnable {
    private final PetrolAmount amount;
    private int fuel;

    public PetrolStation(PetrolAmount petrolAmount, int fuel) {
        this.amount = petrolAmount;
        this.fuel = fuel;
    }

    @Override
    public void run() {
        System.out.println("Starting refuel " + Thread.currentThread().getName() + fuel + " liters");
        try {
            int duration = getRandomInRange(3000, 10000);
            Thread.sleep(duration);
            int remainder = doRefuel();
            if (remainder <= 0) {
                System.out.println("Can not refuel " + Thread.currentThread().getName() + " petrol station is empty !");
            } else {
                System.out.println("Finished refuel " + Thread.currentThread().getName() + " Petrol station remainder  " + remainder + " liters");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private synchronized int doRefuel() {
        amount.setAmount(amount.getAmount() - fuel);
        return amount.getAmount();
    }

    public static int getRandomInRange(int begin, int end) {
        double random = Math.random();
        return (int) (random * (end - begin + 1)) + begin;
    }
}
