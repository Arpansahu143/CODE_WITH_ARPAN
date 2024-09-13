import java.util.Scanner;
public class Q8
{
public static int pow(int base, int power)
{
if(base == 0)
return 0;
else if(power == 0)
return 1;
else
return base*pow(base,power-1);
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the base: ");
int base = sc.nextInt();
System.out.println("Enter the power: ");
int power = sc.nextInt();
System.out.println(base+" power of "+power+" is "+pow(base, power));
}
}