package Sorting_Implementation_HT16;

import java.util.Arrays;

public class CocktailSort {
    public static void main(String[] args) {
        CocktailSort sort = new CocktailSort();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = QuickSort.getRandomInRange(-200, 200);
        }
        System.out.println("Unsorted :" + Arrays.toString(array));
        sort.cocktailSort(array);
        System.out.println("Sorted :" + Arrays.toString(array));
    }

    public void cocktailSort(int[] array) {
        boolean sorted = true;
        int start = 0;
        int end = array.length;
        while (sorted) {
            sorted = false;
            for (int i = start; i < end - 1; ++i) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = true;
                }
            }
            if (!sorted) {
                break;
            }
            sorted = false;
            end = end - 1;
            for (int i = end - 1; i >= start; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = true;
                }
            }
            start = start + 1;
        }
    }
}
