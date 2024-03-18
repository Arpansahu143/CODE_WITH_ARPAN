/*(Question 1)-Design a Simple Calculator using methods in java containing the following functionalities, 
namely, with Addition, Subtraction, Multiplication, Remainder, Division and Square Root.*/

package ASSIGNMENT6;
import java.util.Scanner;

public class Q1_without_user_input{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        
        double sum = add(num1, num2);
        System.out.println("Sum: " + sum);

     
        double difference = subtract(num1, num2);
        System.out.println("Difference: " + difference);

        
        double product = multiply(num1, num2);
        System.out.println("Product: " + product);

       
        double remainderResult = remainder(num1, num2);
        System.out.println("Remainder: " + remainderResult);

       
        double divisionResult = divide(num1, num2);
        System.out.println("Division: " + divisionResult);

        
        System.out.println("Square Root of "+num1 +" is " + squareRoot(num1));

        scanner.close();
    }

    
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    
    public static double remainder(double num1, double num2) {
        return num1 % num2;
    }

    
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN; 
        }
    }

   
    public static double squareRoot(double num) {
        if (num >= 0) {
            return Math.sqrt(num);
        } else {
            System.out.println("Cannot calculate square root of a negative number.");
            return Double.NaN;
        }
    }
}





/*output- 
Enter the first number: 10
Enter the second number: 2
Sum: 12.0
Difference: 8.0
Product: 20.0
Remainder: 0.0
Division: 5.0
Square Root of 10.0 is 3.1622776601683795*/