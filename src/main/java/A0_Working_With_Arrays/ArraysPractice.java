package A0_Working_With_Arrays;

import java.util.HashMap;
import java.util.Map;


public class ArraysPractice {
    public static void main(String[] args) {
        int[] arr3 = {2, 3, 5, 9, 20};
        System.out.println(java.util.Arrays.toString(checkTwoSum(arr3, 12)));
    }

    // возвращает новый массив индексов у которых сумма их значений между собой дастс число target
    public static int[] checkTwoSum(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int a;
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }
        for (int i = 0; i < array.length; i++) {
            a = target - array[i];
            if (map.containsKey(a) && map.get(a) != i) {
                return new int[]{i, map.get(a)};
            }
        }
        return null;
    }
}
