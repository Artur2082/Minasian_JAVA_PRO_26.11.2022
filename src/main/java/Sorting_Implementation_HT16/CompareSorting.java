package Sorting_Implementation_HT16;

import java.util.Arrays;

public class CompareSorting {
    public static void main(String[] args) {
        QuickSort quick = new QuickSort();
        CocktailSort cocktail = new CocktailSort();
        int length = 100000;
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = QuickSort.getRandomInRange(0, 200);
        }
        int[] arr1 = Arrays.copyOf(array, length);
        long start1 = System.currentTimeMillis();
        quick.quickSort(array, 0, length - 1);
        long finish1 = System.currentTimeMillis();
        System.out.println("Execution time of quick sort : " + (finish1 - start1));
        long start2 = System.currentTimeMillis();
        cocktail.cocktailSort(arr1);
        long finish2 = System.currentTimeMillis();
        System.out.println("Execution time of cocktail sort : " + (finish2 - start2));
    }
}
