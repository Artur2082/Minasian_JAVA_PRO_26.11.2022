package O_Working_With_Generics_HT18;

public class MainFruit {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Apple> appleBox = new Box<>();
        appleBox.addOneFruit(apple);
        appleBox.addFruits(5, apple);
        System.out.println("Weight of apple box = " + appleBox.getWeight());
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addOneFruit(orange);
        orangeBox.addFruits(4, orange);
        System.out.println("Weight of orange box = " + orangeBox.getWeight());
        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.addFruits(3, orange);
        System.out.println("Comparing boxes :" + '\n' + appleBox.compare(orangeBox));
        orangeBox.merge(orangeBox2);
    }
}
