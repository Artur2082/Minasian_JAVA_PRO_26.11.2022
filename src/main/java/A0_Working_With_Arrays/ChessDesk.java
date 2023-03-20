package A0_Working_With_Arrays;

import java.util.Arrays;

public class ChessDesk {
    public static void main(String[] args) {
        String[][] matrix = new String[8][8];
        String a = "B";
        String b = "W";
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new String[8];
            for (int j = 0; j < matrix.length; j++) {
                if ((i + j) % 2 == 0) {
                    matrix[i][j] = a;
                } else {
                    matrix[i][j] = b;
                }
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}




