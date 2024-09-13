import java.util.Scanner;
class HA3
{
public static int DtoB(int n)
{
if(n<2)
return n;
else
return (n%2)+10*DtoB(n/2);
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the decimal number: ");
int n = sc.nextInt();
System.out.print(“Binary to Decimal of “+n+” is “+DtoB(n));
}
}