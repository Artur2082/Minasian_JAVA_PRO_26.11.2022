package U_Working_With_Tests;

public class ArraysClass {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 2, 3, 1, 7};
        int[] arr1 = null;
        int[] arr2 = {1, 4, 1, 4, 1, 4};
        int[] arr3 = {2, 3, 5};
        int[] arr5 = {1, 2, 4};
        System.out.println(java.util.Arrays.toString(checkArray(arr)));
        System.out.println(java.util.Arrays.toString(checkArray(arr1)));
        System.out.println(java.util.Arrays.toString(checkArray(arr2)));
        System.out.println(checkArray2(arr2));
        System.out.println(checkArray2(arr5));
        System.out.println(java.util.Arrays.toString(checkArray(arr3)));

    }

    public static int[] checkArray(int[] array) {
        if (array == null) {
            return null;
        }
        int a = 0;
        int[] result = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                a = array[i];
                result = new int[array.length - i - 1];
                for (int j = i + 1, k = 0; j < array.length; j++, k++) {
                    if (array[j] == 4) continue;
                    result[k] = array[j];
                }
            }
        }
        try {
            a = 1 / a;
        } catch (ArithmeticException e) {
            throw new RuntimeException("There is no number 4 in array");
        }
        return result;
    }

    public static boolean checkArray2(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        for (int j : arr) {
            if (j != 1 && j != 4) return false;
        }
        return true;
    }
}
