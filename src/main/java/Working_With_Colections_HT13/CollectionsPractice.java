package Working_With_Colections_HT13;

import java.util.*;

public class CollectionsPractice {
    private static int count;

    public static void main(String[] args) {
        List<String> products = new ArrayList<>(Arrays.asList("apple", "pear", "coconut", "hazelnut", "pear",
                "mango", "berry", "pear", "lemon", "carrot", "garlic", "pine"));
        int[] arrayValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5));
        countOccurance(products, "pear");
        toList(arrayValues);
        System.out.println("Unique numbers = " + findUnique(numbers));
        calcOccurance(products);
        findOccurance(products);
    }

    public static void countOccurance(List<String> list, String name) {
        for (String s : list) {
            if (s.contains(name)) {
                count++;
            }
        }
        System.out.println("Number of coincidences of - " + name + " = " + count);
    }

    public static void toList(int[] array) {
        System.out.println("Array : " + Arrays.toString(array));
        List<Integer> list = new ArrayList<>();
        for (Integer value : array) {
            list.add(value);
        }
        System.out.println("List: " + list);
    }

    public static Set findUnique(List<Integer> list) {
        return new HashSet<>(list);
    }

    public static void calcOccurance(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            Integer count = map.get(s);
            if (count == null) {
                count = 0;
            }
            map.put(s, count + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void findOccurance(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            Integer count = map.get(s);
            if (count == null) {
                count = 0;
            }
            map.put(s, count + 1);
        }
        System.out.println(Arrays.toString(map.entrySet().toArray()));
    }
}


