import java.util.Scanner;
class MarksOutOfBoundException extends Exception
{
public MarksOutOfBoundException(String str)
{
System.out.println(str);
}
}
class Student
{
public String name;
public double marks;
public Student(String n,double m)
{
this.name = n;
this.marks = m;
}
public void display() throws Exception
{
if(this.marks>=0 && this.marks<=100)
{
System.out.println(this.name +" has got "+this.marks);
}
else
{
throw new MarksOutOfBoundException("Mark can't be greater than 100");
}
}
}
public class Q3
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the name of the student: ");
String n = sc.next();
System.out.println("Enter marks: ");
double m = sc.nextDouble();
Student s = new Student(n,m);
try
{
s.display();
}
catch(Exception e)
{
System.out.println(e);
}
}
}