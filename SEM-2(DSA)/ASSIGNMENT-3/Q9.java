
import java.util.Scanner;
class Q9
{
public static String reverse(int n)
{
if(n==0)
return "";
else
return n%10+reverse(n/10);
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number: ");
int n = sc.nextInt();
System.out.print("Reverse number is: "+reverse(n));
}
}