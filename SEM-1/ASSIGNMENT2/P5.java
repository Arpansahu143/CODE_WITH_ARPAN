
import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		System.out.println("Enter the radius of hemisphere:");
		Scanner sc=new Scanner(System.in);
		
		int r=sc.nextInt();
		double a=3*Math.PI*(Math.pow(r,2));
		double v=(2.0/3)*Math.PI*(Math.pow(r,3));
		
		
		System.out.println("area of the hemisphere is "+a);
		System.out.println("Volume of the hemisphere is "+v);
		
	}

}
