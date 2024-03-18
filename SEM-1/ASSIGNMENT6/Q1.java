/*(Question 1)-Design a Simple Calculator using methods in java containing the following functionalities, 
namely, with Addition, Subtraction, Multiplication, Remainder, Division and Square Root.*/


package ASSIGNMENT6;
import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

  System.out.print("Choose operation: ");
       char ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                System.out.println("Result: " + add(num1, num2));
                break;
            case '-':
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case '*':
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case '/':
                System.out.println("Result: " + divide(num1, num2));
                break;
            case '%':
                System.out.println("Result: " + remainder(num1, num2));
                break;
            case 'r':
                System.out.println("Result: " + squareRoot(num1));
                break;
            default:
                System.out.println("choice is invalid.");
        }
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


    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println(" Cannot divide by zero");
            return Double.NaN; //NaN=Not a number
        }
    }

    
    public static double remainder(double num1, double num2) {
        return num1 % num2;
    }

   
    public static double squareRoot(double num) {
        if (num >= 0) {
            return Math.sqrt(num);
        } else {
            System.out.println("Cannot find square root of a negative number");
            return Double.NaN; //NaN=Not a number
        }
    }
}
//NaN=Not a number
/* 
output-
Enter first number: 1
Enter second number: 2
Choose operation: +
Result: 3.0*/