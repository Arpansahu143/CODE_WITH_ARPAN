import java.util.Scanner;
public class HA4 {

	public static void main(String[] args) {
		double sum=0.0d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		int x=sc.nextInt();
		System.out.println("Enter the number of terms: ");
		int n=sc.nextInt();
		int p=0;
		double r=Math.toRadians(x);
		for(int i=1;i<=n;i++) {
			int f=1;
			for(int j=p;j>=1;j--) {
				f*=j;
			}
			
			double power=Math.pow(r, p);
			if(i%2==0)
				sum=sum-(power)/f;
			else
				sum=sum+(power)/f;
			p+=2;
		}
		System.out.println("cos("+x+")="+sum);

	}

}