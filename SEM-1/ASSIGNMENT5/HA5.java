import java.util.Scanner;
public class HA5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int n=sc.nextInt();
		int a=0,b=1;
		if(n==1)
			System.out.println("The fibonacci series"+1+" is: "+a);
		if(n==2)
			System.out.println("The fibonacci series"+2+" is: "+a+","+b);
		else
			System.out.print("The fibonacci series "+n+" is: "+a+","+b);
		int i=3;
		while(i<=n) {
			int sum=a+b;
			System.out.print(sum);
			a=b;
			b=sum;
			i++;
		}
	}		
	

}