
public class cmdp4 {
    public static void main(String[] args) {
    	System.out.println(args[0]);
    	
    	double t=Double.parseDouble(args[0]);
    	double s=Math.cos(5*t)+Math.sin(7*t);
    	
    	System.out.println("Answer is "+s);
    	
        }
}
