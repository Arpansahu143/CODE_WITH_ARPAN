
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		System.out.println("enter the distance:");
		Scanner sc=new Scanner(System.in);
		int km=sc.nextInt();
		double m=km*100,cm=km*100000;
		
		double f=km*3280.8399,i=km*39370.0787; 
		System.out.println("in meter "+m);
		System.out.println("in feet "+f);
		System.out.println("in inches "+i);
		System.out.println("in centi meters "+cm);
		
	
	}

}
