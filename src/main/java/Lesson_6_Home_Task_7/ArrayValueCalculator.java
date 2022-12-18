package Lesson_6_Home_Task_7;

public class ArrayValueCalculator {
    public static void main(String[] args) {
        int result = 0;
        try {
            result = doCalc(new String[][]{{"1", "a", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}});
        } catch (ArrayDataException | ArraySizeException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            result = doCalc(new String[][]{{"1", "a", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"9", "10", "11", "12"}});
        } catch (ArraySizeException | ArrayDataException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            result = doCalc(new String[][]{{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"9", "10", "11", "12"}});
        } catch (ArraySizeException | ArrayDataException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println(" Sum = " + result);
    }

    static int doCalc(String[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix.length != 4 || matrix[i].length != 4) throw new ArraySizeException(" Make matrix size 4x4");
                try {
                    sum += Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Incorrect array's data at the cell : " + i + ", " + j + " - " + e.getMessage());
                }
            }
        }
        return sum;
    }
}
