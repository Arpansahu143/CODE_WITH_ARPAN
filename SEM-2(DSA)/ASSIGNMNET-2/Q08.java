// Student.java
// package p1;
// public class Student
// {
// String name;
// int roll;
// void input(String n, int r)
// {
// this.name = n;
// this.roll = r;
// }
// void display()
// {
// System.out.println("Name: "+this.name);
// System.out.println("Roll: "+this.roll);
// }
// }
// Test.java
// package p1;
// public class Test extends Student
// {
// public int mark1,mark2;
// public void input(String n, int r, int m1,int m2)
// {
// super.input(n, r);
// this.mark1 = m1;
// this.mark2 = m2;
// }
// public void display()
// {
// super.display();
// System.out.println("Marks 1: "+this.mark1);
// System.out.println("Marks 2: "+this.mark2);
// }
// }
// Sports.java
// package p2;
// public interface Sports
// {
// public char Score1 ='A', Score2 = 'B';
// }
// Q8.java
// import p2.*;
// import p1.*;
// public class Q8 extends Test implements Sports
// {
// public int returnTotal()
// {
// return this.mark1+this.mark2;
// }
// public static void main(String[] args)
// {
// Q10 ob = new Q10();
// ob.input("Sankar",10,50,60);
// ob.display();
// System.out.println("Total marks: "+ob.returnTotal());
// System.out.println("Score 1: "+Score1);
// System.out.println("Score 1: "+Score1);
// }
// }
