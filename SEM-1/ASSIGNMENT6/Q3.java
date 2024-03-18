/*(Question-3)Write a java program that prompts the user to enter an integer and reports 
whether the integer is a palindrome.*/


package ASSIGNMENT6;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter an Number: ");
        int n = sc.nextInt();

  
        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }
        sc.close();
    }

   
    public static int reverse(int n) {
        int reversedNumber = 0;
        while (n != 0) {
            int d = n % 10;
            reversedNumber = reversedNumber * 10 + d;
            n /= 10;
        }
        return reversedNumber;
    }

    
    public static boolean isPalindrome(int n) {
        
        return n == reverse(n);
    }
}
/*output-
 * Enter an Number: 121
121 is a palindrome.
 */