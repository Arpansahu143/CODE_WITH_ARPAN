import java.util.*;
public class Q1
{
public void input()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your lucky number:");
int no = sc.nextInt();
if(no<0)
throw new NumberFormatException("Negative number");
else
System.out.println("Your lucky number is "+no);
}
public static void main(String[] args)
{
Q1 q = new Q1();
try
{
q.input();
}
catch(NumberFormatException e)
{
System.out.println(e);
}
}
}