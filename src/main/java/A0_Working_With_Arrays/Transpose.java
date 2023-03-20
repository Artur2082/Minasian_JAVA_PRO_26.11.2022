package A0_Working_With_Arrays;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        transpose(4, 5);

    }
    public static void transpose(int M, int N) {
        int[][] matrix = new int[M][N];
        int[][] trMatrix = new int[N][M];
        System.out.println("Matrix");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = i * M + j;
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("Transposed matrix");
        for (int i = 0; i < trMatrix.length; i++) {
            for (int j = 0; j < trMatrix[i].length; j++) {
                trMatrix[i][j] = matrix[j][i];

            }
            System.out.println(Arrays.toString(trMatrix[i]));
        }
    }
}
