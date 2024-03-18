
import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		System.out.println("enter salary:");
		Scanner sc=new Scanner(System.in);
		double sal=sc.nextDouble();
	double da=(sal*40/100), HRA=(sal*20/100);
	double sum=sal+HRA+da;
	System.out.println("da is "+da);
	System.out.println("hra is "+HRA);
	System.out.println("gross salary is "+sum);
	}

}
