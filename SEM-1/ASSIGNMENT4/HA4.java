import java.util.Scanner;

public class HA4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int a = 0;
        long b = 1L;

        for (int i = 1; i <= n; i++) {
            if ((i & 1) == 0) a+= i;
            else b *= i;
        }

        System.out.println("Sum of all even numbers is: " + a);
        System.out.println("Product of all odd numbers is: " + b);

        sc.close();
    }
}
