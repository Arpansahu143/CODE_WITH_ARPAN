import java.util.Scanner;
class HA4
{
public static int product(int n, int m)
{
if(m==1)
return n;
else
return n+product(n, m-1);
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number: ");
int n = sc.nextInt();
System.out.println("Enter the second number: ");
int m = sc.nextInt();
System.out.print("Binary representation is "+product(n,m));
}
}