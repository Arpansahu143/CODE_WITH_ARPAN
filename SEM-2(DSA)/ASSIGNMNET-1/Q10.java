import java.util.Scanner;

public class Q10 {
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (double[] row : m) {
            sum += row[columnIndex];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = 3, col = 4;
        double[][] arr = new double[row][col];

        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < col; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(arr, i));
        }

        sc.close();
    }
}