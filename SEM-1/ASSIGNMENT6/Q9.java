/*(q9)-Write a program that prompts the user to enter a password and displays Valid Password if the 
rules are followed or Invalid Password otherwise.
*/

package ASSIGNMENT6;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String a = scanner.nextLine();

     
        if (isValidPassword(a)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

       
        scanner.close();
    }

  
 public static boolean isValidPassword(String password) {
      
        if (password.length() < 8) {
            return false;
        }

      
        if (!password.matches("[a-z, A-Z ,0-9]+")) {
            return false;
        }

        
        int j = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
               j++;
            }
        }

        return j >= 2;
    }
}

/*OUTPUT-
Enter your password: Arpansahu123456
Valid Password
*/