public class P6C {
    public static void main(String[] args) {
        int row = 5, c = 1;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }

            System.out.println();
        }
    }
}
