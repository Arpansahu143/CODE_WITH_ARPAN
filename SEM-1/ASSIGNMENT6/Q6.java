/*(q6)-Write a java program that prompts the user to enter a string followed by a character and 
displays the number of occurrences of the character in the string. */



package ASSIGNMENT6;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  
        System.out.print("Enter a string: ");
        String S = sc.nextLine();


        System.out.print("Enter a character: ");
        char a = sc.next().charAt(0);

   
        int b = count(S, a);
        System.out.println("Number of occurrences is - " + b);

        sc.close();
    }

    
    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }
}
/*OUTPUT-
 * Enter a string: ENGINEERING
Enter a character: E
Number of occurrences is - 3
 */