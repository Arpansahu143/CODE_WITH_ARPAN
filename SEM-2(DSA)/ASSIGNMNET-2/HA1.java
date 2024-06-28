import java.util.*;
class Commission
{
int sales;
public Commission(int sales)
{
this.sales = sales;
}
public double getCommission()
{
if(this.sales<=100)
return this.sales*0.02;
else if(this.sales>100 && this.sales<=5000)
return this.sales*0.05;
else
return this.sales*0.08;
}
}
public class HA1
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the sales amount: ");
int sales = sc.nextInt();
Commission C = new Commission(sales);
double com = C.getCommission();
if(com<0)
System.out.println("Invalid Input");
else
System.out.println("Commission: "+com);
}
}

