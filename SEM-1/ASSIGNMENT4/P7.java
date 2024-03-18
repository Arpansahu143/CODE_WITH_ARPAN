import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Multiplication table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " \u00d7 " + i + " = " + (n * i));
        }

        scanner.close();
    }
}
