package O_Working_With_Generics_HT18;

import java.util.ArrayList;
import java.util.List;

public class ToListMethod {
    public static void main(String[] args) {
        int[] arrayValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ToListMethod method = new ToListMethod();
        System.out.println("List : " + method.toList(arrayValues));
    }

    public List<Integer> toList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (Integer value : array) {
            list.add(value);
        }
        return list;
    }
}
