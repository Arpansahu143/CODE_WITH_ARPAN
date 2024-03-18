
import java.util.*;
public class HomeAssignmentQ1
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of minutes: ");
long m = sc.nextLong();
long day = m/(24*60);
long year = day/365;
long remDay = day %365;
System.out.println(m+" minutes is approximately "+year+" years and "+remDay+"days.");
}
}

