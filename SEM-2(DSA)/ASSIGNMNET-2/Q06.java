import java.util.*;
abstract class Marks
{
int markICP, markDSA;
double percentage;
public Marks(int markICP, int markDSA)
{
this.markICP = markICP;
this.markDSA = markDSA;
}
public abstract double getPercentage();
}
class CSE extends Marks
{
int algoDesign;
public CSE(int markICP, int markDSA, int algoDesign)
{
super(markICP, markDSA);
this.algoDesign = algoDesign;
}
public double getPercentage()
{
return (this.markICP+this.markDSA+this.algoDesign)/3.0;
}
}
class Non_CSE extends Marks
{
int enggMechanics;
public Non_CSE(int markICP, int markDSA, int enggMechanics)
{
super(markICP, markDSA);
this.enggMechanics = enggMechanics;
}
public double getPercentage()
{
return (this.markICP+this.markDSA+this.enggMechanics)/3.0;
}
}
class Q06
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Object of CSE student");
System.out.println("Enter the marks of ICP, DSA, and Algorithm: ");
int ICP = sc.nextInt();
int DSA = sc.nextInt();
int AD = sc.nextInt();
CSE c = new CSE(ICP, DSA, AD);
System.out.println("Percentage: "+c.getPercentage());
System.out.println("Object of Non-CSE student");
System.out.println("Enter the marks of ICP, DSA, and Mechanics: ");
ICP = sc.nextInt();
DSA = sc.nextInt();
int M = sc.nextInt();
Non_CSE nc = new Non_CSE(ICP, DSA, M);
System.out.println("Percentage: "+nc.getPercentage());
}
}
