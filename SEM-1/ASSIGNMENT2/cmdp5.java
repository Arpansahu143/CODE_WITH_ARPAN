
public class cmdp5 {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		
		
		
		System.out.println("in ascending order= "  );
		System.out.println(Math.min(a, Math.min(c, b))  );
		System.out.println(Math.max(a, Math.min(c, b))  );
		System.out.println(Math.max(a, Math.max(c, b))  );
		

	}

}
