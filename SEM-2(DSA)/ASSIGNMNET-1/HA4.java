import java.util.Scanner;

public class HA4 {
    public static  double[][] addMatrix(double[][] a, double[][] b) {
        int row = a.length, col = a[0].length;
        double[][] result = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        double[][] matrixA = {{1.5, 2.0, 3.0},
                              {4.0, 5.5, 6.0},
                              {2.0, 4.0, 1.5}};

        double[][] matrixB = {{2.0, 2.5, 3.5},
                              {4.5, 4.0, 3.5},
                              {5.5, 4.5, 4.0}};

        double[][] sum = addMatrix(matrixA, matrixB);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);
        System.out.println("\nResult:");
        displayMatrix(sum);

    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
