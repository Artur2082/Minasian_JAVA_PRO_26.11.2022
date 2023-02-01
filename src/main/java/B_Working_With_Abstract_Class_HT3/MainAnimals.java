package B_Working_With_Abstract_Class_HT3;

public class MainAnimals {
    public static void main(String[] args) {
        Dog bobic = new Dog("Bobic");
        bobic.run(250);
        bobic.swim(7);
        Dog miki = new Dog("Miki");
        miki.run(450);
        miki.swim(8);
        Cat kitty = new Cat("Kitty");
        kitty.run(120);
        kitty.swim(6);
        Cat barsik = new Cat("Barsik");
        barsik.run(100);
        barsik.swim(2);
        System.out.println("Cats amount = " + Cat.getCatCount());
        System.out.println("Dogs amount = " + Dog.getDogCount());
        System.out.println("All animals amount = " + (Cat.getCatCount() + Dog.getDogCount()));
    }
}
