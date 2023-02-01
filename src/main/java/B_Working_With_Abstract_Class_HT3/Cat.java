package B_Working_With_Abstract_Class_HT3;

public class Cat extends Animals {
private static int catCount;

    public Cat(String name) {
        super(name);
        catCount++;
    }
     public static int getCatCount() {
        return catCount;
   }
    @Override
    public void run(int length) {
        if(length > 0 && length <= 200){
            System.out.println(name + " run - " + length + " m;");
        }else {
            System.out.println(name + " can not run such distance;");
        }
    }
    @Override
    public void swim(int length) {
        System.out.println(name + " can not swim;");
    }
}
