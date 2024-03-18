import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int sum = 0;
        
        for (int i = a; i <= b; i = i + c){
            sum += i;
            System.out.println(i + " ");
        }

        System.out.println();
        System.out.print("The sum of displayed numbers is: " + sum);

        sc.close();
    }
}