public class HA3 {
    public static void main(String[] args) {
        int c = 0;
        for (int i = 1000; i <= 2000; i++) {
            System.out.print(i + " ");
            if (++c % 5 == 0) System.out.println();
        }
    }
}