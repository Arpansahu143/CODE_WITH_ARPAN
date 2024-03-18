
import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=num/100;
		int b=(num/10)%10;
		int c=num%10;
		int sum=a+b+c;
		System.out.println("sum of these digits "+sum);
		
		
	}

}
