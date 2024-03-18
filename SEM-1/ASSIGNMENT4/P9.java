import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();

        int num = n, result = 0, placeValue = 1;

        while (n != 0) {
            int lastDigit = n % 10;
            if (lastDigit != 0) {
                result += lastDigit * placeValue;
                placeValue *= 10;
            }
            n /= 10;
        }

        System.out.println("After removing 0 from number " + num + ", the new number is " + result);

        sc.close();
    }
}
