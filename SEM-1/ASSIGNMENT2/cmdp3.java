
public class cmdp3 {

	public static void main(String[] args) {
		int min=Integer.parseInt(args[0]);
		int max=Integer.parseInt(args[1]);
		int a=(int)(Math.random()*(max-min+1))+min;
		int b=(int)(Math.random()*(max-min+1))+min;
		int sum=a+b;
		System.out.println("a= "+a+" b= "+b);
		System.out.println("sum of the 2 values is "+sum);
		
		

	}

}
