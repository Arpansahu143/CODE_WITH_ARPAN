import java.util.*;
public class Q2
{
String[] arr;
public Q2()
{
arr = new String[4];
}
void input()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter 4 colors");
for(int i = 0;i<arr.length;i++)
{
arr[i] = sc.next();
}
}
void str_To_int()
{
throw new NumberFormatException("For input string: \""+arr[0]+"\"");
}
void add_color(String color)throws ArrayIndexOutOfBoundsException
{
arr[arr.length+1]= color;
}
void display()
{
System.out.println("The colors entered are");
for(int i = 0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}
public static void main(String[] args)
{
Q2 q = new Q2();
q.input();
try
{
q.str_To_int();
}
catch(Exception e)
{
System.out.println(e);
}
try
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter one more color: ");
String color = sc.next();
q.add_color(color);
}
catch(Exception e)
{
System.out.println(e);
}
finally
{
q.display();
}
}
}