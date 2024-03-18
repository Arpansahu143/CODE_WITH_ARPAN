
import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		
		
		int t=sc.nextInt();
		double g=32.174;
		double a=1.0/2*g*(Math.pow(t,2));
		
		System.out.println( "DISTANCE IS "+a);

	}

}
