
public class cmdp1 {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int remainder=a%b;
		int quotient=a/b;
		System.out.println("The remainder is: "+remainder);
		System.out.println("The quotient is: "+quotient);

	}

}
