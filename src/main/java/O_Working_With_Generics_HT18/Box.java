package O_Working_With_Generics_HT18;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    List<T> fruitList = new ArrayList<>();

    void addOneFruit(T fr) {
        fruitList.add(fr);
    }

    void addFruits(int amount, T fr) {
        for (int i = 0; i < amount; i++) {
            fruitList.add(fr);
        }
        System.out.println(fruitList);
    }

    float getWeight() {
        if (fruitList.size() == 0) {
            return 0;
        }
        return fruitList.size() * fruitList.get(0).getFruitWeight();
    }

    boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void merge(Box<T> box) {
        this.fruitList.addAll(box.fruitList);
        System.out.println("Merging boxes :" + '\n' + fruitList);
    }
}
