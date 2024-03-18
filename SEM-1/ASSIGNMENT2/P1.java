import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		System.out.println("Enter a degree in Fahrenheit:");
		Scanner sc=new Scanner(System.in);
		int fah=sc.nextInt();
		double Celcious = (fah-32)*(5.0/9);
		System.out.println(fah+" Fahrenheit is:"+ Celcious +" in celcious");

	}

}
 