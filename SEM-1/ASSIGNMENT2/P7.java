
import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		System.out.println("Enter 2 number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
	
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a,b));
		a++;
		b++;
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a,b));
		a++;
		b++;
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a,b));
		a++;
		b++;
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a,b));
		a++;
		b++;
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a,b));
		a++;
		b++;
sc.close();
	}

}

