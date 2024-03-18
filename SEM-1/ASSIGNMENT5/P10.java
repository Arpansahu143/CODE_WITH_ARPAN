import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {



		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=1;
		int c=1;
		System.out.println("Enter the range upto which you want the series: ");
		int range=sc.nextInt();
		for(int i=3;i<=range;i++) {
			int sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=c;
			c=sum;



    }
   
}
}
