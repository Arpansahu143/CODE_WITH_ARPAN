package SEM-2-DSA;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0, mul = 1, temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            mul *= digit;
            temp /= 10;
        }

       if(sum==mul){
        System.out.println("spy number.");
       }
       else
           System.out.println("not spy no.");
    }
}