package Working_With_Abstract_Class_HT3;

public class Dog extends Animals {
    private static int dogCount;
    public Dog(String name) {
        super(name);
        dogCount++;
    }
    public static int getDogCount() {
        return dogCount;
    }
    @Override
    public void run(int length) {
        if (length > 0 && length <= 500) {
            System.out.println(name + " run - " + length + " m;");
        }else {
            System.out.println(name + " can not run such distance;");
        }
    }
    @Override
    public void swim(int length) {
        if (length > 0 && length <= 10 ){
            System.out.println(name +" swam - " + length + " m;");
        }else {
            System.out.println("Dogs can swim only under 10 m;");
        }
    }
}
