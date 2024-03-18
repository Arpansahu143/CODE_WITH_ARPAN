/*(q10)-Write a java program to calculate the area of triangle, square, circle, rectangle by using method 
overloading
*/





package ASSIGNMENT6;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a shape to calculate area:");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println("4. Rectangle");
        System.out.print("Enter your choice (1-4): ");
        
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                
                System.out.print("Enter the base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = sc.nextDouble();
                System.out.println("Area of the triangle: " + calculateArea(base, height));
                break;

            case 2:
                
                System.out.print("Enter the side length of the square: ");
                double side = sc.nextDouble();
                System.out.println("Area of the square: " + calculateArea(side));
                break;

            case 3:
               
                System.out.print("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                double c=calculateArea(radius);
                System.out.println("Area of the circle: " + c);
                break;

            case 4:
                
                System.out.print("Enter the length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = sc.nextDouble();
                System.out.println("Area of the rectangle: " + calculateArea(length, width));
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }


    private static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }


    private static double calculateArea(double side) {
        return side * side;
    }


    private static double calculateArea(double radius) {
        double x=Math.PI*Math.pow(radius,2);
        return x;
    }

    private static double calculateArea(double length, double width) {
        return (length * width);
    }
}

/*OUTPUT-
Choose a shape to calculate area:
1. Triangle
2. Square
3. Circle
4. Rectangle
Enter your choice (1-4): 1
Enter the base of the triangle: 4
Enter the height of the triangle: 3
Area of the triangle: 6.0
*/