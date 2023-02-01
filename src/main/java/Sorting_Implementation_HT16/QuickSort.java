package Sorting_Implementation_HT16;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomInRange(0, 200);
        }
        System.out.println("Unsorted :" + Arrays.toString(array));
        sort.quickSort(array, 0, 9);
        System.out.println("Sorted :" + Arrays.toString(array));
    }

    public void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int index = partition(arr, begin, end);
            quickSort(arr, begin, index - 1);
            quickSort(arr, index + 1, end);
        }
    }
    public int partition(int[] arr, int begin, int end) {
        int startPoint = arr[end];
        int index = (begin - 1);
        for (int j = begin; j <= end; j++) {
            if (arr[j] < startPoint) {
                index++;
                int temp = arr[index];
                arr[index] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[index + 1];
        arr[index + 1] = arr[end];
        arr[end] = temp;
        return index + 1;
    }
    public static int getRandomInRange(int begin, int end) {
        double random = Math.random();
        return (int) (random * (end - begin + 1)) + begin;
    }
}
