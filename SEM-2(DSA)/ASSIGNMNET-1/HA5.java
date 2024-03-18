import java.util.Random;

public class HA5 {

    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        // Fill the matrix with random 0s and 1s
        fillMatrix(matrix);

        // Print the matrix
        System.out.println("Generated Matrix:");
        printMatrix(matrix);

        // Find the row and column with the most 1s
        int maxOnesRow = findRowWithMostOnes(matrix);
        int maxOnesColumn = findColumnWithMostOnes(matrix);

        System.out.println("Row with most 1s: " + maxOnesRow);
        System.out.println("Column with most 1s: " + maxOnesColumn);
    }

    // Method to fill the matrix with random 0s and 1s
    public static void fillMatrix(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(2); // Generates 0 or 1
            }
        }
    }

    // Method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to find the row with the most 1s
    public static int findRowWithMostOnes(int[][] matrix) {
        int maxOnes = 0;
        int rowWithMostOnes = -1;

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxOnes) {
                maxOnes = count;
                rowWithMostOnes = i;
            }
        }
        return rowWithMostOnes;
    }

    // Method to find the column with the most 1s
    public static int findColumnWithMostOnes(int[][] matrix) {
        int maxOnes = 0;
        int columnWithMostOnes = -1;

        for (int j = 0; j < matrix[0].length; j++) {
            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxOnes) {
                maxOnes = count;
                columnWithMostOnes = j;
            }
        }
        return columnWithMostOnes;
    }
}