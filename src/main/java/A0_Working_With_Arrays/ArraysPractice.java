package A0_Working_With_Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class ArraysPractice {
    public static void main(String[] args) {
        int[] arr3 = {0, 2, 3, 0, 5, 9, 20};
        System.out.println(java.util.Arrays.toString(checkTwoSum(arr3, 12)));
        int [][] matrix =
                       {{2,4,6},
                        {8,9,5},
                        {1,3,4}};
        System.out.println(diagonalSum(matrix));
        pushZeroes(arr3);
    }

    // возвращает новый массив индексов у которых сумма их значений между собой даст
    // число target
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
    // сумма двух диагоналей матрицы
    public static int diagonalSum (int [][] matrix){
        int sum = 0;
        for(int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--){
          sum += matrix[i][i];
          if(j != i){
              sum += matrix[i][j];
          }
        }
        return sum;
    }
    // передвигание нулей в конец массива
    public static void pushZeroes(int[] array) {
        int count = 0;
        int countNulls = 0;
        while (countNulls < array.length) {
            if (array[countNulls] == 0) {
                countNulls++;
            } else {
                array[count++] = array[countNulls++];
            }
        }
        while (count < array.length) {
            array[count++] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}
