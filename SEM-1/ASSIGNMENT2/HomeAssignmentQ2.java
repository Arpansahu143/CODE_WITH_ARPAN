
import java.util.*;
public class HomeAssignmentQ2
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of eggs: ");
int eggs = sc.nextInt();
int gross = eggs/144;
eggs = eggs%144;
int dozon = eggs/12;
eggs = eggs%12;
System.out.println("Your number of eggs is "+gross+" gross, "+dozon+" dozon,and "+eggs);
}
}